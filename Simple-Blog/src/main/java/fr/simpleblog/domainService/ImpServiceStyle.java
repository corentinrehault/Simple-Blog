/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.List;

import fr.simpleblog.beans.Style;
import fr.simpleblog.model.DaoHql.ImpDaoHqlStyle;

/**
 * @author dao303
 *
 */
public class ImpServiceStyle extends ImpService<Style> implements IserviceStyle {

	ImpDaoHqlStyle impDaoHqlStyle;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceStyle#listerStyle()
	 */
	@Override
	public List<Style> listStyle() {
		return impDaoHqlStyle.listStyle();
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceStyle#readById(int)
	 */
	@Override
	public Style readById(int i) {
		return impDaoHqlStyle.readById(i);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceStyle#updateById(int)
	 */
	@Override
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
