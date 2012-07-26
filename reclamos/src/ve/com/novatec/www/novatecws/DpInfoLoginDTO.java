/**
 * DpInfoLoginDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ve.com.novatec.www.novatecws;

public class DpInfoLoginDTO  implements java.io.Serializable {
    private ve.com.novatec.www.novatecws.DpFolderDTO[] dpFolder;

    private ve.com.novatec.www.novatecws.DpDocTypeDTO[] dpDoctype;

    private ve.com.novatec.www.novatecws.DpMimeTypeDTO[] dpMimetype;

    public DpInfoLoginDTO() {
    }

    public DpInfoLoginDTO(
           ve.com.novatec.www.novatecws.DpFolderDTO[] dpFolder,
           ve.com.novatec.www.novatecws.DpDocTypeDTO[] dpDoctype,
           ve.com.novatec.www.novatecws.DpMimeTypeDTO[] dpMimetype) {
           this.dpFolder = dpFolder;
           this.dpDoctype = dpDoctype;
           this.dpMimetype = dpMimetype;
    }


    /**
     * Gets the dpFolder value for this DpInfoLoginDTO.
     * 
     * @return dpFolder
     */
    public ve.com.novatec.www.novatecws.DpFolderDTO[] getDpFolder() {
        return dpFolder;
    }


    /**
     * Sets the dpFolder value for this DpInfoLoginDTO.
     * 
     * @param dpFolder
     */
    public void setDpFolder(ve.com.novatec.www.novatecws.DpFolderDTO[] dpFolder) {
        this.dpFolder = dpFolder;
    }

    public ve.com.novatec.www.novatecws.DpFolderDTO getDpFolder(int i) {
        return this.dpFolder[i];
    }

    public void setDpFolder(int i, ve.com.novatec.www.novatecws.DpFolderDTO _value) {
        this.dpFolder[i] = _value;
    }


    /**
     * Gets the dpDoctype value for this DpInfoLoginDTO.
     * 
     * @return dpDoctype
     */
    public ve.com.novatec.www.novatecws.DpDocTypeDTO[] getDpDoctype() {
        return dpDoctype;
    }


    /**
     * Sets the dpDoctype value for this DpInfoLoginDTO.
     * 
     * @param dpDoctype
     */
    public void setDpDoctype(ve.com.novatec.www.novatecws.DpDocTypeDTO[] dpDoctype) {
        this.dpDoctype = dpDoctype;
    }

    public ve.com.novatec.www.novatecws.DpDocTypeDTO getDpDoctype(int i) {
        return this.dpDoctype[i];
    }

    public void setDpDoctype(int i, ve.com.novatec.www.novatecws.DpDocTypeDTO _value) {
        this.dpDoctype[i] = _value;
    }


    /**
     * Gets the dpMimetype value for this DpInfoLoginDTO.
     * 
     * @return dpMimetype
     */
    public ve.com.novatec.www.novatecws.DpMimeTypeDTO[] getDpMimetype() {
        return dpMimetype;
    }


    /**
     * Sets the dpMimetype value for this DpInfoLoginDTO.
     * 
     * @param dpMimetype
     */
    public void setDpMimetype(ve.com.novatec.www.novatecws.DpMimeTypeDTO[] dpMimetype) {
        this.dpMimetype = dpMimetype;
    }

    public ve.com.novatec.www.novatecws.DpMimeTypeDTO getDpMimetype(int i) {
        return this.dpMimetype[i];
    }

    public void setDpMimetype(int i, ve.com.novatec.www.novatecws.DpMimeTypeDTO _value) {
        this.dpMimetype[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DpInfoLoginDTO)) return false;
        DpInfoLoginDTO other = (DpInfoLoginDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dpFolder==null && other.getDpFolder()==null) || 
             (this.dpFolder!=null &&
              java.util.Arrays.equals(this.dpFolder, other.getDpFolder()))) &&
            ((this.dpDoctype==null && other.getDpDoctype()==null) || 
             (this.dpDoctype!=null &&
              java.util.Arrays.equals(this.dpDoctype, other.getDpDoctype()))) &&
            ((this.dpMimetype==null && other.getDpMimetype()==null) || 
             (this.dpMimetype!=null &&
              java.util.Arrays.equals(this.dpMimetype, other.getDpMimetype())));
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
        if (getDpFolder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDpFolder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDpFolder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDpDoctype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDpDoctype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDpDoctype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDpMimetype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDpMimetype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDpMimetype(), i);
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
        new org.apache.axis.description.TypeDesc(DpInfoLoginDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpInfoLoginDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpFolderDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpDoctype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpDoctype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpDocTypeDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpMimetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpMimetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novatec.com.ve/novatecws/", "DpMimeTypeDTO"));
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
