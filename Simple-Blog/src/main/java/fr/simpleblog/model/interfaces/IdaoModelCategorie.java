package fr.simpleblog.model.interfaces;

import fr.simpleblog.beans.Categorie;

public interface IdaoModelCategorie extends IdaoCrud<Categorie> {

	public void listerCategorie();
}