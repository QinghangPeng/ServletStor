/**
 * InterAccountSeq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nstc.fmis.model2;

public class InterAccountSeq  implements java.io.Serializable {
    private java.lang.String ACCOUNT_NO;

    private java.lang.String BOOK_DATE;

    public InterAccountSeq() {
    }

    public InterAccountSeq(
           java.lang.String ACCOUNT_NO,
           java.lang.String BOOK_DATE) {
           this.ACCOUNT_NO = ACCOUNT_NO;
           this.BOOK_DATE = BOOK_DATE;
    }


    /**
     * Gets the ACCOUNT_NO value for this InterAccountSeq.
     * 
     * @return ACCOUNT_NO
     */
    public java.lang.String getACCOUNT_NO() {
        return ACCOUNT_NO;
    }


    /**
     * Sets the ACCOUNT_NO value for this InterAccountSeq.
     * 
     * @param ACCOUNT_NO
     */
    public void setACCOUNT_NO(java.lang.String ACCOUNT_NO) {
        this.ACCOUNT_NO = ACCOUNT_NO;
    }


    /**
     * Gets the BOOK_DATE value for this InterAccountSeq.
     * 
     * @return BOOK_DATE
     */
    public java.lang.String getBOOK_DATE() {
        return BOOK_DATE;
    }


    /**
     * Sets the BOOK_DATE value for this InterAccountSeq.
     * 
     * @param BOOK_DATE
     */
    public void setBOOK_DATE(java.lang.String BOOK_DATE) {
        this.BOOK_DATE = BOOK_DATE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InterAccountSeq)) return false;
        InterAccountSeq other = (InterAccountSeq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ACCOUNT_NO==null && other.getACCOUNT_NO()==null) || 
             (this.ACCOUNT_NO!=null &&
              this.ACCOUNT_NO.equals(other.getACCOUNT_NO()))) &&
            ((this.BOOK_DATE==null && other.getBOOK_DATE()==null) || 
             (this.BOOK_DATE!=null &&
              this.BOOK_DATE.equals(other.getBOOK_DATE())));
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
        if (getACCOUNT_NO() != null) {
            _hashCode += getACCOUNT_NO().hashCode();
        }
        if (getBOOK_DATE() != null) {
            _hashCode += getBOOK_DATE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InterAccountSeq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model2.fmis.nstc.com", "InterAccountSeq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCOUNT_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model2.fmis.nstc.com", "ACCOUNT_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BOOK_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model2.fmis.nstc.com", "BOOK_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
