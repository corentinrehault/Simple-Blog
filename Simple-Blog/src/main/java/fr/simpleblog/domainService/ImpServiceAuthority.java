/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.Authority;
import fr.simpleblog.model.DaoHql.ImpDaoHqlAuthority;

/**
 * @author dao303
 *
 */
public class ImpServiceAuthority extends ImpService<Authority> implements IserviceAuthority {

	public ImpDaoHqlAuthority impDaoHqlAuthority;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IServiceAuthority#listAuthority()
	 */
	@Override
	@Transactional
	public Set<Authority> listAuthority() {
		return impDaoHqlAuthority.listAuthority();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IServiceAuthority#listAuthorityByUserId(fr.simpleblog.beans.Utilisateur)
	 */
	@Override
	@Transactional
	public Set<Authority> listAuthorityByUserId(int i) {
		return impDaoHqlAuthority.listAuthorityByUserId(i);
	}

	/**
	 * @return the impDaoHqlAuthority
	 */
	public ImpDaoHqlAuthority getImpDaoHqlAuthority() {
		return impDaoHqlAuthority;
	}

	/**
	 * @param impDaoHqlAuthority the impDaoHqlAuthority to set
	 */
	public void setImpDaoHqlAuthority(ImpDaoHqlAuthority impDaoHqlAuthority) {
		this.impDaoHqlAuthority = impDaoHqlAuthority;
	}

}
