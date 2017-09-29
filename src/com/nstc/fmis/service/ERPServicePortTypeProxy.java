package com.nstc.fmis.service;

public class ERPServicePortTypeProxy implements com.nstc.fmis.service.ERPServicePortType {
  private String _endpoint = null;
  private com.nstc.fmis.service.ERPServicePortType eRPServicePortType = null;
  
  public ERPServicePortTypeProxy() {
    _initERPServicePortTypeProxy();
  }
  
  public ERPServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initERPServicePortTypeProxy();
  }
  
  private void _initERPServicePortTypeProxy() {
    try {
      eRPServicePortType = (new com.nstc.fmis.service.ERPServiceLocator()).getERPServiceHttpPort();
      if (eRPServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)eRPServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)eRPServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (eRPServicePortType != null)
      ((javax.xml.rpc.Stub)eRPServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.nstc.fmis.service.ERPServicePortType getERPServicePortType() {
    if (eRPServicePortType == null)
      _initERPServicePortTypeProxy();
    return eRPServicePortType;
  }
  
  public com.nstc.fmis.model2.InterAccount queryInterAccount(com.nstc.fmis.model2.InterAccountSeq in0) throws java.rmi.RemoteException{
    if (eRPServicePortType == null)
      _initERPServicePortTypeProxy();
    return eRPServicePortType.queryInterAccount(in0);
  }
  
  
}