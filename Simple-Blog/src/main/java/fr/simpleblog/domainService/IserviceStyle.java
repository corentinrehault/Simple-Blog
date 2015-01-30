package fr.simpleblog.domainService;

import java.util.List;

import fr.simpleblog.beans.Style;

public interface IserviceStyle extends Iservice<Style> {

	public List<Style> listerStyle();

	public Style readById(int i);

	public Style updateById(int styleId);
}