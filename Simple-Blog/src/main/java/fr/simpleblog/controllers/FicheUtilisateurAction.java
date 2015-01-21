package fr.simpleblog.controllers;

import java.util.ArrayList;

import fr.simpleblog.beans.*;

public class FicheUtilisateurAction {
	private FicheUtilisateur ficheUtilisateur;
	private ArrayList<String> fichesUtilisateur;

	public String listerFicheUtilisateur() {
		throw new UnsupportedOperationException();
	}

	public void creerFicheUtilisateur() {
		throw new UnsupportedOperationException();
	}

	public void supprimerFicheUtilisateur() {
		throw new UnsupportedOperationException();
	}

	public void modifierFicheUtilisateur() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @return the ficheUtilisateur
	 */
	public FicheUtilisateur getFicheUtilisateur() {
		return ficheUtilisateur;
	}

	/**
	 * @param ficheUtilisateur the ficheUtilisateur to set
	 */
	public void setFicheUtilisateur(FicheUtilisateur ficheUtilisateur) {
		this.ficheUtilisateur = ficheUtilisateur;
	}

	/**
	 * @param fichesUtilisateur the fichesUtilisateur to set
	 */
	public void setFichesUtilisateur(ArrayList<String> fichesUtilisateur) {
		this.fichesUtilisateur = fichesUtilisateur;
	}

	/**
	 * @return the fichesUtilisateur
	 */
	public ArrayList<String> getFichesUtilisateur() {
		return this.fichesUtilisateur;
	}
}