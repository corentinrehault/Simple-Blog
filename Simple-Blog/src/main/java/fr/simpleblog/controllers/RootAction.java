package fr.simpleblog.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import fr.simpleblog.beans.Pays;
import fr.simpleblog.domainService.IservicePays;
import fr.simpleblog.services.parser.ParsingService;

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

	private ParsingService parsingPays = new ParsingService();



	public void recupererListePays() {

		try {

			ensemblePays = parsingPays.listPays();

		} catch (MalformedURLException e) {
			LOG.error("Erreur d'URL");
			LOG.error("Dans la méthode recupererListePays()");
			e.printStackTrace();
		} catch (IOException e) {
			LOG.error("Erreur d'entrée/sortie");
			LOG.error("Dans la méthode recupererListePays()");
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

		/*
		 * Ajout d'un comparateur pour la liste des pays
		 */
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