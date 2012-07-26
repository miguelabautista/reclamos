/**
 * DpServicesConnectionDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.novatec.www.novatecws;

public class DpServicesConnectionDTO  implements java.io.Serializable {
    private java.lang.String hostDocPath;

    private int portDocPath;

    public DpServicesConnectionDTO() {
    }

    public DpServicesConnectionDTO(
           java.lang.String hostDocPath,
           int portDocPath) {
           this.hostDocPath = hostDocPath;
           this.portDocPath = portDocPath;
    }


    /**
     * Gets the hostDocPath value for this DpServicesConnectionDTO.
     * 
     * @return hostDocPath
     */
    public java.lang.String getHostDocPath() {
        return hostDocPath;
    }


    /**
     * Sets the hostDocPath value for this DpServicesConnectionDTO.
     * 
     * @param hostDocPath
     */
    public void setHostDocPath(java.lang.String hostDocPath) {
        this.hostDocPath = hostDocPath;
    }


    /**
     * Gets the portDocPath value for this DpServicesConnectionDTO.
     * 
     * @return portDocPath
     */
    public int getPortDocPath() {
        return portDocPath;
    }


    /**
     * Sets the portDocPath value for this DpServicesConnectionDTO.
     * 
     * @param portDocPath
     */
    public void setPortDocPath(int portDocPath) {
        this.portDocPath = portDocPath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DpServicesConnectionDTO)) return false;
        DpServicesConnectionDTO other = (DpServicesConnectionDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostDocPath==null && other.getHostDocPath()==null) || 
             (this.hostDocPath!=null &&
              this.hostDocPath.equals(other.getHostDocPath()))) &&
            this.portDocPath == other.getPortDocPath();
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
        if (getHostDocPath() != null) {
            _hashCode += getHostDocPath().hashCode();
        }
        _hashCode += getPortDocPath();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DpServicesConnectionDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpServicesConnectionDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostDocPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostDocPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portDocPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portDocPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
