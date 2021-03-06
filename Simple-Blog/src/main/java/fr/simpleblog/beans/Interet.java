package fr.simpleblog.beans;

import java.util.Set;

public class Interet implements Ibeans {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4251357504117241715L;

	private String nom;
	private int id;

	public Set<FicheUtilisateur> ficheUtilisateurs;

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

	/**
	 * @return the ficheUtilisateurs
	 */
	public Set<FicheUtilisateur> getFicheUtilisateurs() {
		return ficheUtilisateurs;
	}

	/**
	 * @param ficheUtilisateurs the ficheUtilisateurs to set
	 */
	public void setFicheUtilisateurs(Set<FicheUtilisateur> ficheUtilisateurs) {
		this.ficheUtilisateurs = ficheUtilisateurs;
	}

}