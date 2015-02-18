/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.Pays;
import fr.simpleblog.model.interfaces.IdaoModelPays;

/**
 * @author dao303
 *
 */
public class ImpServicePays extends ImpService<Pays> implements IservicePays {

	public IdaoModelPays impAccessDaoPays;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IservicePays#listerPays()
	 */
	@Override
	@Cacheable(value="paysCache")
	public List<Pays> listPays() {
		System.err.println("dans listPays ????????????????????????????????????????????");
		return impAccessDaoPays.listPays();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IservicePays#createList(java.util.List)
	 */
	@Override
	@Transactional
	public List<Pays> createList(List<Pays> ensemblePays) {
		return impAccessDaoPays.createList(ensemblePays);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IservicePays#readByName(java.lang.String)
	 */
	@Override
	@Transactional
	public Pays readByName(String name) {
		return impAccessDaoPays.readByName(name);
	}

	/**
	 * @return the impAccessDaoPays
	 */
	public IdaoModelPays getImpAccessDaoPays() {
		return impAccessDaoPays;
	}

	/**
	 * @param impAccessDaoPays the impAccessDaoPays to set
	 */
	public void setImpAccessDaoPays(IdaoModelPays impAccessDaoPays) {
		this.impAccessDaoPays = impAccessDaoPays;
	}

}
