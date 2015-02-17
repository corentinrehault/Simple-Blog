package fr.simpleblog.controllers;

import fr.simpleblog.beans.*;
import java.util.*;

public class InteretAction {
	
	private Interet interet;
	private ArrayList<String> interets;

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
	public ArrayList<String> getInterets() {
		return interets;
	}

	/**
	 * @param interets the interets to set
	 */
	public void setInterets(ArrayList<String> interets) {
		this.interets = interets;
	}

	public String listerInteret() {
		throw new UnsupportedOperationException();
	}

	public void creerInteret() {
		throw new UnsupportedOperationException();
	}

	public void supprimerInteret() {
		throw new UnsupportedOperationException();
	}

	public void modifierInteret() {
		throw new UnsupportedOperationException();
	}
}