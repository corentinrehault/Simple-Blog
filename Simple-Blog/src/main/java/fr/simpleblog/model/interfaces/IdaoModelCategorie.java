package fr.simpleblog.model.interfaces;

import java.util.Set;

import fr.simpleblog.beans.Categorie;

public interface IdaoModelCategorie extends IdaoCrud<Categorie> {

	public Set<Categorie> listCategorie();
	
	public Categorie readCategorieByName(Categorie categorie);
}