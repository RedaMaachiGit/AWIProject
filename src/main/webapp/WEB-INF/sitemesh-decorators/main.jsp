<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.application-resources"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
    <head>
        <title><fmt:message key="application.title"/></title>
		<style type="text/css" media="screen">
			@import url("${pageContext.request.contextPath}/resources/dojo/resources/dojo.css");
			@import url("${pageContext.request.contextPath}/resources/dijit/themes/tundra/tundra.css");
		</style>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<script src="https://code.jquery.com/jquery-3.1.1.min.js" crossorigin="anonymous"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/dojo/dojo.js" djconfig="parseOnLoad: true" ></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/spring/Spring.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/spring/Spring-Dojo.js"></script>
		<script type="text/javascript">dojo.require("dojo.parser");</script>
		<% if (((HttpServletRequest)pageContext.getRequest()).getServletPath().equals("/login")
				|| ((HttpServletRequest)pageContext.getRequest()).getServletPath().contains("/register")){ %>
		<link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet" type="text/css" /> 
		<% } %>
		<!-- flatly bootstrap css --><link href="${pageContext.request.contextPath}/css/flatly-bootstrap.min.css" rel="stylesheet" type="text/css" />
<%-- 		<!-- bootstrap css --><link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" type="text/css" /> --%>
		<!-- yourtask css --><link href="${pageContext.request.contextPath}/css/yourtask.css" rel="stylesheet" type="text/css" />    
		 
		<% if (((HttpServletRequest)pageContext.getRequest()).getServletPath().equals("/index.jsp")){ %>
		<link href="${pageContext.request.contextPath}/css/dashboard.css" rel="stylesheet" type="text/css" /> 
		<% } %>     
		<% if (((HttpServletRequest)pageContext.getRequest()).getServletPath().equals("/pages/login.jsp")){ %>
		<link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet" type="text/css" /> 
		<% } %>		
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.gif" />
		<decorator:head />
    </head>

	<body class="tundra spring">
<%-- 		<% if (!((HttpServletRequest)pageContext.getRequest()).getServletPath().contains("login")&& !((HttpServletRequest)pageContext.getRequest()).getServletPath().contains("register")){ %> --%>
<%-- 					<% if (((HttpServletRequest)pageContext.getRequest()).getServletPath().contains("su")){ %> --%>
<%-- 		    					<jsp:include page="/WEB-INF/sitemesh-common/headersimpleuser.jsp" /> --%>
<%-- 					<% }else if (((HttpServletRequest)pageContext.getRequest()).getServletPath().contains("sc")){ %>  --%>
<%-- 								<jsp:include page="/WEB-INF/sitemesh-common/headersimplecompany.jsp" /> --%>
<%-- 					<% }else if (((HttpServletRequest)pageContext.getRequest()).getServletPath().contains("admin")){ %>  --%>
<%-- 								<jsp:include page="/WEB-INF/sitemesh-common/headeradmin.jsp" /> --%>
<%-- 					<% }} %>			 --%>

		<% if (!((HttpServletRequest)pageContext.getRequest()).getServletPath().equals("/index.jsp")
		    		&& !((HttpServletRequest)pageContext.getRequest()).getServletPath().equals("/login")
		    		&& !((HttpServletRequest)pageContext.getRequest()).getServletPath().contains("/register")){ %>
				<jsp:include page="/WEB-INF/sitemesh-common/header.jsp" />
			<% } %>
			
		
		<div id="wrapper" class="container">
			
		    <% if (!((HttpServletRequest)pageContext.getRequest()).getServletPath().equals("/index.jsp")
		    		&& !((HttpServletRequest)pageContext.getRequest()).getServletPath().equals("/login")
		    		&& !((HttpServletRequest)pageContext.getRequest()).getServletPath().contains("/register")){ %>
		    <div id="nav">
		    	<!-- Bouton BACK TO DASHBOARD -->
<%-- 				<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/index.jsp"><span><img src="${pageContext.request.contextPath}/images/icons/back.gif" /><fmt:message key="navigation.backToDashboard"/></span></a></div> --%>
		    </div>
			<% } %>
			
			<div id="contentwrapper">      
				<% if (((HttpServletRequest)pageContext.getRequest()).getServletPath().equals("/index.jsp")){ %>
		        <jsp:include page="/WEB-INF/sitemesh-common/dashboard.jsp" />
				<% }else{ %>
				<decorator:body />
				<% } %>
				<div class="hidden">&nbsp;</div>     
			</div><!-- end contentwrapper -->  
			
			 
			<!-- Inclusion du FOOTER -->
<%-- 			<jsp:include page="/WEB-INF/sitemesh-common/footer.jsp" /> --%>
		</div><!-- end wrapper -->
	</body>
</html>



