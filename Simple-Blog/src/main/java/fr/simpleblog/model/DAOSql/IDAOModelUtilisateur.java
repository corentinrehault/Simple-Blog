package fr.simpleblog.model.DAOSql;

import java.util.List;

import fr.simpleblog.beans.Utilisateur;

public interface IDAOModelUtilisateur extends IDAOCRUD<Utilisateur> {

	public List<Utilisateur> listerUtilisateur();
}