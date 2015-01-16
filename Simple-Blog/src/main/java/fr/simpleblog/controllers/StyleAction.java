package fr.simpleblog.controllers;

import fr.simpleblog.beans.*;
import java.util.*;

public class StyleAction {
	private Style style;
	private ArrayList<String> styles;

	/**
	 * @return the style
	 */
	public Style getStyle() {
		return style;
	}

	/**
	 * @param style the style to set
	 */
	public void setStyle(Style style) {
		this.style = style;
	}

	/**
	 * @return the styles
	 */
	public ArrayList<String> getStyles() {
		return styles;
	}

	/**
	 * @param styles the styles to set
	 */
	public void setStyles(ArrayList<String> styles) {
		this.styles = styles;
	}

	public String listerStyle() {
		throw new UnsupportedOperationException();
	}

	public void creerStyle() {
		throw new UnsupportedOperationException();
	}

	public void supprimerStyle() {
		throw new UnsupportedOperationException();
	}

	public void modifierStyle() {
		throw new UnsupportedOperationException();
	}
}