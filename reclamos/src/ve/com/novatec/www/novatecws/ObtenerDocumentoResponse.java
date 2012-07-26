/**
 * ObtenerDocumentoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.novatec.www.novatecws;

public class ObtenerDocumentoResponse  implements java.io.Serializable {
    private ve.com.novatec.www.novatecws.DpDocumentGenerarDTO dpDocumentDTO;

    public ObtenerDocumentoResponse() {
    }

    public ObtenerDocumentoResponse(
           ve.com.novatec.www.novatecws.DpDocumentGenerarDTO dpDocumentDTO) {
           this.dpDocumentDTO = dpDocumentDTO;
    }


    /**
     * Gets the dpDocumentDTO value for this ObtenerDocumentoResponse.
     * 
     * @return dpDocumentDTO
     */
    public ve.com.novatec.www.novatecws.DpDocumentGenerarDTO getDpDocumentDTO() {
        return dpDocumentDTO;
    }


    /**
     * Sets the dpDocumentDTO value for this ObtenerDocumentoResponse.
     * 
     * @param dpDocumentDTO
     */
    public void setDpDocumentDTO(ve.com.novatec.www.novatecws.DpDocumentGenerarDTO dpDocumentDTO) {
        this.dpDocumentDTO = dpDocumentDTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObtenerDocumentoResponse)) return false;
        ObtenerDocumentoResponse other = (ObtenerDocumentoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dpDocumentDTO==null && other.getDpDocumentDTO()==null) || 
             (this.dpDocumentDTO!=null &&
              this.dpDocumentDTO.equals(other.getDpDocumentDTO())));
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
        if (getDpDocumentDTO() != null) {
            _hashCode += getDpDocumentDTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObtenerDocumentoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">obtenerDocumentoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpDocumentDTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpDocumentDTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpDocumentGenerarDTO"));
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
