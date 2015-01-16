<%@taglib prefix="s" uri="/struts-tags"%>

<div class="col-sm-6 identification">
	Bonjour
	<s:property value="nomUtilisateur" />
	<br> Nous sommes le
	<s:date name="dateAujourdhui" format="dd/MM/yyyy" />
	<nav class="blog-nav">
		<s:a namespace="/frontOffice" action="connecte"
			cssClass="blog-nav-item">Retour au blog</s:a>
		<s:a namespace="/frontOffice" action="deconnexion"
			cssClass="blog-nav-item">Déconnexion</s:a>
	</nav>
</div>