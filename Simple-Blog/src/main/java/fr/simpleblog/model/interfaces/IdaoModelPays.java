package fr.simpleblog.model.interfaces;

import java.util.List;

import fr.simpleblog.beans.Pays;

public interface IdaoModelPays extends IdaoCrud<Pays> {

	public List<Pays> listerPays();
	
	public List<Pays> createList(List<Pays> ensemblePays);
	
	public Pays readByName(String name);
}