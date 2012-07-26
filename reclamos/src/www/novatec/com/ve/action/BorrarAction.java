package www.novatec.com.ve.action;

import java.rmi.RemoteException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import org.apache.log4j.Logger;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import ve.com.novatec.www.novatecws.BorrarDocumentoRequest;
import ve.com.novatec.www.novatecws.BorrarDocumentoResponse;
import ve.com.novatec.www.novatecws.DpServicesConnectionDTO;
import ve.com.novatec.www.novatecws.DpUserDTO;
import ve.com.novatec.www.novatecws.Novatecws_ServiceLocator;
import www.novatec.com.ve.dto.ConexionDTO;

public class BorrarAction extends AbstractApplicationAction {

	/*
	 * LOGGER
	 */
	private final static Logger LOG_PANTALLA = 
		Logger.getLogger(BorrarAction.class);
	
	
	@Override
	public ActionForward executeSpecificTask(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		/*
		 * Declaranco variables de I/O
		 */
		BorrarDocumentoRequest borrarDocRequest = null;
		BorrarDocumentoResponse borrarDocResponse = null;
		int docId;
		int borrado;
		
		
		/*
		 * Recibiendo paraetro por el request
		 */
		
		try {
			docId =Integer.parseInt(request.getParameter("id"));
			borrado = Integer.parseInt(request.getSession().getAttribute("borrado").toString());
		} catch (Exception e) {
			// TODO: handle exception
			LOG_PANTALLA.error("BORRAR: dato invalido "+e);
			final ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("errors", new ActionMessage("borrar.error"));
			saveErrors(request, actionErrors);
			return mapping.findForward("success");
		}
		
		if(borrado<=3){
			LOG_PANTALLA.error("PERMISOS...");
			final ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("errors", new ActionMessage("borrar.error"));
			saveErrors(request, actionErrors);
			return mapping.findForward("success");
		}
		
		
		
		
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
		 * Intanciando clases para invocar el web services
		 */
		
		final Novatecws_ServiceLocator locator = new Novatecws_ServiceLocator();
		
		/*
		 * Usuario en sesion
		 */
		final DpUserDTO dpUserDTO =  (DpUserDTO)
			request.getSession().getAttribute("user");
		
		borrarDocRequest = new BorrarDocumentoRequest(connectionDTO, 
				dpUserDTO, docId);
		/*
		 * Ejecutando borrado
		 */
		try {
			borrarDocResponse = locator.getnovatecwsSOAP().borrarDocumento(
					borrarDocRequest);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			LOG_PANTALLA.error(e);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			LOG_PANTALLA.error(e);
		}
		
		if(borrarDocResponse.isDato()){
			final ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("exito", new ActionMessage("borrar.exito"));
			saveErrors(request, actionErrors);
		}else{
			final ActionErrors actionErrors = new ActionErrors();
			actionErrors.add("error", new ActionMessage("borrar.error"));
			saveErrors(request, actionErrors);
		}
		return mapping.findForward("success");
	}

}
