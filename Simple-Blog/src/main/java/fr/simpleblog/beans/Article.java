package fr.simpleblog.beans;

import java.util.*;

public class Article implements Ibeans {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6970384124486214449L;

	private Date dateCreation;
	private String titre;
	private int id;
	private String contenu;

	public Set<Commentaire> commentaires;
	public Utilisateur auteur;
	public Set<Categorie> categories;

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getContenu() {
		return this.contenu;
	}

	/**
	 * @return the commentaires
	 */
	public Set<Commentaire> getCommentaires() {
		return commentaires;
	}

	/**
	 * @param commentaires the commentaires to set
	 */
	public void setCommentaires(Set<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	/**
	 * @return the auteur
	 */
	public Utilisateur getAuteur() {
		return auteur;
	}

	/**
	 * @param auteur the auteur to set
	 */
	public void setAuteur(Utilisateur auteur) {
		this.auteur = auteur;
	}

	/**
	 * @return the categories
	 */
	public Set<Categorie> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(Set<Categorie> categories) {
		this.categories = categories;
	}

}