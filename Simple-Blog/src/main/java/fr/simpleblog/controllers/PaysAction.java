package fr.simpleblog.controllers;

import fr.simpleblog.beans.*;
import fr.simpleblog.domainService.IservicePays;
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

	private IservicePays impServicePays;

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

		ensemblePays = (List<Pays>) impServicePays.listPays();
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
	 * @return the impServicePays
	 */
	public IservicePays getImpServicePays() {
		return impServicePays;
	}

	/**
	 * @param impServicePays the impServicePays to set
	 */
	public void setImpServicePays(IservicePays impServicePays) {
		this.impServicePays = impServicePays;
	}

}