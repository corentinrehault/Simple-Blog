/**
 * PaysService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.simpleblog.services.webservices.servicepays;

public class PaysService_ServiceLocator extends org.apache.axis.client.Service implements fr.simpleblog.services.webservices.servicepays.PaysService_Service {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6961231208078113410L;

	public PaysService_ServiceLocator() {
    }


    public PaysService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PaysService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PaysServicePort
    private java.lang.String PaysServicePort_address = "http://localhost:8089/servicepays/services/pays";

    public java.lang.String getPaysServicePortAddress() {
        return PaysServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PaysServicePortWSDDServiceName = "PaysServicePort";

    public java.lang.String getPaysServicePortWSDDServiceName() {
        return PaysServicePortWSDDServiceName;
    }

    public void setPaysServicePortWSDDServiceName(java.lang.String name) {
        PaysServicePortWSDDServiceName = name;
    }

    public fr.simpleblog.services.webservices.servicepays.PaysService_PortType getPaysServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PaysServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPaysServicePort(endpoint);
    }

    public fr.simpleblog.services.webservices.servicepays.PaysService_PortType getPaysServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.simpleblog.services.webservices.servicepays.PaysServiceSoapBindingStub _stub = new fr.simpleblog.services.webservices.servicepays.PaysServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPaysServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPaysServicePortEndpointAddress(java.lang.String address) {
        PaysServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.simpleblog.services.webservices.servicepays.PaysService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.simpleblog.services.webservices.servicepays.PaysServiceSoapBindingStub _stub = new fr.simpleblog.services.webservices.servicepays.PaysServiceSoapBindingStub(new java.net.URL(PaysServicePort_address), this);
                _stub.setPortName(getPaysServicePortWSDDServiceName());
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
        if ("PaysServicePort".equals(inputPortName)) {
            return getPaysServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.servicepays.com/", "PaysService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.servicepays.com/", "PaysServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PaysServicePort".equals(portName)) {
            setPaysServicePortEndpointAddress(address);
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
