/**
 * ERPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nstc.fmis.service;

public interface ERPService extends javax.xml.rpc.Service {
    public java.lang.String getERPServiceHttpPortAddress();

    public com.nstc.fmis.service.ERPServicePortType getERPServiceHttpPort() throws javax.xml.rpc.ServiceException;

    public com.nstc.fmis.service.ERPServicePortType getERPServiceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
