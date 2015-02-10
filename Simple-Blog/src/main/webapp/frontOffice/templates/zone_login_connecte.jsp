<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

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
		<s:a action="logout"
		cssClass="blog-nav-item">Déconnexion</s:a>
		<a href="j_spring_security_logout">bye</a>
	</nav>
</div>