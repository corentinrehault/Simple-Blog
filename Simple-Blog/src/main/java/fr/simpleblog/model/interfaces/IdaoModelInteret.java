package fr.simpleblog.model.interfaces;

import java.util.HashSet;

import fr.simpleblog.beans.Interet;

public interface IdaoModelInteret extends IdaoCrud<Interet> {

	public HashSet<Interet> listInteret();
	
	public HashSet<Interet> listInteretById(int i);
}