/**
 * ObtenerDocumentoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.novatec.www.novatecws;

public class ObtenerDocumentoRequest  implements java.io.Serializable {
    private ve.com.novatec.www.novatecws.DpUserDTO dpUserDTO;

    private int docId;

    private java.lang.String docOperation;

    private ve.com.novatec.www.novatecws.DpServicesConnectionDTO dpServicesConnectionDTO;

    public ObtenerDocumentoRequest() {
    }

    public ObtenerDocumentoRequest(
           ve.com.novatec.www.novatecws.DpUserDTO dpUserDTO,
           int docId,
           java.lang.String docOperation,
           ve.com.novatec.www.novatecws.DpServicesConnectionDTO dpServicesConnectionDTO) {
           this.dpUserDTO = dpUserDTO;
           this.docId = docId;
           this.docOperation = docOperation;
           this.dpServicesConnectionDTO = dpServicesConnectionDTO;
    }


    /**
     * Gets the dpUserDTO value for this ObtenerDocumentoRequest.
     * 
     * @return dpUserDTO
     */
    public ve.com.novatec.www.novatecws.DpUserDTO getDpUserDTO() {
        return dpUserDTO;
    }


    /**
     * Sets the dpUserDTO value for this ObtenerDocumentoRequest.
     * 
     * @param dpUserDTO
     */
    public void setDpUserDTO(ve.com.novatec.www.novatecws.DpUserDTO dpUserDTO) {
        this.dpUserDTO = dpUserDTO;
    }


    /**
     * Gets the docId value for this ObtenerDocumentoRequest.
     * 
     * @return docId
     */
    public int getDocId() {
        return docId;
    }


    /**
     * Sets the docId value for this ObtenerDocumentoRequest.
     * 
     * @param docId
     */
    public void setDocId(int docId) {
        this.docId = docId;
    }


    /**
     * Gets the docOperation value for this ObtenerDocumentoRequest.
     * 
     * @return docOperation
     */
    public java.lang.String getDocOperation() {
        return docOperation;
    }


    /**
     * Sets the docOperation value for this ObtenerDocumentoRequest.
     * 
     * @param docOperation
     */
    public void setDocOperation(java.lang.String docOperation) {
        this.docOperation = docOperation;
    }


    /**
     * Gets the dpServicesConnectionDTO value for this ObtenerDocumentoRequest.
     * 
     * @return dpServicesConnectionDTO
     */
    public ve.com.novatec.www.novatecws.DpServicesConnectionDTO getDpServicesConnectionDTO() {
        return dpServicesConnectionDTO;
    }


    /**
     * Sets the dpServicesConnectionDTO value for this ObtenerDocumentoRequest.
     * 
     * @param dpServicesConnectionDTO
     */
    public void setDpServicesConnectionDTO(ve.com.novatec.www.novatecws.DpServicesConnectionDTO dpServicesConnectionDTO) {
        this.dpServicesConnectionDTO = dpServicesConnectionDTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObtenerDocumentoRequest)) return false;
        ObtenerDocumentoRequest other = (ObtenerDocumentoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dpUserDTO==null && other.getDpUserDTO()==null) || 
             (this.dpUserDTO!=null &&
              this.dpUserDTO.equals(other.getDpUserDTO()))) &&
            this.docId == other.getDocId() &&
            ((this.docOperation==null && other.getDocOperation()==null) || 
             (this.docOperation!=null &&
              this.docOperation.equals(other.getDocOperation()))) &&
            ((this.dpServicesConnectionDTO==null && other.getDpServicesConnectionDTO()==null) || 
             (this.dpServicesConnectionDTO!=null &&
              this.dpServicesConnectionDTO.equals(other.getDpServicesConnectionDTO())));
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
        if (getDpUserDTO() != null) {
            _hashCode += getDpUserDTO().hashCode();
        }
        _hashCode += getDocId();
        if (getDocOperation() != null) {
            _hashCode += getDocOperation().hashCode();
        }
        if (getDpServicesConnectionDTO() != null) {
            _hashCode += getDpServicesConnectionDTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObtenerDocumentoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">obtenerDocumentoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpUserDTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpUserDTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpUserDTO"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docOperation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docOperation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpServicesConnectionDTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpServicesConnectionDTO"));
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
