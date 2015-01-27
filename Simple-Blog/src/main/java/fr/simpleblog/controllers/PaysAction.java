package fr.simpleblog.controllers;

import fr.simpleblog.beans.*;
import fr.simpleblog.model.DAOSql.DAOModelPays;

import java.util.*;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.util.profiling.UtilTimerStack;

public class PaysAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8912467765575954412L;

	private Pays pays;
	private List<Pays> ensemblePays;

	DAOModelPays daoModelPays;

	/**
	 * @return the pays
	 */
	public Pays getPays() {
		return pays;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(Pays pays) {
		this.pays = pays;
	}

	/**
	 * @return the ensemblePays
	 */
	public List<Pays> getEnsemblePays() {
		return ensemblePays;
	}

	/**
	 * @param ensemblePays the ensemblePays to set
	 */
	public void setEnsemblePays(List<Pays> ensemblePays) {
		this.ensemblePays = ensemblePays;
	}

	public List<Pays> listerPays() {

		ensemblePays = (List<Pays>) daoModelPays.listerPays();
		return ensemblePays;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.Preparable#prepare()
	 */
	@Override
	public void prepare() throws Exception {
		UtilTimerStack.setActive(true);

	}

	/**
	 * @return the daoModelPays
	 */
	public DAOModelPays getDaoModelPays() {
		return daoModelPays;
	}

	/**
	 * @param daoModelPays the daoModelPays to set
	 */
	public void setDaoModelPays(DAOModelPays daoModelPays) {
		this.daoModelPays = daoModelPays;
	}
}