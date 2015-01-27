package fr.simpleblog.beans;

import java.util.*;

public class FicheUtilisateur {
	private String adresse;
	private String ville;
	private int codePostal;
	private int id;
	public Pays pays;
	public HashSet<Interet> interets = new HashSet<Interet>();
	
	public List<Pays> ensemblePays = new LinkedList<Pays>();

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getVille() {
		return this.ville;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public int getCodePostal() {
		return this.codePostal;
	}

	public void setId(int id) {
		this.id = id;
	}

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
}