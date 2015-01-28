package fr.simpleblog.model.interfaces;

import java.util.HashSet;

import fr.simpleblog.beans.Interet;

public interface IDAOModelInteret extends IDAOCRUD<Interet> {

	public HashSet<Interet> listerInteret();
}