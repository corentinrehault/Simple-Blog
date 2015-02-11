/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import fr.simpleblog.beans.Pays;
import fr.simpleblog.domainService.IservicePays;
import fr.simpleblog.model.interfaces.IdaoModelPays;

/**
 * @author dao303
 *
 */
public class ImpDaoHqlPays extends ImpDaoHql<Pays> implements IdaoModelPays, IservicePays {

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelPays#listerPays()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Pays> listPays() {

		getSession();
		List<Pays> ensemblePays;
		Query query = null;

		try {
			query = session.createQuery("from Pays");
			session.flush();
			query.setCacheable(true);
			query.setCacheRegion("query.ensemblePays");
		} catch (HibernateException e) {
			ensemblePays=null;
			e.printStackTrace();
		}

		ensemblePays = query.list();
		return ensemblePays;

	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelPays#createList(java.util.List)
	 */
	@Override
	public List<Pays> createList(List<Pays> ensemblePays) {

		getSession();

		try {

			for (int i = 0; i < ensemblePays.size(); i++) {
				Pays c = (Pays)ensemblePays.get(i);
				System.out.println("==>" + c);
				session.save(c);
			}
			//session.save(ensemblePays);

			session.flush();

		} catch (HibernateException e) {
			ensemblePays=null;
			e.printStackTrace();
		}

		return ensemblePays;

	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelPays#readByName(java.lang.String)
	 */
	@Override
	public Pays readByName(String name) {
		return null;
	}

}
