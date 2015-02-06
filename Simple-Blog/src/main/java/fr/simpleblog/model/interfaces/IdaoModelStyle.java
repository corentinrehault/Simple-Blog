package fr.simpleblog.model.interfaces;

import java.util.List;

import fr.simpleblog.beans.Style;

public interface IdaoModelStyle extends IdaoCrud<Style> {

	public List<Style> listStyle();

	public Style readById(int i);

	public Style updateById(int styleId);
}