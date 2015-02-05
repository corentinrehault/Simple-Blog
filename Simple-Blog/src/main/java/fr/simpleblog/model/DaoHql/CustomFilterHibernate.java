/**
 * 
 */
package fr.simpleblog.model.DaoHql;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate4.support.OpenSessionInViewFilter;



/**
 * @author dao303
 *
 */
public class CustomFilterHibernate  extends OpenSessionInViewFilter {

	/**
	 * Log4J the logger.
	 */
	private static final Logger LOG = Logger.getLogger(CustomFilterHibernate.class);

	/**
	 * default constructor.
	 */
	public CustomFilterHibernate() {
		super();
		System.out.println("<<<========= OPENING SESSION HIBERNATE =========>>>");
	}

}