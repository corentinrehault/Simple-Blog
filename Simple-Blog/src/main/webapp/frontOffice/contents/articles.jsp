<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<s:iterator value="articles" var="article">
	<div class="blog-post">
		<h2 class="blog-post-title">
			<s:property value="titre" />
		</h2>
		<h3>
			<s:property value="categorie.nom" />
		</h3>
		<s:property value="contenu" escapeHtml="false" />
		<p class="blog-post-meta">
			Date de publication :
			<s:property value="dateCreation" />
			/ Auteur :
			<s:property value="auteur.nom" />
			/ <a href="#">Voir les commentaires (nbre commentaires)</a>
		</p>
		<p class="blog-post-meta">
			<a href=#>Commenter cet article</a>
		</p>
	</div>
</s:iterator>
