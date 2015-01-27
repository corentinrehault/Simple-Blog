/**
 * 
 */
package fr.simpleblog.services;

import java.util.List;

import fr.simpleblog.beans.Pays;

/**
 * @author dao303
 *
 */
public class Cache {

	private List<Pays> ensemblePays ;

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
