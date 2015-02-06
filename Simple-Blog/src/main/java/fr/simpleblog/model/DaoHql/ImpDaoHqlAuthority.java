/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import java.util.Set;

import fr.simpleblog.beans.Authority;
import fr.simpleblog.domainService.IserviceAuthority;
import fr.simpleblog.model.interfaces.IdaoModelAuthority;

/**
 * @author dao303
 *
 */
public class ImpDaoHqlAuthority extends ImpDaoHql<Authority> implements IdaoModelAuthority, IserviceAuthority {

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelAuthority#listAuthority()
	 */
	@Override
	public Set<Authority> listAuthority() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelAuthority#listAuthorityByUserId(int)
	 */
	@Override
	public Set<Authority> listAuthorityByUserId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
