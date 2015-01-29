package fr.simpleblog.controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import fr.simpleblog.beans.*;
import fr.simpleblog.model.DAOSql.DAOModelFicheUtilisateur;
import fr.simpleblog.model.DAOSql.DAOModelInteret;
import fr.simpleblog.model.DAOSql.DAOModelPays;
import fr.simpleblog.model.DAOSql.DAOModelStyle;
import fr.simpleblog.model.DAOSql.DAOModelUtilisateur;
import fr.simpleblog.services.Cache;

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
	public HashSet<Interet> interets = new HashSet<Interet>();
	public List<Pays> ensemblePays = new LinkedList<Pays>();
	private List<Style> styles = new LinkedList<Style>();
	private Map<String,Object> sessionMap;

	private Cache cache;
	public DAOModelFicheUtilisateur daoModelFicheUtilisateur;
	DAOModelUtilisateur daoModelUtilisateur;
	DAOModelPays daoModelPays;
	DAOModelInteret daoModelInteret;
	DAOModelStyle daoModelStyle;

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

		ficheUtilisateur = daoModelFicheUtilisateur.readById((int) sessionMap.get("ficheId"));

		//System.out.println(ficheUtilisateur.toString());

		if (ficheUtilisateur != null) {

			this.sessionMap.put("adresse", ficheUtilisateur.getAdresse());
			this.sessionMap.put("ville", ficheUtilisateur.getVille());
			this.sessionMap.put("codepostal", ficheUtilisateur.getCodePostal());
			this.sessionMap.put("paysId", ficheUtilisateur.getPaysId());

		}

		interets = daoModelInteret.listerInteretParFicheUtil((int) sessionMap.get("ficheId"));

		if (interets != null) {
			interets.iterator();
			System.out.println(interets.iterator());
			for (Interet interet : interets) {
				this.sessionMap.put("interet", interet.getNom());
			}
		}
		
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
	public DAOModelFicheUtilisateur getDaoModelFicheUtilisateur() {
		return daoModelFicheUtilisateur;
	}

	/**
	 * @param daoModelFicheUtilisateur the daoModelFicheUtilisateur to set
	 */
	public void setDaoModelFicheUtilisateur(
			DAOModelFicheUtilisateur daoModelFicheUtilisateur) {
		this.daoModelFicheUtilisateur = daoModelFicheUtilisateur;
	}

	/**
	 * @return the daoModelUtilisateur
	 */
	public DAOModelUtilisateur getDaoModelUtilisateur() {
		return daoModelUtilisateur;
	}

	/**
	 * @param daoModelUtilisateur the daoModelUtilisateur to set
	 */
	public void setDaoModelUtilisateur(DAOModelUtilisateur daoModelUtilisateur) {
		this.daoModelUtilisateur = daoModelUtilisateur;
	}

	/**
	 * @return the daoModelPays
	 */
	public DAOModelPays getDaoModelPays() {
		return daoModelPays;
	}

	/**
	 * @param daoModelPays the daoModelPays to set
	 */
	public void setDaoModelPays(DAOModelPays daoModelPays) {
		this.daoModelPays = daoModelPays;
	}

	/**
	 * @return the daoModelInteret
	 */
	public DAOModelInteret getDaoModelInteret() {
		return daoModelInteret;
	}

	/**
	 * @param daoModelInteret the daoModelInteret to set
	 */
	public void setDaoModelInteret(DAOModelInteret daoModelInteret) {
		this.daoModelInteret = daoModelInteret;
	}

	/**
	 * @return the daoModelStyle
	 */
	public DAOModelStyle getDaoModelStyle() {
		return daoModelStyle;
	}

	/**
	 * @param daoModelStyle the daoModelStyle to set
	 */
	public void setDaoModelStyle(DAOModelStyle daoModelStyle) {
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

	/**
	 * @return the interets
	 */
	public HashSet<Interet> getInterets() {

		if (cache.getInterets() == null) {
			interets = daoModelInteret.listerInteret();
			cache.setInterets(interets);
		} else {
			interets = cache.getInterets();
		};

		System.out.println(interets.toString());
		return interets;
	}

	/**
	 * @param interets the interets to set
	 */
	public void setInterets(HashSet<Interet> interets) {
		this.interets = interets;
	}

	/**
	 * @return the ensemblePays
	 */
	public List<Pays> getEnsemblePays() {

		if (cache.getEnsemblePays() == null ) {
			//TODO insérer test durée de vie du cache
			ensemblePays = daoModelPays.listerPays();
			cache.setEnsemblePays(ensemblePays);
		} else {
			ensemblePays = cache.getEnsemblePays();
		}

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
	public List<Style> getStyles() {

		if(cache.getStyles() == null) {
			styles = daoModelStyle.listerStyle();
			cache.setStyles(styles);
		} else {
			styles = cache.getStyles();
		}

		System.out.println(styles.toString());
		return styles;
	}

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