<%@taglib prefix="s" uri="/struts-tags"%>

<div class="sidebar-module">
	<h4>
		Liste des <a href=#>5</a> derniers articles publiés
	</h4>
	<ol class="list-unstyled">
		<li><a href="#">Article 1</a></li>
		<li><a href="#">Article 2</a></li>
		<li><a href="#">Article 3</a></li>
		<li><a href="#">Article 4</a></li>
		<li><a href="#">Article 5</a></li>
	</ol>
</div>
<div class="sidebar-module">
	<h4>Liste des catégories du blog</h4>
	<ol class="list-unstyled">
		<li><a href="#">Sport</a></li>
		<li><a href="#">Actualités</a></li>
		<li><a href="#">Littérature</a></li>
		<li><a href="#">Jeux</a></li>
		<li><a href="#">Autre...</a></li>
	</ol>
</div>
<div class="sidebar-module">
	<h4>Liste des liens amis</h4>
	<ol class="list-unstyled">
		<li><a href="https://github.com">GitHub</a></li>
		<li><a href="https://twitter.com">Twitter</a></li>
		<li><a href="https://www.facebook.com">Facebook</a></li>
	</ol>
</div>
<div class="sidebar-module">
	<h4>Espace utilisateur</h4>
	<ol class="list-unstyled">
		<li><s:a namespace="/backOffice" action="profil">Modifier mon profil</s:a></li>
	</ol>
</div>