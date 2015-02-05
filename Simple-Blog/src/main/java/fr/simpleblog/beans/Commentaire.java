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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Commentaire [date=" + date + ", titre=" + titre + ", contenu="
				+ contenu + ", id=" + id + ", valide=" + valide
				+ ", articleCommente=" + articleCommente + ", auteur=" + auteur
				+ "]";
	}

}