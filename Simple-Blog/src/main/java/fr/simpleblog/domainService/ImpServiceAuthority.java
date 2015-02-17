/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.Authority;
import fr.simpleblog.model.interfaces.IdaoModelAuthority;

/**
 * @author dao303
 *
 */
public class ImpServiceAuthority extends ImpService<Authority> implements IserviceAuthority {

	public IdaoModelAuthority impAccessDaoAuthority;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IServiceAuthority#listAuthority()
	 */
	@Override
	@Transactional
	public Set<Authority> listAuthority() {
		return impAccessDaoAuthority.listAuthority();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IServiceAuthority#listAuthorityByUserId(fr.simpleblog.beans.Utilisateur)
	 */
	@Override
	@Transactional
	public Set<Authority> listAuthorityByUserId(int i) {
		return impAccessDaoAuthority.listAuthorityByUserId(i);
	}

	/**
	 * @return the impAccessDaoAuthority
	 */
	public IdaoModelAuthority getImpAccessDaoAuthority() {
		return impAccessDaoAuthority;
	}

	/**
	 * @param impAccessDaoAuthority the impAccessDaoAuthority to set
	 */
	public void setImpAccessDaoAuthority(IdaoModelAuthority impAccessDaoAuthority) {
		this.impAccessDaoAuthority = impAccessDaoAuthority;
	}

}
