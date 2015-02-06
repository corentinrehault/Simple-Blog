/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.List;

import fr.simpleblog.beans.Pays;
import fr.simpleblog.model.DaoHql.ImpDaoHqlPays;

/**
 * @author dao303
 *
 */
public class ImpServicePays extends ImpService<Pays> implements IservicePays {
	
	ImpDaoHqlPays impDaoHqlPays;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IservicePays#listerPays()
	 */
	@Override
	public List<Pays> listPays() {
		return impDaoHqlPays.listPays();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IservicePays#createList(java.util.List)
	 */
	@Override
	public List<Pays> createList(List<Pays> ensemblePays) {
		return impDaoHqlPays.createList(ensemblePays);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IservicePays#readByName(java.lang.String)
	 */
	@Override
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
