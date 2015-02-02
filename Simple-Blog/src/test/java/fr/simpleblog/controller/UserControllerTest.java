//package fr.simpleblog.controller;
//
//import javax.annotation.Resource;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import fr.simpleblog.controllers.UtilisateurAction;
//import baseTest.BaseTest;
//
//
//
//
//
//
//
///**
// * @author Altenide-mov
// * Tests unitaires du controller User
// *
// */
//public class UserControllerTest extends BaseTest {
//	
//
//	@Resource
//	private UtilisateurAction utilisateurAction;
//	
//	
//	
//	
//	
//	@Test
//	public final void testdeconnecterUtilisateur() {
//		
//		String result = null;
//		
//		sessionMap = super.sessionMap;
//		
//		sessionMap.clear();
//		
//		result =  utilisateurAction.deconnecterUtilisateur();
//		
//		Assert.assertNotNull("methode OK", utilisateurAction.deconnecterUtilisateur());
//		
//		Assert.assertFalse("La methode ne retourne pas success", result.equals("success"));
//
//	}
//	
//	
//	
//	
//}