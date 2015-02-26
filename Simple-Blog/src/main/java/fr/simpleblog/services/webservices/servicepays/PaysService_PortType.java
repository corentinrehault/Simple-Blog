/**
 * PaysService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.simpleblog.services.webservices.servicepays;

import fr.simpleblog.beans.Pays;

public interface PaysService_PortType extends java.rmi.Remote {
    public Pays[] listEnsemblePays() throws java.rmi.RemoteException;
    public Pays getPaysByCode(java.lang.String codepays) throws java.rmi.RemoteException, fr.simpleblog.services.webservices.servicepays.PaysNotFoundException;
    public Pays getPaysByName(java.lang.String nom) throws java.rmi.RemoteException, fr.simpleblog.services.webservices.servicepays.PaysNotFoundException;
}
