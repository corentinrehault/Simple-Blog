/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.HashSet;

import fr.simpleblog.beans.Interet;
import fr.simpleblog.model.DaoHql.ImpDaoHqlInteret;

/**
 * @author dao303
 *
 */
public class ImpServiceInteret extends ImpService<Interet> implements IserviceInteret{

	ImpDaoHqlInteret impDaoHqlInteret;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceInteret#listInteret()
	 */
	@Override
	public HashSet<Interet> listInteret() {
		return impDaoHqlInteret.listInteret();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceInteret#listInteretById(int)
	 */
	@Override
	public HashSet<Interet> listInteretById(int i) {
		return impDaoHqlInteret.listInteretById(i);
	}

	/**
	 * @return the impDaoHqlInteret
	 */
	public ImpDaoHqlInteret getImpDaoHqlInteret() {
		return impDaoHqlInteret;
	}

	/**
	 * @param impDaoHqlInteret the impDaoHqlInteret to set
	 */
	public void setImpDaoHqlInteret(ImpDaoHqlInteret impDaoHqlInteret) {
		this.impDaoHqlInteret = impDaoHqlInteret;
	}

}
