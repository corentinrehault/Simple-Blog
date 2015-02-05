package fr.simpleblog.beans;

import java.util.HashSet;

public class Interet implements Ibeans {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4251357504117241715L;

	private String nom;
	private int id;

	public HashSet<FicheUtilisateur> ficheUtilisateurs = new HashSet<FicheUtilisateur>();

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
	public HashSet<FicheUtilisateur> getFicheUtilisateurs() {
		return ficheUtilisateurs;
	}

	/**
	 * @param ficheUtilisateurs the ficheUtilisateurs to set
	 */
	public void setFicheUtilisateurs(HashSet<FicheUtilisateur> ficheUtilisateurs) {
		this.ficheUtilisateurs = ficheUtilisateurs;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Interet [nom=" + nom + ", id=" + id + "]";
	}

}