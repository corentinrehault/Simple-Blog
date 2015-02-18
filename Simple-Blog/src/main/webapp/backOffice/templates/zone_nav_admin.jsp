<%@taglib prefix="s" uri="/struts-tags"%>

<div class="sidebar-module">
	<h4>G�rer les articles</h4>
	<ol class="list-unstyled">
		<li><a href="#">Lister les articles</a></li>
		<li><a href="#">Cr�er un article</a></li>
		<li><a href="#">Supprimer un article</a></li>
		<li></li>
		<li><s:a namespace="/backOffice" action="fetcharticles">R�cup�rer articles XML</s:a></li>
	</ol>
</div>
<div class="sidebar-module">
	<h4>G�rer les commentaires</h4>
	<ol class="list-unstyled">
		<li><a href="#">Lister les commentaires</a></li>
		<li><a href="#">Publier les commentaires</a></li>
		<li><a href="#">Supprimer un commentaire</a></li>
		<li><a href="#">Modifier un commentaire</a></li>
	</ol>
</div>
<div class="sidebar-module">
	<h4>G�rer les utilisateurs</h4>
	<ol class="list-unstyled">
		<li><a href="#">Lister les utilisateurs</a></li>
		<li><a href="#">Supprimer un utilisateur</a></li>
		<li><a href="#">Ajouter un utilisateur</a></li>
		<li><a href="#">Envoyer un mail</a></li>
		<li></li>
		<li><s:a namespace="/backOffice" action="profil">Modifier mon profil</s:a></li>
	</ol>
</div>
<div class="sidebar-module">
	<h4>G�rer le Blog</h4>
	<ol class="list-unstyled">
		<li><a href="#">Modifier le style par d�faut</a></li>
	</ol>
</div>