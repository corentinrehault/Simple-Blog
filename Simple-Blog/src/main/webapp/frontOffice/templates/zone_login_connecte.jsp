<%@taglib prefix="s" uri="/struts-tags"%>

<div class="col-sm-6 identification">
	Bonjour
	<s:property value="nomUtilisateur" />
	<br> Nous sommes le
	<s:date name="dateAujourdhui" format="dd/MM/yyyy" />
	<nav class="blog-nav">
		<s:a namespace="backOffice" action="accesadmin.action"
			cssClass="blog-nav-item">Acc�s administration</s:a>
		<s:a namespace="frontOffice" action="deconnexion.action"
			cssClass="blog-nav-item">D�connexion</s:a>
	</nav>
</div>