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
           			<li class="dropdown">
			          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-user"></span> Profile <span class="caret"></span></a>
			          <ul class="dropdown-menu">
			            <li><a href="${pageContext.request.contextPath}/su/profile">User</a></li>
			            <li role="separator" class="divider"></li>
			            <li><a href="${pageContext.request.contextPath}/sc/profile">Company</a></li>
			            <li role="separator" class="divider"></li>
			            <li><a href="${pageContext.request.contextPath}/admin/profile">Admin</a></li>
			          </ul>
			        </li>
			        <li class="dropdown">
			          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-shopping-cart"></span> Products <span class="caret"></span></a>
			          <ul class="dropdown-menu">
			            <li><a href="${pageContext.request.contextPath}/su/allproducts">Buy products</a></li>
			            <li role="separator" class="divider"></li>
			            <li><a href="${pageContext.request.contextPath}/sc/products">Sell products</a></li>
			          </ul>
			        </li>
			        <li class="dropdown">
			          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-list-alt"></span> Orders <span class="caret"></span></a>
			          <ul class="dropdown-menu">
			            <li><a href="${pageContext.request.contextPath}/su/orders">User orders</a></li>
			            <li role="separator" class="divider"></li>
			            <li><a href="${pageContext.request.contextPath}/sc/orders">Company orders</a></li>
			          </ul>
			        </li>
           			<li><a href="${pageContext.request.contextPath}/su/activities"><span class="glyphicon glyphicon-calendar"></span> My activities</a></li>
           			<li><a href="${pageContext.request.contextPath}/su/allactivities"><span class="glyphicon glyphicon-th"></span> All activities</a></li>
           			<li><a href="${pageContext.request.contextPath}/admin/"><span class="glyphicon glyphicon-wrench"></span> Manage users</a></li>
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