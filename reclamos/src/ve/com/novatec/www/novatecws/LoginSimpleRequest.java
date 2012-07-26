/**
 * LoginSimpleRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.novatec.www.novatecws;

public class LoginSimpleRequest  implements java.io.Serializable {
    private ve.com.novatec.www.novatecws.DpUserDTO dpUserDTO;

    private ve.com.novatec.www.novatecws.DpServicesConnectionDTO dpServicesConnectionDTO;

    public LoginSimpleRequest() {
    }

    public LoginSimpleRequest(
           ve.com.novatec.www.novatecws.DpUserDTO dpUserDTO,
           ve.com.novatec.www.novatecws.DpServicesConnectionDTO dpServicesConnectionDTO) {
           this.dpUserDTO = dpUserDTO;
           this.dpServicesConnectionDTO = dpServicesConnectionDTO;
    }


    /**
     * Gets the dpUserDTO value for this LoginSimpleRequest.
     * 
     * @return dpUserDTO
     */
    public ve.com.novatec.www.novatecws.DpUserDTO getDpUserDTO() {
        return dpUserDTO;
    }


    /**
     * Sets the dpUserDTO value for this LoginSimpleRequest.
     * 
     * @param dpUserDTO
     */
    public void setDpUserDTO(ve.com.novatec.www.novatecws.DpUserDTO dpUserDTO) {
        this.dpUserDTO = dpUserDTO;
    }


    /**
     * Gets the dpServicesConnectionDTO value for this LoginSimpleRequest.
     * 
     * @return dpServicesConnectionDTO
     */
    public ve.com.novatec.www.novatecws.DpServicesConnectionDTO getDpServicesConnectionDTO() {
        return dpServicesConnectionDTO;
    }


    /**
     * Sets the dpServicesConnectionDTO value for this LoginSimpleRequest.
     * 
     * @param dpServicesConnectionDTO
     */
    public void setDpServicesConnectionDTO(ve.com.novatec.www.novatecws.DpServicesConnectionDTO dpServicesConnectionDTO) {
        this.dpServicesConnectionDTO = dpServicesConnectionDTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoginSimpleRequest)) return false;
        LoginSimpleRequest other = (LoginSimpleRequest) obj;
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
        if (getDpServicesConnectionDTO() != null) {
            _hashCode += getDpServicesConnectionDTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoginSimpleRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">loginSimpleRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpUserDTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpUserDTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpUserDTO"));
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
