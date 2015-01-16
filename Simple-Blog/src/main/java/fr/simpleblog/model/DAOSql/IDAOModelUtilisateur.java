package fr.simpleblog.model.DAOSql;

import fr.simpleblog.beans.Utilisateur;

public interface IDAOModelUtilisateur extends IDAOCRUD<Utilisateur> {

	public void listerUtilisateur();
}