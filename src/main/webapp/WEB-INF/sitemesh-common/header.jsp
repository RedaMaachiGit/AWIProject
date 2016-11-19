<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.application-resources"/>
<div id="header">
<nav class="navbar navbar-light bg-faded">
  <a class="navbar-brand" href="#"><fmt:message key="application.title"/></a>
  <ul class="nav navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Link</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Link</a>
    </li>
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="http://example.com" id="supportedContentDropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a>
      <div class="dropdown-menu" aria-labelledby="supportedContentDropdown">
        <a class="dropdown-item" href="#">Action</a>
        <a class="dropdown-item" href="#">Another action</a>
        <a class="dropdown-item" href="#">Something else here</a>
      </div>
    </li>
    <li class="nav-item right">
    	<c:url value="/logout" var="logoutUrl" />
      	<a class="float-xs-right btn btn-outline-danger" href="${logoutUrl}">Log out</a>
    </li>
    
  </ul>
<!--   <form class="form-inline float-xs-right"> -->
<!--     <input class="form-control" type="text" placeholder="Search"> -->
<!--     <button class="btn btn-outline-success" type="submit">Search</button> -->
<!--   </form> -->


</nav>
</div>
