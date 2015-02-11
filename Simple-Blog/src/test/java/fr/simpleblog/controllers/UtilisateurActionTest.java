package fr.simpleblog.controllers;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.simpleblog.controllers.UtilisateurAction;
import baseTest.BaseTest;







/**
 * @author Altenide-mov
 * Tests unitaires du controller User
 *
 */
public class UtilisateurActionTest extends BaseTest {


	@Resource
	@Autowired
	private UtilisateurAction utilisateurAction;

//	@Test
//	public final void testdeconnecterUtilisateur() {
//
//		String result = null;
//		sessionMap = super.sessionMap;
//
//		utilisateurAction.setSession(sessionMap);
//
//		//sessionMap.clear();
//
//		result =  utilisateurAction.deconnecterUtilisateur();
//
//		Assert.assertTrue("Session vide", utilisateurAction.getSessionMap().isEmpty());
//
//		System.out.println("le result : " + result);
//
//		Assert.assertNotNull("methode OK", utilisateurAction.deconnecterUtilisateur());
//
//		Assert.assertTrue("La methode ne retourne pas success", result.equals("success"));
//
//
//
//	}

//	@Test
//	public final void testutilisateurAutorite() {
//
//		sessionMap = super.sessionMap;
//		sessionMap.put("authority", "user");
//		utilisateurAction.setSession(sessionMap);
//		System.out.println(sessionMap);
//		Assert.assertFalse("authority user", utilisateurAction.utilisateurAutorite().equals("success"));
//		sessionMap.put("authority", "admin");
//		utilisateurAction.setSession(sessionMap);
//		System.out.println(sessionMap);
//		Assert.assertTrue("authority admin", utilisateurAction.utilisateurAutorite().equals("success"));
//
//	}

	@Test
	public final void testajouterUtilisateur() {
		
		String result = null;
		
		result = utilisateurAction.ajouterUtilisateur();
		
		System.out.println("testajouterutilisateur " + result);
		
		Assert.assertTrue("ajouterutilisateur", result.equals("success"));
		
	}
	
//	@Test
//	public final void testconnecterUtilisateur () {
//		
//		String result = null;
//		
//		result = utilisateurAction.connecterUtilisateur();
//		
//		System.out.println("testconnecterutilisateur " + result);
//		
//		Assert.assertTrue("connecterutilisateur", result.equals("success"));
//		
//	}

}

