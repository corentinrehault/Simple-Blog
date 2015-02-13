/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.Style;
import fr.simpleblog.model.DaoHql.ImpDaoHqlStyle;

/**
 * @author dao303
 *
 */
public class ImpServiceStyle extends ImpService<Style> implements IserviceStyle {

	public ImpServiceStyle() {
		System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");
	}

	public ImpDaoHqlStyle impDaoHqlStyle;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceStyle#listerStyle()
	 */
	@Override
	@Transactional
	@Cacheable(value="dataCache")
	public List<Style> listStyle() {

		System.err.println("ERROR in !! @Cacheable(value=dataCache) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return impDaoHqlStyle.listStyle();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceStyle#readById(int)
	 */
	@Override
	@Transactional
	@Cacheable(value="dataCache")
	public Style readById(int i) {

		System.err.println("ERROR in !! @Cacheable(value=dataCache) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return impDaoHqlStyle.readById(i);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceStyle#updateById(int)
	 */
	@Override
	@Transactional
	public Style updateById(int styleId) {
		return impDaoHqlStyle.updateById(styleId);
	}

	/**
	 * @return the impDaoHqlStyle
	 */
	public ImpDaoHqlStyle getImpDaoHqlStyle() {
		return impDaoHqlStyle;
	}

	/**
	 * @param impDaoHqlStyle the impDaoHqlStyle to set
	 */
	public void setImpDaoHqlStyle(ImpDaoHqlStyle impDaoHqlStyle) {
		this.impDaoHqlStyle = impDaoHqlStyle;
	}

}
