/**
 * 
 */
package fr.simpleblog.domainService;

import fr.simpleblog.beans.Commentaire;
import fr.simpleblog.model.interfaces.IdaoModelCommentaire;

/**
 * @author dao303
 *
 */
public class ImpServiceCommentaire implements IserviceCommentaire {
	
	IdaoModelCommentaire idaoModelCommentaire;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#create(java.lang.Object)
	 */
	@Override
	public Commentaire create(Commentaire x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#read(java.lang.Object)
	 */
	@Override
	public Commentaire read(Commentaire x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#update(java.lang.Object)
	 */
	@Override
	public Commentaire update(Commentaire x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(Commentaire x) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceCommentaire#validerCommentaire()
	 */
	@Override
	public void validerCommentaire() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceCommentaire#listerCommentaire()
	 */
	@Override
	public void listerCommentaire() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the idaoModelCommentaire
	 */
	public IdaoModelCommentaire getIdaoModelCommentaire() {
		return idaoModelCommentaire;
	}

	/**
	 * @param idaoModelCommentaire the idaoModelCommentaire to set
	 */
	public void setIdaoModelCommentaire(IdaoModelCommentaire idaoModelCommentaire) {
		this.idaoModelCommentaire = idaoModelCommentaire;
	}

}
