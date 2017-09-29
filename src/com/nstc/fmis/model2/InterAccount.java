/**
 * InterAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nstc.fmis.model2;

public class InterAccount  implements java.io.Serializable {
    private java.lang.String ACCOUNT_NO;

    private java.lang.String BOOK_DATE;

    private java.lang.Integer RET_CODE;

    private java.lang.String RET_MSG;

    private java.lang.String amount;

    public InterAccount() {
    }

    public InterAccount(
           java.lang.String ACCOUNT_NO,
           java.lang.String BOOK_DATE,
           java.lang.Integer RET_CODE,
           java.lang.String RET_MSG,
           java.lang.String amount) {
           this.ACCOUNT_NO = ACCOUNT_NO;
           this.BOOK_DATE = BOOK_DATE;
           this.RET_CODE = RET_CODE;
           this.RET_MSG = RET_MSG;
           this.amount = amount;
    }


    /**
     * Gets the ACCOUNT_NO value for this InterAccount.
     * 
     * @return ACCOUNT_NO
     */
    public java.lang.String getACCOUNT_NO() {
        return ACCOUNT_NO;
    }


    /**
     * Sets the ACCOUNT_NO value for this InterAccount.
     * 
     * @param ACCOUNT_NO
     */
    public void setACCOUNT_NO(java.lang.String ACCOUNT_NO) {
        this.ACCOUNT_NO = ACCOUNT_NO;
    }


    /**
     * Gets the BOOK_DATE value for this InterAccount.
     * 
     * @return BOOK_DATE
     */
    public java.lang.String getBOOK_DATE() {
        return BOOK_DATE;
    }


    /**
     * Sets the BOOK_DATE value for this InterAccount.
     * 
     * @param BOOK_DATE
     */
    public void setBOOK_DATE(java.lang.String BOOK_DATE) {
        this.BOOK_DATE = BOOK_DATE;
    }


    /**
     * Gets the RET_CODE value for this InterAccount.
     * 
     * @return RET_CODE
     */
    public java.lang.Integer getRET_CODE() {
        return RET_CODE;
    }


    /**
     * Sets the RET_CODE value for this InterAccount.
     * 
     * @param RET_CODE
     */
    public void setRET_CODE(java.lang.Integer RET_CODE) {
        this.RET_CODE = RET_CODE;
    }


    /**
     * Gets the RET_MSG value for this InterAccount.
     * 
     * @return RET_MSG
     */
    public java.lang.String getRET_MSG() {
        return RET_MSG;
    }


    /**
     * Sets the RET_MSG value for this InterAccount.
     * 
     * @param RET_MSG
     */
    public void setRET_MSG(java.lang.String RET_MSG) {
        this.RET_MSG = RET_MSG;
    }


    /**
     * Gets the amount value for this InterAccount.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this InterAccount.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InterAccount)) return false;
        InterAccount other = (InterAccount) obj;
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
              this.BOOK_DATE.equals(other.getBOOK_DATE()))) &&
            ((this.RET_CODE==null && other.getRET_CODE()==null) || 
             (this.RET_CODE!=null &&
              this.RET_CODE.equals(other.getRET_CODE()))) &&
            ((this.RET_MSG==null && other.getRET_MSG()==null) || 
             (this.RET_MSG!=null &&
              this.RET_MSG.equals(other.getRET_MSG()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount())));
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
        if (getRET_CODE() != null) {
            _hashCode += getRET_CODE().hashCode();
        }
        if (getRET_MSG() != null) {
            _hashCode += getRET_MSG().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InterAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model2.fmis.nstc.com", "InterAccount"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RET_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model2.fmis.nstc.com", "RET_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RET_MSG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model2.fmis.nstc.com", "RET_MSG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model2.fmis.nstc.com", "amount"));
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
