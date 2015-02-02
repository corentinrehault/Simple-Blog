/**
 * 
 */
package fr.simpleblog.domainService;

import fr.simpleblog.beans.Categorie;
import fr.simpleblog.model.interfaces.IdaoModelCategorie;

/**
 * @author dao303
 *
 */
public class ImpServiceCategorie implements IserviceCategorie {
	
	IdaoModelCategorie idaoModelCategorie;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#create(java.lang.Object)
	 */
	@Override
	public Categorie create(Categorie x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#read(java.lang.Object)
	 */
	@Override
	public Categorie read(Categorie x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#update(java.lang.Object)
	 */
	@Override
	public Categorie update(Categorie x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(Categorie x) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceCategorie#listerCategorie()
	 */
	@Override
	public void listerCategorie() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the idaoModelCategorie
	 */
	public IdaoModelCategorie getIdaoModelCategorie() {
		return idaoModelCategorie;
	}

	/**
	 * @param idaoModelCategorie the idaoModelCategorie to set
	 */
	public void setIdaoModelCategorie(IdaoModelCategorie idaoModelCategorie) {
		this.idaoModelCategorie = idaoModelCategorie;
	}

}
