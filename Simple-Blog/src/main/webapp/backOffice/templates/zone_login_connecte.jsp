<%@taglib prefix="s" uri="/struts-tags"%>

<div class="col-sm-6 identification">
	Bonjour
	<s:property value="%{#session.sessionprenom}" />
	<br> Nous sommes le
	
	<s:property value="%{new java.util.Date()}" />
	<s:property value="#datenow" />
	
	<hr>
	<s:date  name="%{new java.util.Date()}" />
	<nav class="blog-nav">
		<s:a namespace="/frontOffice" action="connecte"
			cssClass="blog-nav-item">Retour au blog</s:a>
		<s:a namespace="/frontOffice" action="deconnexion"
			cssClass="blog-nav-item">Déconnexion</s:a>
	</nav>
</div>