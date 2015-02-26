package fr.simpleblog.controllers;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import fr.simpleblog.beans.Pays;
import fr.simpleblog.domainService.IservicePays;
import fr.simpleblog.services.webservices.servicepays.PaysServiceProxy;

public class RootAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4448517924375834371L;

	/**
	 *  Log4J logger
	 */
	private static final Logger LOG = Logger.getLogger(AdminAction.class);

	private IservicePays impServicePays;
	private List<Pays> ensemblePays;



	/**
	 * Interrogation du webservice
	 */
	public void recupererListePays() {

		try {

			PaysServiceProxy paysServiceProxy = new PaysServiceProxy();
			Pays[] arrayEnsemblePays = paysServiceProxy.listEnsemblePays();
			ensemblePays = Arrays.asList(arrayEnsemblePays);

		} catch (RemoteException e) {
			e.printStackTrace();
		}

		LOG.error("Rootaction + "+ensemblePays);
		impServicePays.createList(ensemblePays);

	}


	public void comparerListePays() {
	}

	public void recupererArticle() {
	}

	public void recupererStylepardefaut() {
	}

	public void changerStylepardefaut() {
	}

	public void changerLangue() {
	}

	/**
	 * @return SUCCESS
	 * 
	 * méthode pour accéder à l'index
	 * @throws SQLException 
	 * 
	 */
	public String initApplication() {

		//recupererListePays();
		//recupererArticle();

		return SUCCESS;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.Preparable#prepare()
	 * 
	 *  Permet d'afficher la pile d'interception
	 * dans la console
	 * 
	 */
	@Override
	public void prepare() throws Exception {
		//UtilTimerStack.setActive(true);
	}

	/**
	 * @return the impServicePays
	 */
	public IservicePays getImpServicePays() {
		return impServicePays;
	}


	/**
	 * @param impServicePays the impServicePays to set
	 */
	public void setImpServicePays(IservicePays impServicePays) {
		this.impServicePays = impServicePays;
	}

}