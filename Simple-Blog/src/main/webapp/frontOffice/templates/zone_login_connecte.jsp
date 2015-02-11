<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="col-sm-6 identification">
	Bonjour
	<s:property value="%{#Utilisateur.prenom}" />
	<br> Nous sommes le
	<s:date name="%{new java.util.Date()}"
		format="%{getText('date.locale')}" />
	<hr>
	<s:date name="date" />
	<nav class="blog-nav">
		<s:a namespace="/backOffice" action="accesbackoffice"
			cssClass="blog-nav-item">Accès administration</s:a>
		<a href=<spring:url value="/logout" /> class="blog-nav-item">Déconnexion</a>
	</nav>
</div>