package fr.simpleblog.beans;

import java.util.*;

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
	public HashSet<Interet> interets = new HashSet<Interet>();
	public List<Pays> ensemblePays = new LinkedList<Pays>();

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
	 * @return the ensemblePays
	 */
	public List<Pays> getEnsemblePays() {
		return ensemblePays;
	}

	/**
	 * @param ensemblePays the ensemblePays to set
	 */
	public void setEnsemblePays(List<Pays> ensemblePays) {
		this.ensemblePays = ensemblePays;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FicheUtilisateur [adresse=" + adresse + ", ville=" + ville
				+ ", codePostal=" + codePostal + ", id=" + id + ", pays="
				+ pays + ", interets=" + interets + ", ensemblePays="
				+ ensemblePays + "]";
	}

}