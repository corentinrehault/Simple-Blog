/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.Interet;
import fr.simpleblog.model.interfaces.IdaoModelInteret;

/**
 * @author dao303
 *
 */
public class ImpServiceInteret extends ImpService<Interet> implements IserviceInteret{

	public IdaoModelInteret impAccessDaoInteret;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceInteret#listInteret()
	 */
	@Override
	@Cacheable(value="dataCache")
	public List<Interet> listInteret() {
		return impAccessDaoInteret.listInteret();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceInteret#listInteretById(int)
	 */
	@Override
	@Transactional
	public List<Interet> listInteretById(int i) {
		return impAccessDaoInteret.listInteretById(i);
	}

	/**
	 * @return the impAccessDaoInteret
	 */
	public IdaoModelInteret getImpAccessDaoInteret() {
		return impAccessDaoInteret;
	}

	/**
	 * @param impAccessDaoInteret the impAccessDaoInteret to set
	 */
	public void setImpAccessDaoInteret(IdaoModelInteret impAccessDaoInteret) {
		this.impAccessDaoInteret = impAccessDaoInteret;
	}

}
