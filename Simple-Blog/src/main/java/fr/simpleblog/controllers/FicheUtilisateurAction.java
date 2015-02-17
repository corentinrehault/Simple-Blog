package fr.simpleblog.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import fr.simpleblog.beans.*;
import fr.simpleblog.domainService.IserviceFicheUtilisateur;
import fr.simpleblog.domainService.IserviceInteret;
import fr.simpleblog.domainService.IservicePays;
import fr.simpleblog.domainService.IserviceStyle;
import fr.simpleblog.domainService.IserviceUtilisateur;

public class FicheUtilisateurAction extends ActionSupport implements SessionAware {
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

	private Style style;
	private Pays pays;
	private Interet interet;

	private List<Interet> interets;
	private List<Pays> ensemblePays;
	private List<Style> styles;

	private Map<String,Object> sessionMap;


	private IserviceFicheUtilisateur impServiceFicheUtilisateur;
	private IserviceUtilisateur impServiceUtilisateur;
	private IservicePays impServicePays;
	private IserviceInteret impServiceInteret;
	private IserviceStyle impServiceStyle;



	public String testo() {
		System.out.println("in coontroolller");
		style = impServiceStyle.readById(2);
		System.out.println("in control");
		return SUCCESS;


	}

	public String listerFicheUtilisateur() {
		return null;
	}

	public void creerFicheUtilisateur() {

	}

	public void supprimerFicheUtilisateur() {

	}

	public void modifierFicheUtilisateur() {

	}

	public String lireFicheUtilisateur() {

		return SUCCESS;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	@Override
	public void setSession(Map<String, Object> map) {
		this.sessionMap = map;
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
	 * @return the fichesUtilisateur
	 */
	public ArrayList<String> getFichesUtilisateur() {
		return fichesUtilisateur;
	}

	/**
	 * @param fichesUtilisateur the fichesUtilisateur to set
	 */
	public void setFichesUtilisateur(ArrayList<String> fichesUtilisateur) {
		this.fichesUtilisateur = fichesUtilisateur;
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
	 * @return the style
	 */
	public Style getStyle() {
		return style;
	}

	/**
	 * @param style the style to set
	 */
	public void setStyle(Style style) {
		this.style = style;
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
	public List<Interet> readInterets() {
		interets = impServiceInteret.listInteret();
		return interets;
	}

	/**
	 * @param interets the interets to set
	 */
	public void setInterets(List<Interet> interets) {
		this.interets = interets;
	}

	/**
	 * @return the ensemblePays
	 */
	public List<Pays>  readEnsemblePays() {
		ensemblePays = impServicePays.listPays();
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
	public List<Style> readStyles() {
		styles = impServiceStyle.listStyle();
		return styles;
	}

	/**
	 * @param styles the styles to set
	 */
	public void setStyles(List<Style> styles) {
		this.styles = styles;
	}

	/**
	 * @return the sessionMap
	 */
	public Map<String, Object> getSessionMap() {
		return sessionMap;
	}

	/**
	 * @param sessionMap the sessionMap to set
	 */
	public void setSessionMap(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	/**
	 * @return the impServiceFicheUtilisateur
	 */
	public IserviceFicheUtilisateur getImpServiceFicheUtilisateur() {
		return impServiceFicheUtilisateur;
	}

	/**
	 * @param impServiceFicheUtilisateur the impServiceFicheUtilisateur to set
	 */
	public void setImpServiceFicheUtilisateur(
			IserviceFicheUtilisateur impServiceFicheUtilisateur) {
		this.impServiceFicheUtilisateur = impServiceFicheUtilisateur;
	}

	/**
	 * @return the impServiceUtilisateur
	 */
	public IserviceUtilisateur getImpServiceUtilisateur() {
		return impServiceUtilisateur;
	}

	/**
	 * @param impServiceUtilisateur the impServiceUtilisateur to set
	 */
	public void setImpServiceUtilisateur(IserviceUtilisateur impServiceUtilisateur) {
		this.impServiceUtilisateur = impServiceUtilisateur;
	}

	/**
	 * @return the impServicePays
	 */
	public IservicePays getImpServicePays() {
		return impServicePays;
	}

	/**
	 * @param impServicePays the impServicePays to set
	 */
	public void setImpServicePays(IservicePays impServicePays) {
		this.impServicePays = impServicePays;
	}

	/**
	 * @return the impServiceInteret
	 */
	public IserviceInteret getImpServiceInteret() {
		return impServiceInteret;
	}

	/**
	 * @param impServiceInteret the impServiceInteret to set
	 */
	public void setImpServiceInteret(IserviceInteret impServiceInteret) {
		this.impServiceInteret = impServiceInteret;
	}

	/**
	 * @return the impServiceStyle
	 */
	public IserviceStyle getImpServiceStyle() {
		return impServiceStyle;
	}

	/**
	 * @param impServiceStyle the impServiceStyle to set
	 */
	public void setImpServiceStyle(IserviceStyle impServiceStyle) {
		this.impServiceStyle = impServiceStyle;
	}

}