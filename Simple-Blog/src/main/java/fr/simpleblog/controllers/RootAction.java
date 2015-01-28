package fr.simpleblog.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.profiling.UtilTimerStack;

import fr.simpleblog.beans.Pays;
import fr.simpleblog.model.DAOSql.DAOModelPays;
import fr.simpleblog.services.ParsingService;

public class RootAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4448517924375834371L;

	ParsingService parsingPays = new ParsingService();
	DAOModelPays daoModelPays;
	private List<Pays> ensemblePays = new LinkedList<Pays>();

	public void recupererListePays() {

		try {
			ensemblePays = parsingPays.listerPays();
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
		daoModelPays.createList(ensemblePays);

	}
	
	public void comparerListePayes() {
		throw new UnsupportedOperationException();
	}

	public void recupererArticle() {
		throw new UnsupportedOperationException();
	}

	public void recupererStylepardefaut() {
		throw new UnsupportedOperationException();
	}

	public void changerStylepardefaut() {
		throw new UnsupportedOperationException();
	}

	public void changerLangue() {
		throw new UnsupportedOperationException();
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
		 * et placer la liste en cache
		 */
		recupererListePays();
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
		UtilTimerStack.setActive(true);
	}

	/**
	 * @return the daoModelPays
	 */
	public DAOModelPays getDaoModelPays() {
		return daoModelPays;
	}

	/**
	 * @param daoModelPays the daoModelPays to set
	 */
	public void setDaoModelPays(DAOModelPays daoModelPays) {
		this.daoModelPays = daoModelPays;
	}

}