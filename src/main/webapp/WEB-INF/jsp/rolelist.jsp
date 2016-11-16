<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Role - List</title>
</head>
<body>
<h1>List of roles</h1>
<h3><a href="add">Add More role</a></h3>

<c:if test="${!empty roles}">
	<table align="left" border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th> edit </th>
		</tr>

		<c:forEach items="${roles}" var="role">
			<tr>
				<td><c:out value="${role.roleId}"/></td>
				<td><c:out value="${role.roleName}"/></td>
				<td><a href="edit?id=${role.roleId}">edit</a><a href="delete?id=${role.roleId}">edit</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>