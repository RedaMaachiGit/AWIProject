<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>User - edit</title>
	</head>
	<body>
		<h2>User editing form</h2>
		<form:form method="POST" action="/yourtask/user/update">
	   		<table>
			    <tr>
			        <td><form:label path="userId">Id:</form:label></td>
			        <td><form:input path="userId" value="${user.userId}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="userDateofbirth">Date of birth:</form:label></td>
			        <td><form:input path="userDateofbirth" type= "date" value="${user.userDateofbirth}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="userPhonenumber">Phone number:</form:label></td>
			        <td><form:input path="userPhonenumber" value="${user.userPhonenumber}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="userEmail">Email:</form:label></td>
			        <td><form:input path="userEmail" type="email" value="${user.userEmail}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="userStreetnumber">Street number:</form:label></td>
			        <td><form:input path="userStreetnumber" value="${user.userStreetnumber}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="userZipcode">Zip code:</form:label></td>
			        <td><form:input path="userZipcode" value="${user.userZipcode}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="userCity">City:</form:label></td>
			        <td><form:input path="userCity" value="${user.userCity}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="userUsername">Username:</form:label></td>
			        <td><form:input path="userUsername" value="${user.userUsername}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="userPassword">Password:</form:label></td>
			        <td><form:input path="userPassword" value="${user.userPassword}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="userLastconnectiondate">Last connection date:</form:label></td>
			        <td><form:input path="userLastconnectiondate" type="date" value="${user.userLastconnectiondate}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="userType">Type:</form:label></td>
			        <td><form:input path="userType" value="${user.userType}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="userIban">Iban:</form:label></td>
			        <td><form:input path="userIban" value="${user.userIban}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="roleId">Role:</form:label></td>
			        <td><form:input path="roleId" value="${user.roleId}"/></td>
			    </tr>
			    
			    <tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table> 
		</form:form>
	</body>
</html>