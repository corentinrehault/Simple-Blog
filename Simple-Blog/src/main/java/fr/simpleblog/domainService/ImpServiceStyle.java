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

	public IserviceStyle impServiceStyle;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceStyle#listerStyle()
	 */
	@Override
	@Transactional
	@Cacheable(value="dataCache")
	public List<Style> listStyle() {

		System.err.println("ERROR in !! @Cacheable(value=dataCache) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.err.println("????????????????????????????????????????????");
		return impServiceStyle.listStyle();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceStyle#readById(int)
	 */
	@Override
	@Transactional
	@Cacheable(value="dataCache")
	public Style readById(int i) {

		System.err.println("ERROR in !! @Cacheable(value=dataCache) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return impServiceStyle.readById(i);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceStyle#updateById(int)
	 */
	@Override
	@Transactional
	public Style updateById(int styleId) {
		return impServiceStyle.updateById(styleId);
	}

	/**
	 * @return the impServiceStyle
	 */
	public IserviceStyle getImpServiceStyle() {
		return impServiceStyle;
	}

	/**
	 * @param impServiceStyle the impServiceStyle to set
	 */
	public void setImpServiceStyle(IserviceStyle impServiceStyle) {
		this.impServiceStyle = impServiceStyle;
	}

	



}
