
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="col-sm-6 titre">
	<nav class="blog-nav">
		<a class="blog-nav-item" href="#">LOGO</a> <a class="blog-nav-item"
			href="#">titredublog</a>
		<s:property value="getText('langue.change')" />
		:
			<s:a href="?request_locale=FR" class="blog-nav-item">
				<s:property value="getText('langue.fr')" />
			</s:a>
			<s:a href="?request_locale=EN" class="blog-nav-item">
				<s:property value="getText('langue.en')" />
			</s:a>
		<a class="blog-nav-item" href="#">Style</a>
	</nav>
	<h1><s:property value="#session"/> </h1>
</div>