/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.Set;

import fr.simpleblog.beans.Authority;
import fr.simpleblog.model.interfaces.IdaoModelAuthority;

/**
 * @author dao303
 *
 */
public class ImpServiceAuthority implements IserviceAuthority {
	
	IdaoModelAuthority idaoModelAuthority;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#create(java.lang.Object)
	 */
	@Override
	public Authority create(Authority x) {
		// TODO Auto-generated method stub
		return idaoModelAuthority.create(x);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#read(java.lang.Object)
	 */
	@Override
	public Authority read(Authority x) {
		// TODO Auto-generated method stub
		return idaoModelAuthority.read(x);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#update(java.lang.Object)
	 */
	@Override
	public Authority update(Authority x) {
		// TODO Auto-generated method stub
		return idaoModelAuthority.update(x);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(Authority x) {
		// TODO Auto-generated method stub
		return idaoModelAuthority.delete(x);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IServiceAuthority#listAuthority()
	 */
	@Override
	public Set<Authority> listAuthority() {
		// TODO Auto-generated method stub
		return idaoModelAuthority.listAuthority();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IServiceAuthority#listAuthorityByUserId(fr.simpleblog.beans.Utilisateur)
	 */
	@Override
	public Set<Authority> listAuthorityByUserId(int i) {
		// TODO Auto-generated method stub
		return idaoModelAuthority.listAuthorityByUserId(i);
	}

	/**
	 * @return the idaoModelAuthority
	 */
	public IdaoModelAuthority getIdaoModelAuthority() {
		return idaoModelAuthority;
	}

	/**
	 * @param idaoModelAuthority the idaoModelAuthority to set
	 */
	public void setIdaoModelAuthority(IdaoModelAuthority idaoModelAuthority) {
		this.idaoModelAuthority = idaoModelAuthority;
	}

}
