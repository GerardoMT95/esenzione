/**
 * FirmaPAdESAutomaticaConArchiviazResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.csi.esenred.esenpatweb.business.gateway;

public class FirmaPAdESAutomaticaConArchiviazResponse  implements java.io.Serializable {
    private it.csi.esenred.esenpatweb.business.gateway.FileResult _return;

    public FirmaPAdESAutomaticaConArchiviazResponse() {
    }

    public FirmaPAdESAutomaticaConArchiviazResponse(
           it.csi.esenred.esenpatweb.business.gateway.FileResult _return) {
           this._return = _return;
    }


    /**
     * Gets the _return value for this FirmaPAdESAutomaticaConArchiviazResponse.
     * 
     * @return _return
     */
    public it.csi.esenred.esenpatweb.business.gateway.FileResult get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this FirmaPAdESAutomaticaConArchiviazResponse.
     * 
     * @param _return
     */
    public void set_return(it.csi.esenred.esenpatweb.business.gateway.FileResult _return) {
        this._return = _return;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FirmaPAdESAutomaticaConArchiviazResponse)) return false;
        FirmaPAdESAutomaticaConArchiviazResponse other = (FirmaPAdESAutomaticaConArchiviazResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return())));
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
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FirmaPAdESAutomaticaConArchiviazResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.csi.it/gatefire/", "firmaPAdESAutomaticaConArchiviazResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_return");
        elemField.setXmlName(new javax.xml.namespace.QName("", "return"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.csi.it/gatefire/", "fileResult"));
        elemField.setMinOccurs(0);
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
