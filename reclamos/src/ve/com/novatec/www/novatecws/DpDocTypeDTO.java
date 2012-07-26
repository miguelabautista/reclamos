/**
 * DpDocTypeDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.novatec.www.novatecws;

public class DpDocTypeDTO  implements java.io.Serializable {
    private int id;

    private java.lang.String name;

    private ve.com.novatec.www.novatecws.DpIndexLoginDTO[] indexes;

    public DpDocTypeDTO() {
    }

    public DpDocTypeDTO(
           int id,
           java.lang.String name,
           ve.com.novatec.www.novatecws.DpIndexLoginDTO[] indexes) {
           this.id = id;
           this.name = name;
           this.indexes = indexes;
    }


    /**
     * Gets the id value for this DpDocTypeDTO.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this DpDocTypeDTO.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this DpDocTypeDTO.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DpDocTypeDTO.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the indexes value for this DpDocTypeDTO.
     * 
     * @return indexes
     */
    public ve.com.novatec.www.novatecws.DpIndexLoginDTO[] getIndexes() {
        return indexes;
    }


    /**
     * Sets the indexes value for this DpDocTypeDTO.
     * 
     * @param indexes
     */
    public void setIndexes(ve.com.novatec.www.novatecws.DpIndexLoginDTO[] indexes) {
        this.indexes = indexes;
    }

    public ve.com.novatec.www.novatecws.DpIndexLoginDTO getIndexes(int i) {
        return this.indexes[i];
    }

    public void setIndexes(int i, ve.com.novatec.www.novatecws.DpIndexLoginDTO _value) {
        this.indexes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DpDocTypeDTO)) return false;
        DpDocTypeDTO other = (DpDocTypeDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.indexes==null && other.getIndexes()==null) || 
             (this.indexes!=null &&
              java.util.Arrays.equals(this.indexes, other.getIndexes())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DpDocTypeDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpDocTypeDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indexes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpIndexLoginDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
