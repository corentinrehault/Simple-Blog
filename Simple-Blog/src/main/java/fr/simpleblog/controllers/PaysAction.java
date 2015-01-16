package fr.simpleblog.controllers;

import fr.simpleblog.beans.*;
import java.util.*;

public class PaysAction {
	private Pays pays;
	private ArrayList<String> ensemblePays;

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
	public ArrayList<String> getEnsemblePays() {
		return ensemblePays;
	}

	/**
	 * @param ensemblePays the ensemblePays to set
	 */
	public void setEnsemblePays(ArrayList<String> ensemblePays) {
		this.ensemblePays = ensemblePays;
	}

	public void listerPays() {
		throw new UnsupportedOperationException();
	}
}