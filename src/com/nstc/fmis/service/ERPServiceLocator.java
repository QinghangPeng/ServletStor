/**
 * ERPServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nstc.fmis.service;

public class ERPServiceLocator extends org.apache.axis.client.Service implements com.nstc.fmis.service.ERPService {

    public ERPServiceLocator() {
    }


    public ERPServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ERPServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ERPServiceHttpPort
    private java.lang.String ERPServiceHttpPort_address = "http://localhost:5020/fmis/service/ERPService";

    public java.lang.String getERPServiceHttpPortAddress() {
        return ERPServiceHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ERPServiceHttpPortWSDDServiceName = "ERPServiceHttpPort";

    public java.lang.String getERPServiceHttpPortWSDDServiceName() {
        return ERPServiceHttpPortWSDDServiceName;
    }

    public void setERPServiceHttpPortWSDDServiceName(java.lang.String name) {
        ERPServiceHttpPortWSDDServiceName = name;
    }

    public com.nstc.fmis.service.ERPServicePortType getERPServiceHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ERPServiceHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getERPServiceHttpPort(endpoint);
    }

    public com.nstc.fmis.service.ERPServicePortType getERPServiceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.nstc.fmis.service.ERPServiceHttpBindingStub _stub = new com.nstc.fmis.service.ERPServiceHttpBindingStub(portAddress, this);
            _stub.setPortName(getERPServiceHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setERPServiceHttpPortEndpointAddress(java.lang.String address) {
        ERPServiceHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.nstc.fmis.service.ERPServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.nstc.fmis.service.ERPServiceHttpBindingStub _stub = new com.nstc.fmis.service.ERPServiceHttpBindingStub(new java.net.URL(ERPServiceHttpPort_address), this);
                _stub.setPortName(getERPServiceHttpPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ERPServiceHttpPort".equals(inputPortName)) {
            return getERPServiceHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.fmis.nstc.com", "ERPService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.fmis.nstc.com", "ERPServiceHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ERPServiceHttpPort".equals(portName)) {
            setERPServiceHttpPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
