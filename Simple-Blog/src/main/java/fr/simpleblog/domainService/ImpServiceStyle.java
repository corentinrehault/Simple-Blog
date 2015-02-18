/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import fr.simpleblog.beans.Style;
import fr.simpleblog.model.interfaces.IdaoModelStyle;

/**
 * @author dao303
 *
 */
public class ImpServiceStyle extends ImpService<Style> implements IserviceStyle {

	public ImpServiceStyle() {
		System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");System.err.println("!");
	}

	public IdaoModelStyle impAccessDaoStyle;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceStyle#listerStyle()
	 */
	@Override
	@Cacheable(value="styleCache")
	public List<Style> listStyle() {

		System.err.println("ERROR in !! @Cacheable(value=dataCache) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return impAccessDaoStyle.listStyle();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceStyle#readById(int)
	 */
	@Override
	public Style readById(int i) {

		System.err.println("ERROR in !! @Cacheable(value=dataCache) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return impAccessDaoStyle.readById(i);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceStyle#updateById(int)
	 */
	@Override
	@Transactional
	public Style updateById(int styleId) {
		return impAccessDaoStyle.updateById(styleId);
	}

	/**
	 * @return the impAccessDaoStyle
	 */
	public IdaoModelStyle getImpAccessDaoStyle() {
		return impAccessDaoStyle;
	}

	/**
	 * @param impAccessDaoStyle the impAccessDaoStyle to set
	 */
	public void setImpAccessDaoStyle(IdaoModelStyle impAccessDaoStyle) {
		this.impAccessDaoStyle = impAccessDaoStyle;
	}

}
