/**
 * AgregarDocumentoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.novatec.www.novatecws;

public class AgregarDocumentoRequest  implements java.io.Serializable {
    private ve.com.novatec.www.novatecws.DpAddDocumentDTO addDocument;

    private ve.com.novatec.www.novatecws.DpUserDTO dpUser;

    private ve.com.novatec.www.novatecws.DpServicesConnectionDTO dpServicesConnection;

    public AgregarDocumentoRequest() {
    }

    public AgregarDocumentoRequest(
           ve.com.novatec.www.novatecws.DpAddDocumentDTO addDocument,
           ve.com.novatec.www.novatecws.DpUserDTO dpUser,
           ve.com.novatec.www.novatecws.DpServicesConnectionDTO dpServicesConnection) {
           this.addDocument = addDocument;
           this.dpUser = dpUser;
           this.dpServicesConnection = dpServicesConnection;
    }


    /**
     * Gets the addDocument value for this AgregarDocumentoRequest.
     * 
     * @return addDocument
     */
    public ve.com.novatec.www.novatecws.DpAddDocumentDTO getAddDocument() {
        return addDocument;
    }


    /**
     * Sets the addDocument value for this AgregarDocumentoRequest.
     * 
     * @param addDocument
     */
    public void setAddDocument(ve.com.novatec.www.novatecws.DpAddDocumentDTO addDocument) {
        this.addDocument = addDocument;
    }


    /**
     * Gets the dpUser value for this AgregarDocumentoRequest.
     * 
     * @return dpUser
     */
    public ve.com.novatec.www.novatecws.DpUserDTO getDpUser() {
        return dpUser;
    }


    /**
     * Sets the dpUser value for this AgregarDocumentoRequest.
     * 
     * @param dpUser
     */
    public void setDpUser(ve.com.novatec.www.novatecws.DpUserDTO dpUser) {
        this.dpUser = dpUser;
    }


    /**
     * Gets the dpServicesConnection value for this AgregarDocumentoRequest.
     * 
     * @return dpServicesConnection
     */
    public ve.com.novatec.www.novatecws.DpServicesConnectionDTO getDpServicesConnection() {
        return dpServicesConnection;
    }


    /**
     * Sets the dpServicesConnection value for this AgregarDocumentoRequest.
     * 
     * @param dpServicesConnection
     */
    public void setDpServicesConnection(ve.com.novatec.www.novatecws.DpServicesConnectionDTO dpServicesConnection) {
        this.dpServicesConnection = dpServicesConnection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AgregarDocumentoRequest)) return false;
        AgregarDocumentoRequest other = (AgregarDocumentoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addDocument==null && other.getAddDocument()==null) || 
             (this.addDocument!=null &&
              this.addDocument.equals(other.getAddDocument()))) &&
            ((this.dpUser==null && other.getDpUser()==null) || 
             (this.dpUser!=null &&
              this.dpUser.equals(other.getDpUser()))) &&
            ((this.dpServicesConnection==null && other.getDpServicesConnection()==null) || 
             (this.dpServicesConnection!=null &&
              this.dpServicesConnection.equals(other.getDpServicesConnection())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAddDocument() != null) {
            _hashCode += getAddDocument().hashCode();
        }
        if (getDpUser() != null) {
            _hashCode += getDpUser().hashCode();
        }
        if (getDpServicesConnection() != null) {
            _hashCode += getDpServicesConnection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AgregarDocumentoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">agregarDocumentoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpAddDocumentDTO"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpUserDTO"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpServicesConnection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpServicesConnection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpServicesConnectionDTO"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
