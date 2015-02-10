package fr.simpleblog.beans;

import java.util.*;

public class Commentaire implements Ibeans {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6778619360479178214L;

	private Date date;
	private String titre;
	private String contenu;
	private int id;
	private boolean valide;

	public Article articleCommente;
	public Utilisateur auteur;

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return this.date;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getContenu() {
		return this.contenu;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setValide(boolean valide) {
		this.valide = valide;
	}

	public boolean isValide() {
		return this.valide;
	}

	/**
	 * @return the articleCommente
	 */
	public Article getArticleCommente() {
		return articleCommente;
	}

	/**
	 * @param articleCommente the articleCommente to set
	 */
	public void setArticleCommente(Article articleCommente) {
		this.articleCommente = articleCommente;
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

}