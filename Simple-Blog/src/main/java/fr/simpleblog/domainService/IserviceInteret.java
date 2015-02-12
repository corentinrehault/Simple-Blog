package fr.simpleblog.domainService;

import java.util.List;

import fr.simpleblog.beans.Interet;

public interface IserviceInteret extends Iservice<Interet> {

	public List<Interet> listInteret();
	
	public List<Interet> listInteretById(int i);
}