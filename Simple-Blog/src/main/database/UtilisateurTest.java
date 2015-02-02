/**
 * 
 */
package beans;

import static org.junit.Assert.assertEquals;

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
	public void testSetLangue() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#getLangue()}.
	 */
	public void testGetLangue() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setEnabled(boolean)}.
	 */
	public void testSetEnabled() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setAccountNonExpired(boolean)}.
	 */
	public void testSetAccountNonExpired() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setAccountNonLocked(boolean)}.
	 */
	public void testSetAccountNonLocked() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setCredentialsNonExpired(boolean)}.
	 */
	public void testSetCredentialsNonExpired() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#toString()}.
	 */
	public void testToString() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#getAuthorities()}.
	 */
	public void testGetAuthorities() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setAuthorities(java.util.HashSet)}.
	 */
	public void testSetAuthorities() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#isAccountNonExpired()}.
	 */
	public void testIsAccountNonExpired() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#isAccountNonLocked()}.
	 */
	public void testIsAccountNonLocked() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#isCredentialsNonExpired()}.
	 */
	public void testIsCredentialsNonExpired() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#isEnabled()}.
	 */
	public void testIsEnabled() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#getFicheUtilisateur()}.
	 */
	public void testGetFicheUtilisateur() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setFicheUtilisateur(fr.simpleblog.beans.FicheUtilisateur)}.
	 */
	public void testSetFicheUtilisateur() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#getStyle()}.
	 */
	public void testGetStyle() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.simpleblog.beans.Utilisateur#setStyle(fr.simpleblog.beans.Style)}.
	 */
	public void testSetStyle() {
		//fail("Not yet implemented");
	}

}
