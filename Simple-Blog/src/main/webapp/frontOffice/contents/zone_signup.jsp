<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="form">
	<h2 class="blog-post-title">
		<s:property value="getText('registration.form')" />
	</h2>
	<s:form action="ajouter" method="post">

		<s:textfield label="%{getText('nom')}" type="text"
			name="utilisateur.nom" value="" placeholder="%{getText('nom')}"
			size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('prenom')}" type="text"
			name="utilisateur.prenom" value="" placeholder="%{getText('prenom')}"
			size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('login')}" type="text"
			name="utilisateur.login" value="" placeholder="%{getText('login')}"
			size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('password')}" type="password"
			name="utilisateur.password" value=""
			placeholder="%{getText('password')}" size="20" maxlength="20"></s:textfield>
<%-- 		<s:textfield label="%{getText('password.again')}" type="password" --%>
<%-- 			name="utilisateur.password" value="" --%>
<%-- 			placeholder="%{getText('password')}" size="20" maxlength="20"></s:textfield> --%>
		<s:submit type="submit" value="%{getText('register')} !"></s:submit>
	</s:form>
</div>