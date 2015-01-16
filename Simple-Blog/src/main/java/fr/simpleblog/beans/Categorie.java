package fr.simpleblog.beans;

public class Categorie {
	private String nom;
	private int id;

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return this.nom;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}
}