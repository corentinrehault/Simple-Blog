package fr.simpleblog.services.webservices.servicepays;

import fr.simpleblog.beans.Pays;

public class PaysServiceProxy implements fr.simpleblog.services.webservices.servicepays.PaysService_PortType {
  private String _endpoint = null;
  private fr.simpleblog.services.webservices.servicepays.PaysService_PortType paysService_PortType = null;
  
  public PaysServiceProxy() {
    _initPaysServiceProxy();
  }
  
  public PaysServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initPaysServiceProxy();
  }
  
  private void _initPaysServiceProxy() {
    try {
      paysService_PortType = (new fr.simpleblog.services.webservices.servicepays.PaysService_ServiceLocator()).getPaysServicePort();
      if (paysService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)paysService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)paysService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (paysService_PortType != null)
      ((javax.xml.rpc.Stub)paysService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.simpleblog.services.webservices.servicepays.PaysService_PortType getPaysService_PortType() {
    if (paysService_PortType == null)
      _initPaysServiceProxy();
    return paysService_PortType;
  }
  
  public Pays[] listEnsemblePays() throws java.rmi.RemoteException{
    if (paysService_PortType == null)
      _initPaysServiceProxy();
    return paysService_PortType.listEnsemblePays();
  }
  
  public Pays getPaysByCode(java.lang.String codepays) throws java.rmi.RemoteException, fr.simpleblog.services.webservices.servicepays.PaysNotFoundException{
    if (paysService_PortType == null)
      _initPaysServiceProxy();
    return paysService_PortType.getPaysByCode(codepays);
  }
  
  public Pays getPaysByName(java.lang.String nom) throws java.rmi.RemoteException, fr.simpleblog.services.webservices.servicepays.PaysNotFoundException{
    if (paysService_PortType == null)
      _initPaysServiceProxy();
    return paysService_PortType.getPaysByName(nom);
  }
  
  
}