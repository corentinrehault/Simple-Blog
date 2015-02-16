/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.Interet;
import fr.simpleblog.model.DaoHql.ImpDaoHqlInteret;

/**
 * @author dao303
 *
 */
public class ImpServiceInteret extends ImpService<Interet> implements IserviceInteret{

	public ImpDaoHqlInteret impDaoHqlInteret;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceInteret#listInteret()
	 */
	@Override
	@Transactional
//	@Cacheable(value="dataCache")
	public List<Interet> listInteret() {
		return impDaoHqlInteret.listInteret();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceInteret#listInteretById(int)
	 */
	@Override
	@Transactional
	public List<Interet> listInteretById(int i) {
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
