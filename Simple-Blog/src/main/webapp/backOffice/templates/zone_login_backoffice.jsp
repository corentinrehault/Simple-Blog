<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="col-sm-6 identification">
	Bonjour
	<s:property value="%{#session.prenom}" />
	<br> Nous sommes le
	<s:date name="%{new java.util.Date()}"
		format="%{getText('date.locale')}" />
	<hr>
	<nav class="blog-nav">
		<s:a namespace="/frontOffice" action="connecte"
			cssClass="blog-nav-item">Retour au blog</s:a>
		<a href=<spring:url value="/logout" /> class="blog-nav-item">Déconnexion</a>
	</nav>
</div>