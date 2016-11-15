<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>User - add</title>
	</head>
	<body>
    	<h1>Welcome to yourtask</h1>
		<p>Hello <b><c:out value="${pageContext.request.remoteUser}"/></b></p>
	  	<c:url value="/j_spring_security_logout" var="logoutUrl" />
		<!-- csrt for log out-->
		<form action="${logoutUrl}" method="post" id="logoutForm">
		  <input type="hidden"
			name="${_csrf.parameterName}"
			value="${_csrf.token}" />
		</form>
		<script>
			function formSubmit() {
				document.getElementById("logoutForm").submit();
			}
		</script>
	
		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<h2>
				Welcome : ${pageContext.request.userPrincipal.name} | <a
					href="javascript:formSubmit()"> Logout</a>
			</h2>
		</c:if>
		<ol>
			<li><a href="/yourtask/user/list">List of users</a></li>
			<li><a href="/yourtask/user/add">Add user</a></li>
		</ol>
</body>



