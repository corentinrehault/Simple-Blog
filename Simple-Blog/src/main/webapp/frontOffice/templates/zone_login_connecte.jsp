<%@taglib prefix="s" uri="/struts-tags"%>

<div class="col-sm-6 identification">
	Bonjour
	<s:property value="%{#session.prenom}" />
	<br> Nous sommes le
	<s:date name="%{new java.util.Date()}"
		format="%{getText('date.locale')}" />
	<hr>
	<s:date name="date" />
	<nav class="blog-nav">
		<s:a namespace="/backOffice" action="accesbackoffice"
			cssClass="blog-nav-item">Accès administration</s:a>
		<s:a namespace="/frontOffice" action="deconnexion"
			cssClass="blog-nav-item">Déconnexion</s:a>
	</nav>
</div>