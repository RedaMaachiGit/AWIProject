<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Role - add</title>
	</head>
	<body>
		<h2>Role adding form</h2>
		<c:if test="${!empty model}">
			<c:out value="message"></c:out>
		</c:if>
		<form:form method="POST" action="/yourtask/role/save">
	   		<table>
			    <tr>
			        <td><form:label path="roleId">Id:</form:label></td>
			        <td><form:input path="roleId" value="${role.roleId}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="roleName">Name:</form:label></td>
			        <td><form:input path="roleName" type= "date" value="${role.roleName}"/></td>
			    </tr>
			    <tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table> 
		</form:form>
	</body>
</html>