/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.Pays;
import fr.simpleblog.model.DaoHql.ImpDaoHqlPays;

/**
 * @author dao303
 *
 */
public class ImpServicePays extends ImpService<Pays> implements IservicePays {

	public ImpDaoHqlPays impDaoHqlPays;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IservicePays#listerPays()
	 */
	@Override
	@Transactional
//	@Cacheable(value="dataCache")
	public List<Pays> listPays() {
		System.err.println("????????????????????????????????????????????");
		return impDaoHqlPays.listPays();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IservicePays#createList(java.util.List)
	 */
	@Override
	@Transactional
	public List<Pays> createList(List<Pays> ensemblePays) {
		return impDaoHqlPays.createList(ensemblePays);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IservicePays#readByName(java.lang.String)
	 */
	@Override
	@Transactional
	public Pays readByName(String name) {
		return impDaoHqlPays.readByName(name);
	}

	/**
	 * @return the impDaoHqlPays
	 */
	public ImpDaoHqlPays getImpDaoHqlPays() {
		return impDaoHqlPays;
	}

	/**
	 * @param impDaoHqlPays the impDaoHqlPays to set
	 */
	public void setImpDaoHqlPays(ImpDaoHqlPays impDaoHqlPays) {
		this.impDaoHqlPays = impDaoHqlPays;
	}

}
