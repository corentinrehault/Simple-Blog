package fr.simpleblog.controllers;

import fr.simpleblog.beans.*;
import java.util.*;

public class CategorieAction {
	
	private Categorie categorie;
	private ArrayList<String> categories;

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
	public ArrayList<String> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(ArrayList<String> categories) {
		this.categories = categories;
	}

	public String listerCategorie() {
		throw new UnsupportedOperationException();
	}

	public void creerCategorie() {
		throw new UnsupportedOperationException();
	}

	public void supprimerCategorie() {
		throw new UnsupportedOperationException();
	}

	public void modifierCategorie() {
		throw new UnsupportedOperationException();
	}
}