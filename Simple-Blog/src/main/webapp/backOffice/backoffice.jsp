<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>

<title>Blog Template - Index</title>
<tiles:insertAttribute name="head"></tiles:insertAttribute>

</head>
<body>
	<div class="container">
		<div class="row row-eq-height">
			<tiles:insertAttribute name="zone_titre"></tiles:insertAttribute>
			<tiles:insertAttribute name="zone_login_backoffice"></tiles:insertAttribute>
		</div>
	</div>

	<div class="container">

		<%-- 		<tiles:insertAttribute name="blogheader"></tiles:insertAttribute> --%>

		<div class="row">
			<div class="col-sm-9 blog-main">
				<tiles:insertAttribute name="zone_posts"></tiles:insertAttribute>
				<tiles:insertAttribute name="zone_pages"></tiles:insertAttribute>
			</div>

			<!-- /.blog-main -->

			<%-- 			<s:if test="%{#session.SPRING_SECURITY_CONTEXT != null}"> --%>
			<!-- 					<div class="col-sm-3 blog-sidebar"> -->
			<%-- 						<tiles:insertAttribute name="zone_nav_admin"></tiles:insertAttribute> --%>
			<!-- 					</div> -->
			<%-- 			</s:if> --%>
			<%-- 			<s:else> --%>
			<!-- 				<div class="col-sm-3 blog-sidebar"> -->
			<%-- 					<tiles:insertAttribute name="zone_nav_contrib"></tiles:insertAttribute> --%>
			<!-- 				</div> -->
			<%-- 			</s:else> --%>

			<security:authorize access="hasRole('ROLE_ADMIN')">
				<div class="col-sm-3 blog-sidebar">
					<tiles:insertAttribute name="zone_nav_admin"></tiles:insertAttribute>
				</div>
			</security:authorize>
			<security:authorize access="!hasRole('ROLE_ADMIN')">
				<div class="col-sm-3 blog-sidebar">
					<tiles:insertAttribute name="zone_nav_contrib"></tiles:insertAttribute>
				</div>
			</security:authorize>

			<!-- /.blog-sidebar -->

		</div>
		<!-- /.row -->

	</div>
	<!-- /.container -->

	<footer class="blog-footer">
		<tiles:insertAttribute name="zone_pied"></tiles:insertAttribute>
	</footer>


	<tiles:insertAttribute name="footStrap"></tiles:insertAttribute>


</body>
</html>