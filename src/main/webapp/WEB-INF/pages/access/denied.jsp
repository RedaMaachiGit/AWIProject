<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<html>
<head>
	<title>Access denied</title>
</head>
<body>
	<h1>Unauthorized</h1>
	<hr/>
	<p>You have no right to access to this page.</p>
	<p> Maybe you are not connected as the right user. so please login or register</p>
	<ul>
		<li><a href="/login">login page</a></li>
		<li><a href="/login">registration page</a></li>
		<li><a href="mailto:bsthiaw@gmail.com">contact the administrator</a></li>
	</ul>
	
</body>
</html>