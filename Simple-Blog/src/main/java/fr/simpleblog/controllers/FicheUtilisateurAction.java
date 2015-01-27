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
import fr.simpleblog.model.DAOSql.DAOModelPays;
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
	public Pays pays;
	public HashSet<Interet> interets = new HashSet<Interet>();
	public List<Pays> ensemblePays = new LinkedList<Pays>();

	private Cache cache;
	public DAOModelFicheUtilisateur daoModelFicheUtilisateur;
	DAOModelUtilisateur daoModelUtilisateur;
	DAOModelPays daoModelPays;

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

	public String modifierUtilisateur() {
		getEnsemblePays();
		daoModelFicheUtilisateur.update(ficheUtilisateur);
		daoModelUtilisateur.update(utilisateur);
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
			ensemblePays = daoModelPays.listerPays();
			cache.setEnsemblePays(ensemblePays);
		} else {
			ensemblePays = cache.getEnsemblePays();
		}

		System.out.println(cache);
		System.out.println(ensemblePays.toString());
		return ensemblePays;
	}

	/**
	 * @param ensemblePays the ensemblePays to set
	 */
	public void setEnsemblePays(List<Pays> ensemblePays) {
		this.ensemblePays = ensemblePays;
	}

	/**
	 * @return the cachePays
	 */
	public Cache getCache() {
		return cache;
	}

	/**
	 * @param cachePays the cachePays to set
	 */
	public void setCache(Cache cache) {
		this.cache = cache;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.Preparable#prepare()
	 */
	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}
}