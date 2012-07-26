/**
 * DpDocumentInfoDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.novatec.www.novatecws;

public class DpDocumentInfoDTO  implements java.io.Serializable {
    private int id;

    private int length;

    private int mimeId;

    private ve.com.novatec.www.novatecws.DpIndexDTO[] indexes;

    private java.lang.String folder;

    public DpDocumentInfoDTO() {
    }

    public DpDocumentInfoDTO(
           int id,
           int length,
           int mimeId,
           ve.com.novatec.www.novatecws.DpIndexDTO[] indexes,
           java.lang.String folder) {
           this.id = id;
           this.length = length;
           this.mimeId = mimeId;
           this.indexes = indexes;
           this.folder = folder;
    }


    /**
     * Gets the id value for this DpDocumentInfoDTO.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this DpDocumentInfoDTO.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the length value for this DpDocumentInfoDTO.
     * 
     * @return length
     */
    public int getLength() {
        return length;
    }


    /**
     * Sets the length value for this DpDocumentInfoDTO.
     * 
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }


    /**
     * Gets the mimeId value for this DpDocumentInfoDTO.
     * 
     * @return mimeId
     */
    public int getMimeId() {
        return mimeId;
    }


    /**
     * Sets the mimeId value for this DpDocumentInfoDTO.
     * 
     * @param mimeId
     */
    public void setMimeId(int mimeId) {
        this.mimeId = mimeId;
    }


    /**
     * Gets the indexes value for this DpDocumentInfoDTO.
     * 
     * @return indexes
     */
    public ve.com.novatec.www.novatecws.DpIndexDTO[] getIndexes() {
        return indexes;
    }


    /**
     * Sets the indexes value for this DpDocumentInfoDTO.
     * 
     * @param indexes
     */
    public void setIndexes(ve.com.novatec.www.novatecws.DpIndexDTO[] indexes) {
        this.indexes = indexes;
    }

    public ve.com.novatec.www.novatecws.DpIndexDTO getIndexes(int i) {
        return this.indexes[i];
    }

    public void setIndexes(int i, ve.com.novatec.www.novatecws.DpIndexDTO _value) {
        this.indexes[i] = _value;
    }


    /**
     * Gets the folder value for this DpDocumentInfoDTO.
     * 
     * @return folder
     */
    public java.lang.String getFolder() {
        return folder;
    }


    /**
     * Sets the folder value for this DpDocumentInfoDTO.
     * 
     * @param folder
     */
    public void setFolder(java.lang.String folder) {
        this.folder = folder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DpDocumentInfoDTO)) return false;
        DpDocumentInfoDTO other = (DpDocumentInfoDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            this.length == other.getLength() &&
            this.mimeId == other.getMimeId() &&
            ((this.indexes==null && other.getIndexes()==null) || 
             (this.indexes!=null &&
              java.util.Arrays.equals(this.indexes, other.getIndexes()))) &&
            ((this.folder==null && other.getFolder()==null) || 
             (this.folder!=null &&
              this.folder.equals(other.getFolder())));
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
        _hashCode += getLength();
        _hashCode += getMimeId();
        if (getIndexes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndexes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndexes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFolder() != null) {
            _hashCode += getFolder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DpDocumentInfoDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpDocumentInfoDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mimeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indexes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpIndexDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "folder"));
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
