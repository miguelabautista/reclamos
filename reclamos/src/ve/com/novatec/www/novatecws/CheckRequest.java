/**
 * CheckRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.novatec.www.novatecws;

public class CheckRequest  implements java.io.Serializable {
    private ve.com.novatec.www.novatecws.DpServicesConnectionDTO dpServicesConnectionDTO;

    public CheckRequest() {
    }

    public CheckRequest(
           ve.com.novatec.www.novatecws.DpServicesConnectionDTO dpServicesConnectionDTO) {
           this.dpServicesConnectionDTO = dpServicesConnectionDTO;
    }


    /**
     * Gets the dpServicesConnectionDTO value for this CheckRequest.
     * 
     * @return dpServicesConnectionDTO
     */
    public ve.com.novatec.www.novatecws.DpServicesConnectionDTO getDpServicesConnectionDTO() {
        return dpServicesConnectionDTO;
    }


    /**
     * Sets the dpServicesConnectionDTO value for this CheckRequest.
     * 
     * @param dpServicesConnectionDTO
     */
    public void setDpServicesConnectionDTO(ve.com.novatec.www.novatecws.DpServicesConnectionDTO dpServicesConnectionDTO) {
        this.dpServicesConnectionDTO = dpServicesConnectionDTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckRequest)) return false;
        CheckRequest other = (CheckRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        if (getDpServicesConnectionDTO() != null) {
            _hashCode += getDpServicesConnectionDTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">checkRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
