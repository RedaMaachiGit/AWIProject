<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>User - List</title>
</head>
<body>
<h1>List of users</h1>
<h3><a href="add">Add More user</a></h3>

<c:if test="${!empty users}">
	<table align="left" border="1">
		<tr>
			<th>ID</th>
			<th>username</th>
			<th> edit </th>
		</tr>

		<c:forEach items="${users}" var="user">
			<tr>
				<td><c:out value="${user.userId}"/></td>
				<td><c:out value="${user.userUsername}"/></td>
				<td><a href="edit?id=${user.userId}">edit</a><a href="delete?id=${user.userId}">edit</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>