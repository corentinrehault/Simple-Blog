<%@taglib prefix="s" uri="/struts-tags"%>

<div class="col-sm-6 identification">

	<s:form  method="post" action="j_spring_security_check"
		cssClass="navbar-form navbar-left">
		<s:textfield type="text" name="j_username" value=""
			placeholder="%{getText('login')}" cssClass="form-control"></s:textfield>
		<s:textfield type="password" name="j_password" value="" 
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