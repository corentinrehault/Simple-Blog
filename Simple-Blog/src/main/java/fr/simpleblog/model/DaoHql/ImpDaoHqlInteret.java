/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.Interet;
import fr.simpleblog.model.interfaces.IdaoModelInteret;

/**
 * @author dao303
 *
 */
public class ImpDaoHqlInteret extends ImpDaoHql<Interet> implements IdaoModelInteret {

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelInteret#listInteret()
	 */
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Interet> listInteret() {

		getSession();
		List<Interet> interets;

		try {
			interets = session.createQuery("from Interet").list();
			session.disconnect();
		} catch(HibernateException e) {
			interets=null;
			e.printStackTrace();
		}

		//		System.out.println("SecondLevelCacheHitCount = " 
		//				+ session.getSessionFactory().getStatistics().getSecondLevelCacheHitCount());
		return interets;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelInteret#listInteretById(int)
	 */
	@Override
	public List<Interet> listInteretById(int i) {
		return null;
	}

}
