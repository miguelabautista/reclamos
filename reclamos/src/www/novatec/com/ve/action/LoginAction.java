/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package www.novatec.com.ve.action;

import java.rmi.RemoteException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ve.com.novatec.www.novatecws.CheckRequest;
import ve.com.novatec.www.novatecws.CheckResponse;
import ve.com.novatec.www.novatecws.DpServicesConnectionDTO;
import ve.com.novatec.www.novatecws.Novatecws_ServiceLocator;
import www.novatec.com.ve.dto.ConexionDTO;



/** 
 * MyEclipse Struts
 * Creation date: 07-30-2010
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 * @struts.action-forward name="success" path="/web/acceso.jsp"
 */
public class LoginAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */

	
	private final static Logger LOG_PANTALLA = 
		Logger.getLogger(LoginAction.class);
	
	public ActionForward execute(final ActionMapping mapping, 
			final ActionForm form,
			final HttpServletRequest request, 
			final HttpServletResponse response) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure(
				getClass().getResource("log4j.properties"));
		/*
		 * Borrar sesion
		 */
		final HttpSession session = request.getSession();
		session.invalidate();
		/*
		 * Intancia de la clase que invoca los metodos del web servcices
		 */
		final Novatecws_ServiceLocator locator = new Novatecws_ServiceLocator();
		/*
		 * Intacia del tipo de dato que retorna el metodo check y es
		 * inicilizado en false
		 */
		CheckResponse checkResponse = new CheckResponse(false);
		try {
			
			/*
			 * Intancias del servicesConnection donde se especifica 
			 * el puerto y el ip de la connecion
			 */
			final DpServicesConnectionDTO connectionDTO = 
				new DpServicesConnectionDTO(
						ConexionDTO.getHost(
								getServlet().getInitParameter("ip docpath")), 
						ConexionDTO.getPort(
								Integer.parseInt(
										getServlet().getInitParameter("port"))));
			/*
			 * Invoca al web services el metodo check
			 * que verifica si el servicio esta del docPath esta en ejecucion
			 */
			
			final CheckRequest checkRequest =  new CheckRequest(connectionDTO);
			checkResponse = locator.getnovatecwsSOAP().check(checkRequest);
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			LOG_PANTALLA.error(e);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			LOG_PANTALLA.error(e);
		}
		if(!checkResponse.isDpServicesConnection()){
			return mapping.findForward("fueraServicio");
		}
		return mapping.findForward("success");
	}
}