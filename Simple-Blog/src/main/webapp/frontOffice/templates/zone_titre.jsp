
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="col-sm-6 titre">
	<nav class="blog-nav">
		<s:a namespace="/" action="index" cssClass="blog-nav-item">LOGO</s:a>
		<s:a namespace="/" action="index" cssClass="blog-nav-item">titredublog</s:a>
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
	<h1>
		<s:property value="#session" />
	</h1>
</div>