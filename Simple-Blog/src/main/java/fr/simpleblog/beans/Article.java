package fr.simpleblog.beans;

import java.util.*;

public class Article {
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
}