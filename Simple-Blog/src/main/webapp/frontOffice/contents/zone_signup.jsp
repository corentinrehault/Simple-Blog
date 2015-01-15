<%@ taglib prefix="s" uri="/struts-tags"%>

<s:if test="errors.size()>0">
	<div id="message_erreur">
		<label>Les erreurs suivantes se sont produites : </label>
		<ul>
			<s:fielderror />
		</ul>
	</div>
</s:if>

<div class="form">
	<h2 class="blog-post-title">
		<s:property value="getText('registration.form')" />
	</h2>
	<s:form action="ajouterUtilisateur" method="post">

		<s:textfield label="%{getText('nom')}" type="text" name="nom" value=""
			placeholder="%{getText('nom')}" size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('prenom')}" type="text" name="prenom"
			value="" placeholder="%{getText('prenom')}" size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('login')}" type="text" name="login"
			value="" placeholder="%{getText('login')}" size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('password')}" type="password"
			name="password" value="" placeholder="%{getText('password')}"
			size="20" maxlength="20"></s:textfield>
		<s:textfield label="%{getText('password.again')}" type="password"
			name="password" value="" placeholder="%{getText('password')}"
			size="20" maxlength="20"></s:textfield>
		<s:submit type="submit" value="%{getText('register')} !"></s:submit>
	</s:form>
</div>