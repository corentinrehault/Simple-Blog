package fr.simpleblog.model.interfaces;

import java.util.List;
import fr.simpleblog.beans.Interet;

public interface IdaoModelInteret extends IdaoCrud<Interet> {

	public List<Interet> listInteret();
	
	public List<Interet> listInteretById(int i);
}