/**
 * 
 */
package fr.simpleblog.domainService;

import fr.simpleblog.beans.FicheUtilisateur;
import fr.simpleblog.model.interfaces.IdaoModelFicheUtilisateur;

/**
 * @author dao303
 *
 */
public class ImpServiceFicheUtilisateur implements IserviceFicheUtilisateur {
	
	IdaoModelFicheUtilisateur idaoModelFicheUtilisateur;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#create(java.lang.Object)
	 */
	@Override
	public FicheUtilisateur create(FicheUtilisateur x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#read(java.lang.Object)
	 */
	@Override
	public FicheUtilisateur read(FicheUtilisateur x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#update(java.lang.Object)
	 */
	@Override
	public FicheUtilisateur update(FicheUtilisateur x) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(FicheUtilisateur x) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceFicheUtilisateur#listerFicheUtilisateur()
	 */
	@Override
	public void listerFicheUtilisateur() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceFicheUtilisateur#readById(int)
	 */
	@Override
	public FicheUtilisateur readById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceFicheUtilisateur#updateById(fr.simpleblog.beans.FicheUtilisateur, int)
	 */
	@Override
	public FicheUtilisateur updateById(FicheUtilisateur ficheUtilisateur, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the idaoModelFicheUtilisateur
	 */
	public IdaoModelFicheUtilisateur getIdaoModelFicheUtilisateur() {
		return idaoModelFicheUtilisateur;
	}

	/**
	 * @param idaoModelFicheUtilisateur the idaoModelFicheUtilisateur to set
	 */
	public void setIdaoModelFicheUtilisateur(
			IdaoModelFicheUtilisateur idaoModelFicheUtilisateur) {
		this.idaoModelFicheUtilisateur = idaoModelFicheUtilisateur;
	}

}
