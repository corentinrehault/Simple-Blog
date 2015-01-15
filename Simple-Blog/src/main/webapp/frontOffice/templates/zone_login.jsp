<%@taglib prefix="s" uri="/struts-tags"%>

<div class="col-sm-6 identification">

	<s:if test="errors.size()>0">
		<div id="message_erreur">
			<label>Les erreurs suivantes se sont produites : </label>
			<ul>
				<s:fielderror />
			</ul>
		</div>
	</s:if>

	<s:form method="post" action="connexion"
		cssClass="navbar-form navbar-left">
		<s:textfield type="text" name="login" value=""
			placeholder="%{getText('login')}" cssClass="form-control"></s:textfield>
		<s:textfield type="password" name="password" value=""
			placeholder="%{getText('password')}" cssClass="form-control"></s:textfield>
		<s:submit value="%{getText('login.action')}"
			cssClass="btn btn-success"></s:submit>
	</s:form>

	<nav class="blog-nav">
		<s:a action="enregistrer" cssClass="blog-nav-item">
			<s:property value="getText('register')" />
		</s:a>
		<s:a action="perdu" cssClass="blog-nav-item">
			<s:property value="getText('pass.perdu')" /> ?</s:a>
	</nav>
</div>