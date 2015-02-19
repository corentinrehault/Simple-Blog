package fr.simpleblog.controllers;

import fr.simpleblog.beans.*;
import fr.simpleblog.domainService.IserviceCategorie;

import java.util.*;

import com.opensymphony.xwork2.ActionSupport;

public class CategorieAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2121549731167929086L;

	private Categorie categorie;
	private List<Categorie> categories;

	private IserviceCategorie impServiceCategorie;
	


	public String listerCategorie() {

		categories.addAll(impServiceCategorie.listCategorie());
		
		return SUCCESS;
	}

	public void creerCategorie() {
	}

	public void supprimerCategorie() {
	}

	public void modifierCategorie() {
	}

	/**
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	/**
	 * @return the categories
	 */
	public List<Categorie> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}

	/**
	 * @return the impServiceCategorie
	 */
	public IserviceCategorie getImpServiceCategorie() {
		return impServiceCategorie;
	}

	/**
	 * @param impServiceCategorie the impServiceCategorie to set
	 */
	public void setImpServiceCategorie(IserviceCategorie impServiceCategorie) {
		this.impServiceCategorie = impServiceCategorie;
	}

}