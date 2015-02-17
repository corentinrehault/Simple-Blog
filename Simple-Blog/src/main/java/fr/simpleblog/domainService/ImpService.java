/**
 * 
 */
package fr.simpleblog.domainService;

import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.model.interfaces.IdaoCrud;

/**
 * @author dao303
 * @param <X>
 *
 */
public class ImpService<X> implements Iservice<X> {

	public IdaoCrud<X> impAccessDao;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#create(java.lang.Object)
	 */
	@Override
	@Transactional
	public X create(X x) {
		return impAccessDao.create(x);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#read(java.lang.Class, int)
	 */
	@Override
	@Transactional
	public X read(Class<?> clazz, int id) {
		return (X) impAccessDao.read(clazz, id);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#update(java.lang.Object)
	 */
	@Override
	@Transactional
	public X update(X x) {
		return impAccessDao.update(x);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#delete(java.lang.Object)
	 */
	@Override
	@Transactional
	public boolean delete(X x) {
		impAccessDao.delete(x);
		return true;
	}

	/**
	 * @return the impAccessDao
	 */
	public IdaoCrud<X> getImpAccessDao() {
		return impAccessDao;
	}

	/**
	 * @param impAccessDao the impAccessDao to set
	 */
	public void setImpAccessDao(IdaoCrud<X> impAccessDao) {
		this.impAccessDao = impAccessDao;
	}

}
