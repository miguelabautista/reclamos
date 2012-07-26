/**
 * Novatecws_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.novatec.www.novatecws;

public interface Novatecws_PortType extends java.rmi.Remote {
    public ve.com.novatec.www.novatecws.CheckResponse check(ve.com.novatec.www.novatecws.CheckRequest checkRequest) throws java.rmi.RemoteException;
    public ve.com.novatec.www.novatecws.BuscarDocumentosResponse buscarDocumentos(ve.com.novatec.www.novatecws.BuscarDocumentosRequest buscarDocumentosRequest) throws java.rmi.RemoteException;
    public ve.com.novatec.www.novatecws.ObtenerDocumentoResponse obtenerDocumento(ve.com.novatec.www.novatecws.ObtenerDocumentoRequest obtenerDocumentoRequest) throws java.rmi.RemoteException;
    public ve.com.novatec.www.novatecws.LoginResponse login(ve.com.novatec.www.novatecws.LoginRequest loginRequest) throws java.rmi.RemoteException;
    public ve.com.novatec.www.novatecws.LoginSimpleResponse loginSimple(ve.com.novatec.www.novatecws.LoginSimpleRequest loginSimpleRequest) throws java.rmi.RemoteException;
    public ve.com.novatec.www.novatecws.AgregarDocumentoResponse agregarDocumento(ve.com.novatec.www.novatecws.AgregarDocumentoRequest agregarDocumentoRequest) throws java.rmi.RemoteException;
    public ve.com.novatec.www.novatecws.BorrarDocumentoResponse borrarDocumento(ve.com.novatec.www.novatecws.BorrarDocumentoRequest borrarDocumentoRequest) throws java.rmi.RemoteException;
}
