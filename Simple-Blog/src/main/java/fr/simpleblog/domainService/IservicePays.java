package fr.simpleblog.domainService;

import java.util.List;

import fr.simpleblog.beans.Pays;

public interface IservicePays extends Iservice<Pays> {

	public List<Pays> listerPays();
	
	public List<Pays> createList(List<Pays> ensemblePays);
	
	public Pays readByName(String name);
}