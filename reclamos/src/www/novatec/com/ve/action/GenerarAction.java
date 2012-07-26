/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package www.novatec.com.ve.action;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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

import ve.com.novatec.www.novatecws.DpServicesConnectionDTO;
import ve.com.novatec.www.novatecws.DpUserDTO;
import ve.com.novatec.www.novatecws.Novatecws_ServiceLocator;
import ve.com.novatec.www.novatecws.ObtenerDocumentoRequest;
import ve.com.novatec.www.novatecws.ObtenerDocumentoResponse;
import www.novatec.com.ve.dto.ConexionDTO;
import www.novatec.com.ve.form.GenerarForm;

/** 
 * MyEclipse Struts
 * Creation date: 08-04-2010
 * 
 * XDoclet definition:
 * @struts.action path="/generar" name="generarForm" 
 * input="/web/generar.jsp" scope="request" validate="true"
 */
public class GenerarAction extends AbstractApplicationAction {
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
		Logger.getLogger(GenerarAction.class);
	
	public ActionForward executeSpecificTask(final ActionMapping mapping, 
			final ActionForm form,
			final HttpServletRequest request, 
			final HttpServletResponse response) {
		final GenerarForm generarForm = (GenerarForm) form;// TODO Auto-generated method stub
		
		
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
		final Novatecws_ServiceLocator locator =  new Novatecws_ServiceLocator();
		/*
		 *login y passeword del usuario usuario 
		 */
		final DpUserDTO dpUserDTO =  (DpUserDTO)
			request.getSession().getAttribute("user");
		/*
		 * operacion de generacion documento
		 */
		String docOperacion = new String("VIEW");
		
		/*
		 * resultado de busqueda del documento
		 */
		ObtenerDocumentoResponse documentoResponse = null;
		
		final ObtenerDocumentoRequest obtenerDocRequest = 
			new ObtenerDocumentoRequest(
					dpUserDTO, 
					generarForm.getIdDoc(), 
					docOperacion, 
					connectionDTO);
		
		try {
			documentoResponse = 
				locator.getnovatecwsSOAP().obtenerDocumento(
						obtenerDocRequest);
			
			if(documentoResponse!=null){
				byte[] datos;
				try {
					datos = 
						new byte[
						         documentoResponse.
						         getDpDocumentDTO().getContent().length];
				} catch (Exception e) {
					// TODO: handle exception
					final ActionErrors actionErrors = new ActionErrors();
					actionErrors.add("errors", 
							new ActionMessage("busqueda.documento"));
					saveErrors(request, actionErrors);
					request.setAttribute("busqueda", 
							request.getSession().getAttribute("busqueda"));
					return mapping.findForward("failure");
				}
				 
				
				datos = documentoResponse.getDpDocumentDTO().getContent();
				
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
	
	            
				final StringBuilder sbFilename = new StringBuilder();
				sbFilename.append("CCR");
				sbFilename.append(generarForm.getIdDoc());
				sbFilename.append(".tiff");
				
				final StringBuffer sbContentDispValue = new StringBuffer();
				sbContentDispValue.append("attachment");
				sbContentDispValue.append("; filename=");
				sbContentDispValue.append(sbFilename);
				
	            response.setHeader("Cache-Control",
	            		"must-revalidate, post-check=0, pre-check=0");
	            response.setHeader("Pragma", "public");
	            // Configuramos el content type
	            response.setHeader("Cache-Control", "max-age=30");			
				response.setContentType("image/tiff");
	            // Tamaño
	            response.setContentLength(datos.length);
	            
	            response.setHeader(
	    				"Content-disposition",
	    				sbContentDispValue.toString());
	            
	           
	            OutputStream os;
				try {
					os = response.getOutputStream();
					baos.write(datos);
					baos.writeTo(os);
		            os.flush();
		            os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					LOG_PANTALLA.error(e);
				}
			}else{
				final ActionErrors actionErrors = new ActionErrors();
				actionErrors.add("errors", 
						new ActionMessage("busqueda.sinDocumento"));
				saveErrors(request, actionErrors);
				request.setAttribute("busqueda", 
						request.getSession().getAttribute("busqueda"));
				return mapping.findForward("failure");
			}
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			LOG_PANTALLA.error(e);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			LOG_PANTALLA.error(e);
		}
		return null;
	}
	
}