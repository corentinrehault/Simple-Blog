/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.List;

import fr.simpleblog.beans.Style;
import fr.simpleblog.model.interfaces.IDAOModelStyle;

/**
 * @author dao303
 *
 */
public class ImpServiceStyle implements IserviceStyle {
	
	IDAOModelStyle idaoModelStyle;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#create(java.lang.Object)
	 */
	@Override
	public Style create(Style x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#read(java.lang.Object)
	 */
	@Override
	public Style read(Style x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#update(java.lang.Object)
	 */
	@Override
	public Style update(Style x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(Style x) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceStyle#listerStyle()
	 */
	@Override
	public List<Style> listerStyle() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceStyle#readById(int)
	 */
	@Override
	public Style readById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceStyle#updateById(int)
	 */
	@Override
	public Style updateById(int styleId) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the idaoModelStyle
	 */
	public IDAOModelStyle getIdaoModelStyle() {
		return idaoModelStyle;
	}

	/**
	 * @param idaoModelStyle the idaoModelStyle to set
	 */
	public void setIdaoModelStyle(IDAOModelStyle idaoModelStyle) {
		this.idaoModelStyle = idaoModelStyle;
	}

}
