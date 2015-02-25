<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/paginator.tld" prefix="pag"%>



<s:action name="compterarticle" namespace="/" executeResult="false"
	var="compte" />

<pag:elements nbreElements="${compte.nbreArticles}"
	nbreParPages="${param['nbre']}" pageCourante="${param['page']}" />

<s:action name="getarticle" namespace="/" executeResult="false"
	var="getarticles" />

<s:iterator value="#getarticles.articles" var="article">
	<%-- 	begin="#parameters.debut" end="#parameters.fin"> --%>
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



<pag:paginator nbreElements="${compte.nbreArticles}"
	nbreParPages="${param['nbre']}" pageCourante="${param['page']}"
	url="${request['javax.servlet.forward.request_uri']}" />

<%-- 	<sj:dialog autoOpen="true">test !</sj:dialog> --%>

<%-- <sj:div class="blog-post" draggable="true"> --%>
<!-- 	<h2 class="blog-post-title">Sample blog post</h2> -->
<!-- 	<h3>Catégorie :</h3> -->
<!-- 	<p> -->
<!-- 		This blog post shows a few different types of content that's supported -->
<!-- 		and styled with Bootstrap. Basic typography, images, and code are all -->
<!-- 		supported. Cum sociis natoque penatibus et magnis <a href="#">dis -->
<!-- 			parturient montes</a>, nascetur ridiculus mus. Aenean eu leo quam. -->
<!-- 		Pellentesque ornare sem lacinia quam venenatis vestibulum. Sed posuere -->
<!-- 		consectetur est at lobortis. Cras mattis consectetur purus sit amet -->
<!-- 		fermentum. -->
<!-- 	<p> -->
<!-- 		Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis -->
<!-- 		consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla -->
<!-- 		sed consectetur. -->
<!-- 	</p> -->
<!-- 	<p>Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor -->
<!-- 		auctor. Duis mollis, est non commodo luctus, nisi erat porttitor -->
<!-- 		ligula, eget lacinia odio sem nec elit. Morbi leo risus, porta ac -->
<!-- 		consectetur ac, vestibulum at eros.</p> -->
<!-- 	<p>Donec ullamcorper nulla non metus auctor fringilla. Nulla vitae -->
<!-- 		elit libero, a pharetra augue.</p> -->
<!-- 	<p>Cras mattis consectetur purus sit amet fermentum. Sed posuere -->
<!-- 		consectetur est at lobortis.</p> -->

<!-- 	<p class="blog-post-meta"> -->
<!-- 		Date de publication : -->
<%-- 		<s:property value="" /> --%>
<!-- 		/ Auteur : -->
<%-- 		<s:property value="" /> --%>
<!-- 		/ <a href="#">Voir les commentaires (nbre commentaires)</a> -->
<!-- 	</p> -->
<!-- 	<p class="blog-post-meta"> -->
<!-- 		<a href=#>Commenter cet article</a> -->
<!-- 	</p> -->
<%-- </sj:div> --%>
<!-- <!-- /.blog-post -->

<!-- <div class="blog-post"> -->
<!-- 	<h2 class="blog-post-title"> -->
<%-- 		<s:property value="" /> --%>
<!-- 		Another blog post -->
<!-- 	</h2> -->
<!-- 	<h3> -->
<!-- 		Catégorie : -->
<%-- 		<s:property value="" /> --%>
<!-- 	</h3> -->
<%-- 	<s:property value="" /> --%>
<!-- 	<p> -->
<!-- 		Cum sociis natoque penatibus et magnis <a href="#">dis parturient -->
<!-- 			montes</a>, nascetur ridiculus mus. Aenean eu leo quam. Pellentesque -->
<!-- 		ornare sem lacinia quam venenatis vestibulum. Sed posuere consectetur -->
<!-- 		est at lobortis. Cras mattis consectetur purus sit amet fermentum. -->
<!-- 	</p> -->
<!-- 	<blockquote> -->
<!-- 		<p> -->
<%-- 			Curabitur blandit tempus porttitor. <strong>Nullam quis --%>
<%-- 				risus eget urna mollis</strong> ornare vel eu leo. Nullam id dolor id nibh --%>
<!-- 			ultricies vehicula ut id elit. -->
<!-- 		</p> -->
<!-- 	</blockquote> -->
<!-- 	<p> -->
<!-- 		Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis -->
<!-- 		consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla -->
<!-- 		sed consectetur. -->
<!-- 	</p> -->
<!-- 	<p>Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor -->
<!-- 		auctor. Duis mollis, est non commodo luctus, nisi erat porttitor -->
<!-- 		ligula, eget lacinia odio sem nec elit. Morbi leo risus, porta ac -->
<!-- 		consectetur ac, vestibulum at eros.</p> -->

<!-- 	<p class="blog-post-meta"> -->
<!-- 		Date de publication : -->
<%-- 		<s:property value="" /> --%>
<!-- 		/ Auteur : -->
<%-- 		<s:property value="" /> --%>
<!-- 		/ <a href="#">Voir les commentaires (nbre commentaires)</a> -->
<!-- 	</p> -->
<!-- 	<p class="blog-post-meta"> -->
<!-- 		<a href=#>Commenter cet article</a> -->
<!-- 	</p> -->
<!-- </div> -->
<!-- <!-- /.blog-post -->

<!-- <div class="blog-post"> -->
<!-- 	<h2 class="blog-post-title"> -->
<%-- 		<s:property value="" /> --%>
<!-- 		New feature -->
<!-- 	</h2> -->
<!-- 	<h3> -->
<!-- 		Catégorie : -->
<%-- 		<s:property value="" /> --%>
<!-- 	</h3> -->
<%-- 	<s:property value="" /> --%>
<!-- 	<p>Cum sociis natoque penatibus et magnis dis parturient montes, -->
<!-- 		nascetur ridiculus mus. Aenean lacinia bibendum nulla sed consectetur. -->
<!-- 		Etiam porta sem malesuada magna mollis euismod. Fusce dapibus, tellus -->
<!-- 		ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa -->
<!-- 		justo sit amet risus.</p> -->
<!-- 	<ul> -->
<!-- 		<li>Praesent commodo cursus magna, vel scelerisque nisl -->
<!-- 			consectetur et.</li> -->
<!-- 		<li>Donec id elit non mi porta gravida at eget metus.</li> -->
<!-- 		<li>Nulla vitae elit libero, a pharetra augue.</li> -->
<!-- 	</ul> -->
<!-- 	<p> -->
<!-- 		Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis -->
<!-- 		consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla -->
<!-- 		sed consectetur. -->
<!-- 	</p> -->
<!-- 	<p>Donec ullamcorper nulla non metus auctor fringilla. Nulla vitae -->
<!-- 		elit libero, a pharetra augue.</p> -->
<!-- 	<p class="blog-post-meta"> -->
<!-- 		Date de publication : -->
<%-- 		<s:property value="" /> --%>
<!-- 		/ Auteur : -->
<%-- 		<s:property value="" /> --%>
<!-- 		/ <a href="#">Voir les commentaires (nbre commentaires)</a> -->
<!-- 	</p> -->
<!-- 	<p class="blog-post-meta"> -->
<!-- 		<a href=#>Commenter cet article</a> -->
<!-- 	</p> -->
<!-- </div> -->