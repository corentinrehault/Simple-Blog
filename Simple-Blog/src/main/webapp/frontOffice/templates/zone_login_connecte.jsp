<%@taglib prefix="s" uri="/struts-tags"%>

<div class="col-sm-6 identification">
	Bonjour
	<s:property value="%{#session.sessionprenom}" />
	<br> Nous sommes le
	<s:bean name="java.util.date" id="datenow"></s:bean>

	<s:property value="#datenow" />
	
	<s:property value="locale"/>
	<hr/>
	<s:date name="date"  />
	<nav class="blog-nav">
		<s:a namespace="/backOffice" action="accesadmin"
			cssClass="blog-nav-item">Accès administration</s:a>
		<s:a namespace="frontOffice" action="deconnexion"
			cssClass="blog-nav-item">Déconnexion</s:a>
	</nav>
</div>