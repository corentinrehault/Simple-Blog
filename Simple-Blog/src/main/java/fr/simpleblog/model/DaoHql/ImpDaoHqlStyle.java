/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.Style;
import fr.simpleblog.model.interfaces.IdaoModelStyle;

/**
 * @author dao303
 *
 */
public class ImpDaoHqlStyle extends ImpDaoHql<Style> implements IdaoModelStyle {

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelStyle#listerStyle()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Style> listStyle() {

		getSession();
		List<Style> styles;

		try {
			styles = session.createQuery("from Style").list();
			session.disconnect();
		} catch(HibernateException e) {
			styles=null;
			e.printStackTrace();
		}

		//		System.out.println("SecondLevelCacheHitCount = " 
		//				+ session.getSessionFactory().getStatistics().getSecondLevelCacheHitCount());

		for(Style s : styles) {
			System.err.println(s);
		}

		return styles;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelStyle#readById(int)
	 */
	@Override
	@Transactional
	public Style readById(int i) {
		session = getSession();

		System.err.println("in ImpDaoHqlStyle");
		Style style = (Style) session.get(Style.class, i);

		System.err.println("the style to cache =>" + style);

		return style;

	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.model.interfaces.IdaoModelStyle#updateById(int)
	 */
	@Override
	public Style updateById(int styleId) {
		return null;
	}

}
