/**
 * 
 */
package fr.simpleblog.beans;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import baseTest.BaseTest;
import fr.simpleblog.beans.Utilisateur;

/**
 * @author dao303
 *
 */
public class UtilisateurTest extends BaseTest {


	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setNom(java.lang.String)}.
	 */
	@Test
	public void testSetNom() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setNom("test");
		assertEquals("Nom", "test", utilisateur.getNom());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#getNom()}.
	 */
	@Test
	public void testGetNom() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setNom("test");
		assertEquals("Nom", "test", utilisateur.getNom());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setPrenom(java.lang.String)}.
	 */
	@Test
	public void testSetPrenom() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setPrenom("test");
		assertEquals("Prenom", "test", utilisateur.getPrenom());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#getPrenom()}.
	 */
	@Test
	public void testGetPrenom() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setPrenom("test");
		assertEquals("Prenom", "test", utilisateur.getPrenom());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setUsername(java.lang.String)}.
	 */
	@Test
	public void testSetUsername() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setUsername("test");
		assertEquals("Username", "test", utilisateur.getUsername());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#getUsername()}.
	 */
	@Test
	public void testGetUsername() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setUsername("test");
		assertEquals("Username", "test", utilisateur.getUsername());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setPassword(java.lang.String)}.
	 */
	@Test
	public void testSetPassword() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setPassword("test");
		assertEquals("Password", "test", utilisateur.getPassword());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#getPassword()}.
	 */
	@Test
	public void testGetPassword() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setPassword("test");
		assertEquals("Password", "test", utilisateur.getPassword());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setMail(java.lang.String)}.
	 */
	@Test
	public void testSetMail() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setMail("test");
		assertEquals("Mail", "test", utilisateur.getMail());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#getMail()}.
	 */
	@Test
	public void testGetMail() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setMail("test");
		assertEquals("Mail", "test", utilisateur.getMail());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setId(int)}.
	 */
	@Test
	public void testSetId() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setId(1);
		assertEquals("Id", 1, utilisateur.getId());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#getId()}.
	 */
	@Test
	public void testGetId() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setId(1);
		assertEquals("Id", 1, utilisateur.getId());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setAvatar(java.lang.String)}.
	 */
	@Test
	public void testSetAvatar() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setAvatar("test");
		assertEquals("Avatar", "test", utilisateur.getAvatar());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#getAvatar()}.
	 */
	@Test
	public void testGetAvatar() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setAvatar("test");
		assertEquals("Avatar", "test", utilisateur.getAvatar());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setLangue(java.lang.String)}.
	 */
	@Test
	public void testSetLangue() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setLangue("test");
		assertEquals("Langue", "test", utilisateur.getLangue());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#getLangue()}.
	 */
	@Test
	public void testGetLangue() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setLangue("test");
		assertEquals("Langue", "test", utilisateur.getLangue());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setEnabled(boolean)}.
	 */
	@Test
	public void testSetEnabled() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setEnabled(true);
		Assert.assertTrue("Enabled", utilisateur.isEnabled());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setAccountNonExpired(boolean)}.
	 */
	@Test
	public void testSetAccountNonExpired() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setAccountNonExpired(true);
		Assert.assertTrue("NonExpired", utilisateur.isAccountNonExpired());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setAccountNonLocked(boolean)}.
	 */
	@Test
	public void testSetAccountNonLocked() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setAccountNonLocked(true);
		Assert.assertTrue("NonLocked", utilisateur.isAccountNonLocked());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setCredentialsNonExpired(boolean)}.
	 */
	@Test
	public void testSetCredentialsNonExpired() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setCredentialsNonExpired(true);
		Assert.assertTrue("Credentials NonExpired", utilisateur.isCredentialsNonExpired());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#toString()}.
	 */
	@Test
	public void testToString() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setNom("test");
		Assert.assertNotNull("ToString", utilisateur.toString());
	}

	//	/**
	//	 * Test method for {@link fr.simpleblog.beans.Utilisateur#getAuthorities()}.
	//	 */
	//  @Test
	//	public void testGetAuthorities() {
	//		Utilisateur utilisateur = new Utilisateur();
	//		utilisateur.setAvatar("test");
	//		assertEquals("Avatar", "test", utilisateur.getAvatar());
	//	}
	//
	//	/**
	//	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setAuthorities(java.util.HashSet)}.
	//	 */
	//  @Test
	//	public void testSetAuthorities() {
	//		Utilisateur utilisateur = new Utilisateur();
	//		utilisateur.setAvatar("test");
	//		assertEquals("Avatar", "test", utilisateur.getAvatar());
	//	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#isAccountNonExpired()}.
	 */
	@Test
	public void testIsAccountNonExpired() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setAccountNonExpired(true);
		Assert.assertNotNull("Account Nonexpired", utilisateur.isAccountNonExpired());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#isAccountNonLocked()}.
	 */
	@Test
	public void testIsAccountNonLocked() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setAccountNonLocked(true);
		Assert.assertNotNull("Account NonLocked", utilisateur.isAccountNonLocked());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#isCredentialsNonExpired()}.
	 */
	@Test
	public void testIsCredentialsNonExpired() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setCredentialsNonExpired(true);
		Assert.assertNotNull("Credentials NonExpired", utilisateur.isCredentialsNonExpired());
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#isEnabled()}.
	 */
	@Test
	public void testIsEnabled() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setEnabled(true);
		Assert.assertNotNull("Enabled", utilisateur.isEnabled());
	}

	//	/**
	//	 * Test method for {@link fr.simpleblog.beans.Utilisateur#getFicheUtilisateur()}.
	//	 */
	//  @Test
	//	public void testGetFicheUtilisateur() {
	//		Utilisateur utilisateur = new Utilisateur();
	//		utilisateur.setAvatar("test");
	//		assertEquals("Avatar", "test", utilisateur.getAvatar());
	//	}
	//
	//	/**
	//	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setFicheUtilisateur(fr.simpleblog.beans.FicheUtilisateur)}.
	//	 */
	//  @Test
	//	public void testSetFicheUtilisateur() {
	//		Utilisateur utilisateur = new Utilisateur();
	//		utilisateur.setAvatar("test");
	//		assertEquals("Avatar", "test", utilisateur.getAvatar());
	//	}
	//
	//	/**
	//	 * Test method for {@link fr.simpleblog.beans.Utilisateur#getStyle()}.
	//	 */
	//	@Test
	//	public void testGetStyle() {
	//		Utilisateur utilisateur = new Utilisateur();
	//		Style style = new Style();
	//		utilisateur.style.setNom("test");
	//		System.out.println(utilisateur.style);
	//		Assert.assertNotNull("Style", utilisateur.getStyle());
	//	}
	//
	//	/**
	//	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setStyle(fr.simpleblog.beans.Style)}.
	//	 */
	//	@Test
	//	public void testSetStyle() {
	//		Utilisateur utilisateur = new Utilisateur();
	//		utilisateur.style.setNom("test");
	//		assertEquals("Style", "test", utilisateur.style.getNom());
	//	}

}
