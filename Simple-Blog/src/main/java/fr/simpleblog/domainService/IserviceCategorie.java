package fr.simpleblog.domainService;

import fr.simpleblog.beans.Categorie;

public interface IserviceCategorie extends Iservice<Categorie> {

	public void listerCategorie();
}