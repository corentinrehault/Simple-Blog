/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.List;

import fr.simpleblog.beans.Pays;
import fr.simpleblog.model.interfaces.IdaoModelPays;

/**
 * @author dao303
 *
 */
public class ImpServicePays implements IservicePays {
	
	IdaoModelPays idaoModelPays;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#create(java.lang.Object)
	 */
	@Override
	public Pays create(Pays x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#read(java.lang.Object)
	 */
	@Override
	public Pays read(Pays x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#update(java.lang.Object)
	 */
	@Override
	public Pays update(Pays x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(Pays x) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IservicePays#listerPays()
	 */
	@Override
	public List<Pays> listerPays() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IservicePays#createList(java.util.List)
	 */
	@Override
	public List<Pays> createList(List<Pays> ensemblePays) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IservicePays#readByName(java.lang.String)
	 */
	@Override
	public Pays readByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the idaoModelPays
	 */
	public IdaoModelPays getIdaoModelPays() {
		return idaoModelPays;
	}

	/**
	 * @param idaoModelPays the idaoModelPays to set
	 */
	public void setIdaoModelPays(IdaoModelPays idaoModelPays) {
		this.idaoModelPays = idaoModelPays;
	}

}
