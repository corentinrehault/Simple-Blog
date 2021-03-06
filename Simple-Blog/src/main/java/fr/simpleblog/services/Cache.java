/**
 * 
 */
package fr.simpleblog.services;

import java.util.List;
import java.util.Set;

import fr.simpleblog.beans.Interet;
import fr.simpleblog.beans.Pays;
import fr.simpleblog.beans.Style;

/**
 * @author dao303
 *
 */
public class Cache {

	private List<Pays> ensemblePays ;
	private Set<Interet> interets;
	private List<Style> styles;

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

	/**
	 * @return the styles
	 */
	public List<Style> getStyles() {
		return styles;
	}

	/**
	 * @param styles the styles to set
	 */
	public void setStyles(List<Style> styles) {
		this.styles = styles;
	}

}
