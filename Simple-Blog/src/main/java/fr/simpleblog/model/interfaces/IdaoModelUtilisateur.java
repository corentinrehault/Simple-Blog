package fr.simpleblog.model.interfaces;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import fr.simpleblog.beans.Utilisateur;

public interface IdaoModelUtilisateur extends IdaoCrud<Utilisateur> {

	public List<Utilisateur> listUtilisateur();

	/**
	 * @param utilisateur
	 * @return
	 */
	public Utilisateur login(Utilisateur utilisateur);
	
	public UserDetails loadUserByUsername(String username);
}