package ve.com.novatec.www.novatecws;

public class NovatecwsProxy implements ve.com.novatec.www.novatecws.Novatecws_PortType {
  private String _endpoint = null;
  private ve.com.novatec.www.novatecws.Novatecws_PortType novatecws_PortType = null;
  
  public NovatecwsProxy() {
    _initNovatecwsProxy();
  }
  
  public NovatecwsProxy(String endpoint) {
    _endpoint = endpoint;
    _initNovatecwsProxy();
  }
  
  private void _initNovatecwsProxy() {
    try {
      novatecws_PortType = (new ve.com.novatec.www.novatecws.Novatecws_ServiceLocator()).getnovatecwsSOAP();
      if (novatecws_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)novatecws_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)novatecws_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (novatecws_PortType != null)
      ((javax.xml.rpc.Stub)novatecws_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ve.com.novatec.www.novatecws.Novatecws_PortType getNovatecws_PortType() {
    if (novatecws_PortType == null)
      _initNovatecwsProxy();
    return novatecws_PortType;
  }
  
  public ve.com.novatec.www.novatecws.CheckResponse check(ve.com.novatec.www.novatecws.CheckRequest checkRequest) throws java.rmi.RemoteException{
    if (novatecws_PortType == null)
      _initNovatecwsProxy();
    return novatecws_PortType.check(checkRequest);
  }
  
  public ve.com.novatec.www.novatecws.BuscarDocumentosResponse buscarDocumentos(ve.com.novatec.www.novatecws.BuscarDocumentosRequest buscarDocumentosRequest) throws java.rmi.RemoteException{
    if (novatecws_PortType == null)
      _initNovatecwsProxy();
    return novatecws_PortType.buscarDocumentos(buscarDocumentosRequest);
  }
  
  public ve.com.novatec.www.novatecws.ObtenerDocumentoResponse obtenerDocumento(ve.com.novatec.www.novatecws.ObtenerDocumentoRequest obtenerDocumentoRequest) throws java.rmi.RemoteException{
    if (novatecws_PortType == null)
      _initNovatecwsProxy();
    return novatecws_PortType.obtenerDocumento(obtenerDocumentoRequest);
  }
  
  public ve.com.novatec.www.novatecws.LoginResponse login(ve.com.novatec.www.novatecws.LoginRequest loginRequest) throws java.rmi.RemoteException{
    if (novatecws_PortType == null)
      _initNovatecwsProxy();
    return novatecws_PortType.login(loginRequest);
  }
  
  public ve.com.novatec.www.novatecws.LoginSimpleResponse loginSimple(ve.com.novatec.www.novatecws.LoginSimpleRequest loginSimpleRequest) throws java.rmi.RemoteException{
    if (novatecws_PortType == null)
      _initNovatecwsProxy();
    return novatecws_PortType.loginSimple(loginSimpleRequest);
  }
  
  public ve.com.novatec.www.novatecws.AgregarDocumentoResponse agregarDocumento(ve.com.novatec.www.novatecws.AgregarDocumentoRequest agregarDocumentoRequest) throws java.rmi.RemoteException{
    if (novatecws_PortType == null)
      _initNovatecwsProxy();
    return novatecws_PortType.agregarDocumento(agregarDocumentoRequest);
  }
  
  public ve.com.novatec.www.novatecws.BorrarDocumentoResponse borrarDocumento(ve.com.novatec.www.novatecws.BorrarDocumentoRequest borrarDocumentoRequest) throws java.rmi.RemoteException{
    if (novatecws_PortType == null)
      _initNovatecwsProxy();
    return novatecws_PortType.borrarDocumento(borrarDocumentoRequest);
  }
  
  
}