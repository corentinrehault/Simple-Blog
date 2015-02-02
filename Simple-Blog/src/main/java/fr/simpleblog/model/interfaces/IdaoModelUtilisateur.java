package fr.simpleblog.model.interfaces;

import java.util.List;

import fr.simpleblog.beans.Utilisateur;

public interface IdaoModelUtilisateur extends IdaoCrud<Utilisateur> {

	public List<Utilisateur> listerUtilisateur();

	/**
	 * @param utilisateur
	 * @return
	 */
	public Utilisateur login(Utilisateur utilisateur);
}