package fr.simpleblog.domainService;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import fr.simpleblog.beans.Utilisateur;

public interface IserviceUtilisateur extends Iservice<Utilisateur> {

	public List<Utilisateur> listUtilisateur();

	/**
	 * @param utilisateur
	 * @return
	 */
	public Utilisateur login(Utilisateur utilisateur);

	public UserDetails loadUserByUsername(String username);

}