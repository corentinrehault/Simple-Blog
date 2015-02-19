package fr.simpleblog.domainService;

import java.util.Set;

import fr.simpleblog.beans.Categorie;

public interface IserviceCategorie extends Iservice<Categorie> {

	public Set<Categorie> listCategorie();
	
	public Categorie readCategorieByName(Categorie categorie);
}