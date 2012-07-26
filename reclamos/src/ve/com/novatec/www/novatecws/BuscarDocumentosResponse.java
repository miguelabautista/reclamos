/**
 * BuscarDocumentosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.novatec.www.novatecws;

public class BuscarDocumentosResponse  implements java.io.Serializable {
    private ve.com.novatec.www.novatecws.DpDocumentInfoDTO[] documenteInfo;

    public BuscarDocumentosResponse() {
    }

    public BuscarDocumentosResponse(
           ve.com.novatec.www.novatecws.DpDocumentInfoDTO[] documenteInfo) {
           this.documenteInfo = documenteInfo;
    }


    /**
     * Gets the documenteInfo value for this BuscarDocumentosResponse.
     * 
     * @return documenteInfo
     */
    public ve.com.novatec.www.novatecws.DpDocumentInfoDTO[] getDocumenteInfo() {
        return documenteInfo;
    }


    /**
     * Sets the documenteInfo value for this BuscarDocumentosResponse.
     * 
     * @param documenteInfo
     */
    public void setDocumenteInfo(ve.com.novatec.www.novatecws.DpDocumentInfoDTO[] documenteInfo) {
        this.documenteInfo = documenteInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BuscarDocumentosResponse)) return false;
        BuscarDocumentosResponse other = (BuscarDocumentosResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documenteInfo==null && other.getDocumenteInfo()==null) || 
             (this.documenteInfo!=null &&
              java.util.Arrays.equals(this.documenteInfo, other.getDocumenteInfo())));
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
        if (getDocumenteInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumenteInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumenteInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BuscarDocumentosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">buscarDocumentosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documenteInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documenteInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpDocumentInfoDTO"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
