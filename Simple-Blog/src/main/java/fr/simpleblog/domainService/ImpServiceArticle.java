/**
 * 
 */
package fr.simpleblog.domainService;

import fr.simpleblog.beans.Article;
import fr.simpleblog.model.interfaces.IdaoModelArticle;

/**
 * @author dao303
 *
 */
public class ImpServiceArticle implements IserviceArticle {
	
	IdaoModelArticle idaoModelArticle;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#create(java.lang.Object)
	 */
	@Override
	public Article create(Article x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#read(java.lang.Object)
	 */
	@Override
	public Article read(Article x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#update(java.lang.Object)
	 */
	@Override
	public Article update(Article x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(Article x) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceArticle#listerArticle()
	 */
	@Override
	public void listerArticle() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the idaoModelArticle
	 */
	public IdaoModelArticle getIdaoModelArticle() {
		return idaoModelArticle;
	}

	/**
	 * @param idaoModelArticle the idaoModelArticle to set
	 */
	public void setIdaoModelArticle(IdaoModelArticle idaoModelArticle) {
		this.idaoModelArticle = idaoModelArticle;
	}

}
