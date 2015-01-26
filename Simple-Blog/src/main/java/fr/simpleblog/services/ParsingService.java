package fr.simpleblog.services;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import fr.simpleblog.beans.Pays;

/*
 * SAX, DOM, JAXB, XSTREAM, JDOM
 */
public class ParsingService {

	private Pays pays;
	private List<Pays> ensemblePays = new LinkedList<Pays>();

	public List<Pays> listerPays() throws MalformedURLException, IOException {

		try {

			// création d'une fabrique de parseurs SAX
			SAXParserFactory factory = SAXParserFactory.newInstance();
			// création d'un parseur SAX
			SAXParser saxParser = factory.newSAXParser();
			// lecture d'un fichier XML avec appel à PaysHandler
			PaysHandler paysHandler = new PaysHandler();
			//InputStream pour une URL, File pour une URI
			InputStream urlPays = new URL("http://www.altenide.com/pays.xml").openStream();
			
			saxParser.parse(urlPays, paysHandler);
			ensemblePays = paysHandler.getEnsemblePays();
			

		} catch (ParserConfigurationException e) {
			System.out.println("Erreur de configuration du parseur");
			System.out.println("Lors de l'appel à newSAXParser()");
			e.printStackTrace();
		} catch (SAXException e) {
			System.out.println("Erreur de parsing");
			System.out.println("Lors de l'appel à parse()");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erreur d'entrée/sortie");
			System.out.println("Lors de l'appel à parse()");
			e.printStackTrace();
		} finally {
			new URL("http://www.altenide.com/pays.xml").openStream().close();
		}
		
		System.out.println(ensemblePays);
		return ensemblePays;
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

}