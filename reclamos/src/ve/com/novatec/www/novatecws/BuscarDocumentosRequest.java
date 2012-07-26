/**
 * BuscarDocumentosRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.novatec.www.novatecws;

public class BuscarDocumentosRequest  implements java.io.Serializable {
    private ve.com.novatec.www.novatecws.DpUserDTO dpUserDTO;

    private int maxDocs;

    private int docTypeId;

    private ve.com.novatec.www.novatecws.Indexes[] indexes;

    private int idFolder;

    private boolean subFolders;

    private ve.com.novatec.www.novatecws.DpServicesConnectionDTO dpServicesConnectionDTO;

    public BuscarDocumentosRequest() {
    }

    public BuscarDocumentosRequest(
           ve.com.novatec.www.novatecws.DpUserDTO dpUserDTO,
           int maxDocs,
           int docTypeId,
           ve.com.novatec.www.novatecws.Indexes[] indexes,
           int idFolder,
           boolean subFolders,
           ve.com.novatec.www.novatecws.DpServicesConnectionDTO dpServicesConnectionDTO) {
           this.dpUserDTO = dpUserDTO;
           this.maxDocs = maxDocs;
           this.docTypeId = docTypeId;
           this.indexes = indexes;
           this.idFolder = idFolder;
           this.subFolders = subFolders;
           this.dpServicesConnectionDTO = dpServicesConnectionDTO;
    }


    /**
     * Gets the dpUserDTO value for this BuscarDocumentosRequest.
     * 
     * @return dpUserDTO
     */
    public ve.com.novatec.www.novatecws.DpUserDTO getDpUserDTO() {
        return dpUserDTO;
    }


    /**
     * Sets the dpUserDTO value for this BuscarDocumentosRequest.
     * 
     * @param dpUserDTO
     */
    public void setDpUserDTO(ve.com.novatec.www.novatecws.DpUserDTO dpUserDTO) {
        this.dpUserDTO = dpUserDTO;
    }


    /**
     * Gets the maxDocs value for this BuscarDocumentosRequest.
     * 
     * @return maxDocs
     */
    public int getMaxDocs() {
        return maxDocs;
    }


    /**
     * Sets the maxDocs value for this BuscarDocumentosRequest.
     * 
     * @param maxDocs
     */
    public void setMaxDocs(int maxDocs) {
        this.maxDocs = maxDocs;
    }


    /**
     * Gets the docTypeId value for this BuscarDocumentosRequest.
     * 
     * @return docTypeId
     */
    public int getDocTypeId() {
        return docTypeId;
    }


    /**
     * Sets the docTypeId value for this BuscarDocumentosRequest.
     * 
     * @param docTypeId
     */
    public void setDocTypeId(int docTypeId) {
        this.docTypeId = docTypeId;
    }


    /**
     * Gets the indexes value for this BuscarDocumentosRequest.
     * 
     * @return indexes
     */
    public ve.com.novatec.www.novatecws.Indexes[] getIndexes() {
        return indexes;
    }


    /**
     * Sets the indexes value for this BuscarDocumentosRequest.
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
     * Gets the idFolder value for this BuscarDocumentosRequest.
     * 
     * @return idFolder
     */
    public int getIdFolder() {
        return idFolder;
    }


    /**
     * Sets the idFolder value for this BuscarDocumentosRequest.
     * 
     * @param idFolder
     */
    public void setIdFolder(int idFolder) {
        this.idFolder = idFolder;
    }


    /**
     * Gets the subFolders value for this BuscarDocumentosRequest.
     * 
     * @return subFolders
     */
    public boolean isSubFolders() {
        return subFolders;
    }


    /**
     * Sets the subFolders value for this BuscarDocumentosRequest.
     * 
     * @param subFolders
     */
    public void setSubFolders(boolean subFolders) {
        this.subFolders = subFolders;
    }


    /**
     * Gets the dpServicesConnectionDTO value for this BuscarDocumentosRequest.
     * 
     * @return dpServicesConnectionDTO
     */
    public ve.com.novatec.www.novatecws.DpServicesConnectionDTO getDpServicesConnectionDTO() {
        return dpServicesConnectionDTO;
    }


    /**
     * Sets the dpServicesConnectionDTO value for this BuscarDocumentosRequest.
     * 
     * @param dpServicesConnectionDTO
     */
    public void setDpServicesConnectionDTO(ve.com.novatec.www.novatecws.DpServicesConnectionDTO dpServicesConnectionDTO) {
        this.dpServicesConnectionDTO = dpServicesConnectionDTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BuscarDocumentosRequest)) return false;
        BuscarDocumentosRequest other = (BuscarDocumentosRequest) obj;
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
            this.maxDocs == other.getMaxDocs() &&
            this.docTypeId == other.getDocTypeId() &&
            ((this.indexes==null && other.getIndexes()==null) || 
             (this.indexes!=null &&
              java.util.Arrays.equals(this.indexes, other.getIndexes()))) &&
            this.idFolder == other.getIdFolder() &&
            this.subFolders == other.isSubFolders() &&
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
        _hashCode += getMaxDocs();
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
        _hashCode += getIdFolder();
        _hashCode += (isSubFolders() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDpServicesConnectionDTO() != null) {
            _hashCode += getDpServicesConnectionDTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BuscarDocumentosRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", ">buscarDocumentosRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpUserDTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpUserDTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpUserDTO"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDocs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxDocs"));
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
        elemField.setFieldName("idFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subFolders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subFolders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
