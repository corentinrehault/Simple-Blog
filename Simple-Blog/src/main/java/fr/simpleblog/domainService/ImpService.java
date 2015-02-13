/**
 * 
 */
package fr.simpleblog.domainService;

import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.model.DaoHql.ImpDaoHql;

/**
 * @author dao303
 * @param <X>
 *
 */
public class ImpService<X> implements Iservice<X> {

	public ImpDaoHql<X> impDaoHql;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#create(java.lang.Object)
	 */
	@Override
	@Transactional
	public X create(X x) {
		return impDaoHql.create(x);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#read(java.lang.Class, int)
	 */
	@Override
	@Transactional
	public X read(Class<?> clazz, int id) {
		return (X) impDaoHql.read(clazz, id);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#update(java.lang.Object)
	 */
	@Override
	@Transactional
	public X update(X x) {
		return impDaoHql.update(x);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#delete(java.lang.Object)
	 */
	@Override
	@Transactional
	public boolean delete(X x) {
		impDaoHql.delete(x);
		return true;
	}

	/**
	 * @return the impDaoHql
	 */
	public ImpDaoHql<X> getImpDaoHql() {
		return impDaoHql;
	}

	/**
	 * @param impDaoHql the impDaoHql to set
	 */
	public void setImpDaoHql(ImpDaoHql<X> impDaoHql) {
		this.impDaoHql = impDaoHql;
	}

}
