package fr.simpleblog.beans;

import java.util.*;

public class FicheUtilisateur {
	private String adresse;
	private String ville;
	private int codePostal;
	private int id;
	public Pays pays;
	public HashSet<Interet> interets = new HashSet<Interet>();

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
}