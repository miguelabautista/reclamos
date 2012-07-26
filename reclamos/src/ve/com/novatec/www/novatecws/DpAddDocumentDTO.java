/**
 * DpAddDocumentDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.novatec.www.novatecws;

public class DpAddDocumentDTO  implements java.io.Serializable {
    private int mimeId;

    private int folderId;

    private int docTypeId;

    private ve.com.novatec.www.novatecws.Indexes[] indexes;

    private byte[] content;

    public DpAddDocumentDTO() {
    }

    public DpAddDocumentDTO(
           int mimeId,
           int folderId,
           int docTypeId,
           ve.com.novatec.www.novatecws.Indexes[] indexes,
           byte[] content) {
           this.mimeId = mimeId;
           this.folderId = folderId;
           this.docTypeId = docTypeId;
           this.indexes = indexes;
           this.content = content;
    }


    /**
     * Gets the mimeId value for this DpAddDocumentDTO.
     * 
     * @return mimeId
     */
    public int getMimeId() {
        return mimeId;
    }


    /**
     * Sets the mimeId value for this DpAddDocumentDTO.
     * 
     * @param mimeId
     */
    public void setMimeId(int mimeId) {
        this.mimeId = mimeId;
    }


    /**
     * Gets the folderId value for this DpAddDocumentDTO.
     * 
     * @return folderId
     */
    public int getFolderId() {
        return folderId;
    }


    /**
     * Sets the folderId value for this DpAddDocumentDTO.
     * 
     * @param folderId
     */
    public void setFolderId(int folderId) {
        this.folderId = folderId;
    }


    /**
     * Gets the docTypeId value for this DpAddDocumentDTO.
     * 
     * @return docTypeId
     */
    public int getDocTypeId() {
        return docTypeId;
    }


    /**
     * Sets the docTypeId value for this DpAddDocumentDTO.
     * 
     * @param docTypeId
     */
    public void setDocTypeId(int docTypeId) {
        this.docTypeId = docTypeId;
    }


    /**
     * Gets the indexes value for this DpAddDocumentDTO.
     * 
     * @return indexes
     */
    public ve.com.novatec.www.novatecws.Indexes[] getIndexes() {
        return indexes;
    }


    /**
     * Sets the indexes value for this DpAddDocumentDTO.
     * 
     * @param indexes
     */
    public void setIndexes(ve.com.novatec.www.novatecws.Indexes[] indexes) {
        this.indexes = indexes;
    }

    public ve.com.novatec.www.novatecws.Indexes getIndexes(int i) {
        return this.indexes[i];
    }

    public void setIndexes(int i, ve.com.novatec.www.novatecws.Indexes _value) {
        this.indexes[i] = _value;
    }


    /**
     * Gets the content value for this DpAddDocumentDTO.
     * 
     * @return content
     */
    public byte[] getContent() {
        return content;
    }


    /**
     * Sets the content value for this DpAddDocumentDTO.
     * 
     * @param content
     */
    public void setContent(byte[] content) {
        this.content = content;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DpAddDocumentDTO)) return false;
        DpAddDocumentDTO other = (DpAddDocumentDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.mimeId == other.getMimeId() &&
            this.folderId == other.getFolderId() &&
            this.docTypeId == other.getDocTypeId() &&
            ((this.indexes==null && other.getIndexes()==null) || 
             (this.indexes!=null &&
              java.util.Arrays.equals(this.indexes, other.getIndexes()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              java.util.Arrays.equals(this.content, other.getContent())));
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
        _hashCode += getMimeId();
        _hashCode += getFolderId();
        _hashCode += getDocTypeId();
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
        if (getContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContent(), i);
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
        new org.apache.axis.description.TypeDesc(DpAddDocumentDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpAddDocumentDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mimeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "folderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indexes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "Indexes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
