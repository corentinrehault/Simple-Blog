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
	public HashSet<Commentaire> commentaires = new HashSet<Commentaire>();
	public Utilisateur auteur;
	public HashSet<Categorie> categories = new HashSet<Categorie>();

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Article [dateCreation=" + dateCreation + ", titre=" + titre
				+ ", id=" + id + ", contenu=" + contenu + ", commentaires="
				+ commentaires + ", auteur=" + auteur + ", categories="
				+ categories + "]";
	}
	
}