package fr.simpleblog.controllers.othercontrollers;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthentifierIntercepteur extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2475783888748098745L;

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.AbstractInterceptor#init()
	 */
	public void init() {
		System.out.println("Avant la méthode d'action");
	}


	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.AbstractInterceptor#intercept(com.opensymphony.xwork2.ActionInvocation)
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {

		System.out.println("Dans la méthode intercept");
		Map<String, Object> session=invocation.getInvocationContext().getSession();

		if(session.containsKey("SessionId")) {

			return invocation.invoke();

		} else {

			return Action.LOGIN;

		}

	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.AbstractInterceptor#destroy()
	 */
	public void destroy() {

		System.out.println("Après la méthode d'action");
	}
}