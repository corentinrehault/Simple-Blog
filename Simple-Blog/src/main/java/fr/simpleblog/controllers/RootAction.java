package fr.simpleblog.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.List;

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

	private IservicePays impServicePays;
	private List<Pays> ensemblePays;

	ParsingService parsingPays = new ParsingService();
	
	
	
	public void recupererListePays() {

		try {
			ensemblePays = parsingPays.listPays();


		} catch (MalformedURLException e) {
			System.out.println("Erreur d'URL");
			System.out.println("Dans la méthode recupererListePays()");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erreur d'entrée/sortie");
			System.out.println("Dans la méthode recupererListePays()");
			e.printStackTrace();
		}

		//System.out.println("Rootaction + "+ensemblePays);
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