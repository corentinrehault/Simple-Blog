package fr.simpleblog.model.interfaces;

import java.util.List;

import fr.simpleblog.beans.Style;

public interface IDAOModelStyle extends IDAOCRUD<Style> {

	public List<Style> listerStyle();
}