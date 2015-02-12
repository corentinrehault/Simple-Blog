package fr.simpleblog.beans;

import java.util.Set;

public class FicheUtilisateur implements Ibeans {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2282437060157722559L;

	private String adresse;
	private String ville;
	private int codePostal;
	private int id;

	public Pays pays;
	public Interet interet;
	public Set<Interet> interets;
	

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return this.adresse;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return this.ville;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return this.codePostal;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * @return the pays
	 */
	public Pays getPays() {
		return pays;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(Pays pays) {
		this.pays = pays;
	}

	/**
	 * @return the interet
	 */
	public Interet getInteret() {
		return interet;
	}

	/**
	 * @param interet the interet to set
	 */
	public void setInteret(Interet interet) {
		this.interet = interet;
	}

	/**
	 * @return the interets
	 */
	public Set<Interet> getInterets() {
		return interets;
	}

	/**
	 * @param interets the interets to set
	 */
	public void setInterets(Set<Interet> interets) {
		this.interets = interets;
	}

}