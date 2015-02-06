/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import java.util.HashSet;

import fr.simpleblog.beans.Interet;
import fr.simpleblog.domainService.IserviceInteret;
import fr.simpleblog.model.interfaces.IdaoModelInteret;

/**
 * @author dao303
 *
 */
public class ImpDaoHqlInteret extends ImpDaoHql<Interet> implements IdaoModelInteret, IserviceInteret {

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelInteret#listInteret()
	 */
	@Override
	public HashSet<Interet> listInteret() {
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelInteret#listInteretById(int)
	 */
	@Override
	public HashSet<Interet> listInteretById(int i) {
		return null;
	}

}
