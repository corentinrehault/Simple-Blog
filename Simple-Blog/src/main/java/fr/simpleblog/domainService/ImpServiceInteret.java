/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.HashSet;

import fr.simpleblog.beans.Interet;
import fr.simpleblog.model.interfaces.IdaoModelInteret;

/**
 * @author dao303
 *
 */
public class ImpServiceInteret implements IserviceInteret{

	IdaoModelInteret idaoModelInteret;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#create(java.lang.Object)
	 */
	@Override
	public Interet create(Interet x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#read(java.lang.Object)
	 */
	@Override
	public Interet read(Interet x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#update(java.lang.Object)
	 */
	@Override
	public Interet update(Interet x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(Interet x) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceInteret#listInteret()
	 */
	@Override
	public HashSet<Interet> listInteret() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceInteret#listInteretById(int)
	 */
	@Override
	public HashSet<Interet> listInteretById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the idaoModelInteret
	 */
	public IdaoModelInteret getIdaoModelInteret() {
		return idaoModelInteret;
	}

	/**
	 * @param idaoModelInteret the idaoModelInteret to set
	 */
	public void setIdaoModelInteret(IdaoModelInteret idaoModelInteret) {
		this.idaoModelInteret = idaoModelInteret;
	}

}
