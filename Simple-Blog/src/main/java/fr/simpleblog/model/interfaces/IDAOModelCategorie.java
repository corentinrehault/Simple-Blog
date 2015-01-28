package fr.simpleblog.model.interfaces;

import fr.simpleblog.beans.Categorie;

public interface IDAOModelCategorie extends IDAOCRUD<Categorie> {

	public void listerCategorie();
}