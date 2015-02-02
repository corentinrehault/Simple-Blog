package baseTest;




import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.StrutsSpringJUnit4TestCase;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.mock.web.MockServletContext;
import org.springframework.orm.hibernate4.SessionFactoryUtils;
import org.springframework.orm.hibernate4.SessionHolder;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import fr.simpleblog.controllers.UtilisateurAction;
import fr.simpleblog.services.ApplicationContextHolder;



/**
 * 
 * @author ajaidka
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:fr/simpleblog/spring/spring-master.xml" 	
		}
)


public class BaseTest extends StrutsSpringJUnit4TestCase<UtilisateurAction> {
	
	
	// fabrique de session pour hibernate
	public SessionFactory sessionFactory;
	@Autowired(required=true)
	public MockHttpServletRequest request;
	public MockHttpServletResponse response;	
	public Map<String, Object> sessionMap ;
	private MockHttpSession session;
	private MockServletContext  mockServletContext;

	
	@Before
	public void setUp() throws Exception {
		
		
	// seulement dans le cas d'utilisation d'hibernate //
		
	TransactionSynchronizationManager.bindResource(sessionFactory, new SessionHolder(sessionFactory.openSession()));
		request = new MockHttpServletRequest();
        super.request =  new MockHttpServletRequest();
		
		response = new MockHttpServletResponse();
		session = new MockHttpSession();
		sessionMap = new HashMap<String, Object>();
		
		
		//contexte spring
		ApplicationContext context = ApplicationContextHolder.getContext();
		
		super.setApplicationContext(context);
		
		// seulement dans le cas d'utilisation de spring security //
		
		AuthenticationManager authenticationManager = (AuthenticationManager) context.getBean("authenticationManager");
		final ProviderManager providerManager = (ProviderManager) authenticationManager;
		final Authentication auth = providerManager.authenticate(new UsernamePasswordAuthenticationToken("d@d.com", "d@d.com"));
		SecurityContextHolder.getContext().setAuthentication(auth);
		
		//envoi du context spring dans la session
		sessionMap.put("SPRING_SECURITY_CONTEXT", SecurityContextHolder.getContext());
	}



	@After
	public void tearDown() throws Exception {
		// seulement dans le cas d'utilisation d'hibernate //
		// seulement dans le cas d'utilisation de spring security //
		
		SessionHolder sessionHolder = (SessionHolder) TransactionSynchronizationManager.unbindResource(sessionFactory);
		SessionFactoryUtils.closeSession(sessionHolder.getSession());
		SecurityContextHolder.getContext().setAuthentication(null);
	}
	
	

	
	@Test
	public void executeTest() throws Exception {
		
		System.err.println("no test");
	 
	}
	
  


}
