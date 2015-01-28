/**
 * 
 */
package fr.simpleblog.domainService;

import java.util.List;

import fr.simpleblog.beans.Utilisateur;
import fr.simpleblog.model.interfaces.IDAOModelUtilisateur;

/**
 * @author dao303
 * Implémentaton des services.
 */
public class ImpServiceUtilisateur implements IserviceUtilisateur {
	
	IDAOModelUtilisateur idaoModelUtilisateur;

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#create(java.lang.Object)
	 */
	@Override
	public Utilisateur create(Utilisateur x) {
		return idaoModelUtilisateur.create(x);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#read(java.lang.Object)
	 */
	@Override
	public Utilisateur read(Utilisateur x) {
		return idaoModelUtilisateur.read(x);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#update(java.lang.Object)
	 */
	@Override
	public Utilisateur update(Utilisateur x) {
		return idaoModelUtilisateur.update(x);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.Iservice#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(Utilisateur x) {

		return idaoModelUtilisateur.delete(x);
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceUtilisateur#listerUtilisateur()
	 */
	@Override
	public List<Utilisateur> listerUtilisateur() {
		return idaoModelUtilisateur.listerUtilisateur();
	}

	/**
	 * @return the iDAOModelUtilisateur
	 */
	public IDAOModelUtilisateur getiDAOModelUtilisateur() {
		return idaoModelUtilisateur;
	}

	/**
	 * @param iDAOModelUtilisateur the iDAOModelUtilisateur to set
	 */
	public void setiDAOModelUtilisateur(IDAOModelUtilisateur iDAOModelUtilisateur) {
		this.idaoModelUtilisateur = iDAOModelUtilisateur;
	}

	/* (non-Javadoc)
	 * @see fr.simpleblog.domainService.IserviceUtilisateur#login(fr.simpleblog.beans.Utilisateur)
	 */
	@Override
	public Utilisateur login(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return idaoModelUtilisateur.login(utilisateur);
	}

	/**
	 * @return the idaoModelUtilisateur
	 */
	public IDAOModelUtilisateur getIdaoModelUtilisateur() {
		return idaoModelUtilisateur;
	}

	/**
	 * @param idaoModelUtilisateur the idaoModelUtilisateur to set
	 */
	public void setIdaoModelUtilisateur(IDAOModelUtilisateur idaoModelUtilisateur) {
		this.idaoModelUtilisateur = idaoModelUtilisateur;
	}



	
	
}
