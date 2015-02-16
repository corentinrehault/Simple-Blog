
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<div class="col-sm-6 titre">
	<nav class="blog-nav">


		<%-- 		<security:authorize access="hasRole('ROLE_ADMIN')"> --%>
		<s:a namespace="/" action="index" cssClass="blog-nav-item">LOGO</s:a>
		<%-- 		</security:authorize> --%>

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

	<h5>

<%-- 		<s:property --%>
<%-- 			value="#session.SPRING_SECURITY_CONTEXT.authentication.principal.username" /> --%>
<%-- 		<s:property value="#session" /> --%>

	</h5>
	<
	<s:property value="style.nom"/>
</div>