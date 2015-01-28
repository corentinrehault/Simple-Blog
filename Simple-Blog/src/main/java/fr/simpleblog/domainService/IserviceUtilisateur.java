package fr.simpleblog.domainService;

import java.util.List;

import fr.simpleblog.beans.Utilisateur;

public interface IserviceUtilisateur extends Iservice<Utilisateur> {

	public List<Utilisateur> listerUtilisateur();

	/**
	 * @param utilisateur
	 * @return
	 */
	public Utilisateur login(Utilisateur utilisateur);
	
}