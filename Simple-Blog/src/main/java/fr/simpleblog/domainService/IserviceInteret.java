package fr.simpleblog.domainService;

import java.util.HashSet;

import fr.simpleblog.beans.Interet;

public interface IserviceInteret extends Iservice<Interet> {

	public HashSet<Interet> listInteret();
	
	public HashSet<Interet> listInteretById(int i);
}