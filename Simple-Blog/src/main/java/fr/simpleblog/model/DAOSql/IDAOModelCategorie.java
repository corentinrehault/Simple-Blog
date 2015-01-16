package fr.simpleblog.model.DAOSql;

import fr.simpleblog.beans.Categorie;

public interface IDAOModelCategorie extends IDAOCRUD<Categorie> {

	public void listerCategorie();
}