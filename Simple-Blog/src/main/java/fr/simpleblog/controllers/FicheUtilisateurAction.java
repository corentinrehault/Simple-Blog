package fr.simpleblog.controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.ehcache.Cache;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import fr.simpleblog.beans.*;
import fr.simpleblog.domainService.IserviceFicheUtilisateur;
import fr.simpleblog.domainService.IserviceInteret;
import fr.simpleblog.domainService.IservicePays;
import fr.simpleblog.domainService.IserviceStyle;
import fr.simpleblog.domainService.IserviceUtilisateur;

public class FicheUtilisateurAction extends ActionSupport implements Preparable,SessionAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 799861132415727534L;

	private FicheUtilisateur ficheUtilisateur;

	private ArrayList<String> fichesUtilisateur;
	private Utilisateur utilisateur;
	private String adresse;
	private String ville;
	private int codePostal;
	private int id;

	public Style style;
	public Pays pays;
	public Interet interet;

	public Set<Interet> interets;
	public List<Pays> ensemblePays;
	private List<Style> styles;

	private Map<String,Object> sessionMap;
	private Cache cache;

	public IserviceFicheUtilisateur daoModelFicheUtilisateur;
	public IserviceUtilisateur daoModelUtilisateur;
	public IservicePays daoModelPays;
	public IserviceInteret daoModelInteret;
	public IserviceStyle daoModelStyle;

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

	public String lireFicheUtilisateur() {

		//ficheUtilisateur = daoModelFicheUtilisateur.readById((int) sessionMap.get("ficheId"));

		//System.out.println(ficheUtilisateur.toString());

//		if (ficheUtilisateur != null) {
//
//			this.sessionMap.put("adresse", ficheUtilisateur.getAdresse());
//			this.sessionMap.put("ville", ficheUtilisateur.getVille());
//			this.sessionMap.put("codepostal", ficheUtilisateur.getCodePostal());
//			if (ficheUtilisateur.pays != null) {
//				this.sessionMap.put("paysId", ficheUtilisateur.pays.getId());
//			}
//
//		}
//
//		interets = daoModelInteret.listInteretById((int) sessionMap.get("ficheId"));
//
//		if (interets != null) {
//			interets.iterator();
//			System.out.println(interets.iterator());
//			for (Interet interet : interets) {
//				this.sessionMap.put("interet", interet.getNom());
//			}
//		}

		//		style = daoModelStyle.readParUtil((int) sessionMap.get("style"));
		//		
		//		if (style != null) {
		//			
		//			this.sessionMap.put("style", style.getNom());
		//			
		//		}

		return SUCCESS;
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

	/**
	 * @return the daoModelFicheUtilisateur
	 */
	public IserviceFicheUtilisateur getDaoModelFicheUtilisateur() {
		return daoModelFicheUtilisateur;
	}

	/**
	 * @param daoModelFicheUtilisateur the daoModelFicheUtilisateur to set
	 */
	public void setDaoModelFicheUtilisateur(
			IserviceFicheUtilisateur daoModelFicheUtilisateur) {
		this.daoModelFicheUtilisateur = daoModelFicheUtilisateur;
	}

	/**
	 * @return the daoModelUtilisateur
	 */
	public IserviceUtilisateur getDaoModelUtilisateur() {
		return daoModelUtilisateur;
	}

	/**
	 * @param daoModelUtilisateur the daoModelUtilisateur to set
	 */
	public void setDaoModelUtilisateur(IserviceUtilisateur daoModelUtilisateur) {
		this.daoModelUtilisateur = daoModelUtilisateur;
	}

	/**
	 * @return the daoModelPays
	 */
	public IservicePays getDaoModelPays() {
		return daoModelPays;
	}

	/**
	 * @param daoModelPays the daoModelPays to set
	 */
	public void setDaoModelPays(IservicePays daoModelPays) {
		this.daoModelPays = daoModelPays;
	}

	/**
	 * @return the daoModelInteret
	 */
	public IserviceInteret getDaoModelInteret() {
		return daoModelInteret;
	}

	/**
	 * @param daoModelInteret the daoModelInteret to set
	 */
	public void setDaoModelInteret(IserviceInteret daoModelInteret) {
		this.daoModelInteret = daoModelInteret;
	}

	/**
	 * @return the daoModelStyle
	 */
	public IserviceStyle getDaoModelStyle() {
		return daoModelStyle;
	}

	/**
	 * @param daoModelStyle the daoModelStyle to set
	 */
	public void setDaoModelStyle(IserviceStyle daoModelStyle) {
		this.daoModelStyle = daoModelStyle;
	}

	/**
	 * @return the utilisateur
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	/**
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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

//	/**
//	 * @return the interets
//	 */
//	public HashSet<Interet> getInterets() {
//
//		if (cache.getInterets() == null) {
//			interets = daoModelInteret.listInteret();
//			cache.setInterets(interets);
//		} else {
//			interets = cache.getInterets();
//		};
//
//		System.out.println(interets.toString());
//		return interets;
//	}
	
	

	/**
	 * @param interets the interets to set
	 */
	public void setInterets(HashSet<Interet> interets) {
		this.interets = interets;
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
	 * @return the ensemblePays
	 */
	public List<Pays> getEnsemblePays() {

		//if (cache == null) {
			ensemblePays = daoModelPays.listPays();
//		} else {
//			ensemblePays = (List<Pays>) cache.get("Pays");
//		}

		//System.out.println(cache);
		//System.out.println(ensemblePays.toString());
		return ensemblePays;
	}

	/**
	 * @param ensemblePays the ensemblePays to set
	 */
	public void setEnsemblePays(List<Pays> ensemblePays) {
		this.ensemblePays = ensemblePays;
	}

	/**
	 * @return the styles
	 */
//	public List<Style> getStyles() {
//
//		if(cache.getStyles() == null) {
//			styles = daoModelStyle.listStyle();
//			cache.setStyles(styles);
//		} else {
//			styles = cache.getStyles();
//		}
//
//		System.out.println(styles.size());
//		return styles;
//	}

	/**
	 * @param styles the styles to set
	 */
	public void setStyles(List<Style> styles) {
		this.styles = styles;
	}

	/**
	 * @return the cache
	 */
	public Cache getCache() {
		return cache;
	}

	/**
	 * @param cache the cache to set
	 */
	public void setCache(Cache cache) {
		this.cache = cache;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	@Override
	public void setSession(Map<String, Object> map) {
		this.sessionMap = map;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.Preparable#prepare()
	 */
	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}
}