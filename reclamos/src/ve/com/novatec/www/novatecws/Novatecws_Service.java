/**
 * Novatecws_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.novatec.www.novatecws;

public interface Novatecws_Service extends javax.xml.rpc.Service {
    public java.lang.String getnovatecwsSOAPAddress();

    public ve.com.novatec.www.novatecws.Novatecws_PortType getnovatecwsSOAP() throws javax.xml.rpc.ServiceException;

    public ve.com.novatec.www.novatecws.Novatecws_PortType getnovatecwsSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
