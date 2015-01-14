<%@taglib prefix="s" uri="/struts-tags"%>

<div class="col-sm-6 identification">

	<s:form method="post" action="connexion.action"
		cssClass="navbar-form navbar-left">
		<s:textfield type="text" name="login" value="" placeholder="Login"
			cssClass="form-control"></s:textfield>
		<s:textfield type="password" name="password" value=""
			placeholder="Password" cssClass="form-control"></s:textfield>
		<s:submit method="doLogin" value="login" cssClass="btn btn-success"></s:submit>
	</s:form>

	<nav class="blog-nav">
		<s:a namespace="frontOffice" action="enregistrer.action"
			cssClass="blog-nav-item">S'enregistrer</s:a>
		<s:a namespace="frontOffice" action="perdu.action"
			cssClass="blog-nav-item">Mdp perdu ?</s:a>
	</nav>
</div>