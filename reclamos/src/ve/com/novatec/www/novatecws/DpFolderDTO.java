/**
 * DpFolderDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.novatec.www.novatecws;

public class DpFolderDTO  implements java.io.Serializable {
    private int id;

    private int idParent;

    private java.lang.String descFolder;

    public DpFolderDTO() {
    }

    public DpFolderDTO(
           int id,
           int idParent,
           java.lang.String descFolder) {
           this.id = id;
           this.idParent = idParent;
           this.descFolder = descFolder;
    }


    /**
     * Gets the id value for this DpFolderDTO.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this DpFolderDTO.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the idParent value for this DpFolderDTO.
     * 
     * @return idParent
     */
    public int getIdParent() {
        return idParent;
    }


    /**
     * Sets the idParent value for this DpFolderDTO.
     * 
     * @param idParent
     */
    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }


    /**
     * Gets the descFolder value for this DpFolderDTO.
     * 
     * @return descFolder
     */
    public java.lang.String getDescFolder() {
        return descFolder;
    }


    /**
     * Sets the descFolder value for this DpFolderDTO.
     * 
     * @param descFolder
     */
    public void setDescFolder(java.lang.String descFolder) {
        this.descFolder = descFolder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DpFolderDTO)) return false;
        DpFolderDTO other = (DpFolderDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            this.idParent == other.getIdParent() &&
            ((this.descFolder==null && other.getDescFolder()==null) || 
             (this.descFolder!=null &&
              this.descFolder.equals(other.getDescFolder())));
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
        _hashCode += getId();
        _hashCode += getIdParent();
        if (getDescFolder() != null) {
            _hashCode += getDescFolder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DpFolderDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpFolderDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idParent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
