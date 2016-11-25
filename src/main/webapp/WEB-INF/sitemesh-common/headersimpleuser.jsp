<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.application-resources"/>

<div id="header">
		<div class="navbar navbar-default">
    	  <div class="container-fluid">
	        <div class="navbar-header">
	        	<a class="navbar-brand" href="#">Your Task</a>
         		<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
           			<span class="sr-only">Toggle navigation</span>
           			<span class="icon-bar"></span>
            		<span class="icon-bar"></span>
            		<span class="icon-bar"></span>
          		</button>
    
        	</div>
       		<div id="navbar" class="collapse navbar-collapse">
         		<ul class="nav navbar-nav">
         			<li><a href="${pageContext.request.contextPath}/"><span class="glyphicon glyphicon-home"></span> Home</a></li>
           			<li><a href="${pageContext.request.contextPath}/su/profile"><span class="glyphicon glyphicon-user"></span> My profile</a></li>
           			<li><a href="${pageContext.request.contextPath}/su/allproducts"><span class="glyphicon glyphicon-shopping-cart"></span> Buy products</a></li>
           			<li><a href="${pageContext.request.contextPath}/su/orders"><span class="glyphicon glyphicon-list-alt"></span> My orders</a></li>
           			<li><a href="${pageContext.request.contextPath}/su/activities"><span class="glyphicon glyphicon-calendar"></span> My activities</a></li>
           			<li><a href="${pageContext.request.contextPath}/su/allactivities"><span class="glyphicon glyphicon-th"></span> All activities</a></li>
         		</ul>
          		<ul class="nav navbar-nav navbar-right">
          			<li>
          				<c:url value="/logout" var="logoutUrl" />
      					<a class="btn btn-danger" href="${logoutUrl}">Log out</a>
          			</li>
          		</ul>
        	</div>
      	</div>
    </div>

</div>