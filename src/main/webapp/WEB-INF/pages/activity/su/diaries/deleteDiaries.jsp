<<<<<<< Updated upstream
<%@page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp" />
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
<head>
<title>Delete Diary</title>
</head>
<body>
	<div class="container">
		<!-- Bouton BACK -->
		<div class="navitem">
			<a class="button"
				href="${pageContext.request.contextPath}/su/activity/${activityid}">
				<span class="glyphicon glyphicon-arrow-left"></span> <span><fmt:message
						key="navigation.back" /></span>
			</a>
		</div>
		<h1>Delete Diary</h1>
		<table class="table table-list-search" id="viewTable">
			<tbody>
				<tr>
					<td valign="top">Name :</td>
					<td>${diary.diaryname} &nbsp;</td>
				</tr>
				<tr>
					<td valign="top">Date :</td>
					<td><fmt:formatDate dateStyle="short" type="date"
							value="${diary.diarydate.time}" /> &nbsp;</td>
				</tr>
			</tbody>
		</table>
		<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
			<a class="btn btn-primary"
				href="${pageContext.request.contextPath}/deleteActivityDiaries/${activityid}/${diary.iddiary}">
				<span class="glyphicon glyphicon-trash"></span> Delete
			</a>
			<div class="clear">&nbsp;</div>
		</div>
	</div>
</body>
=======
<%@page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp" />
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
<head>
<title>Delete Diary</title>
</head>
<body>
	<div class="container">
		<!-- Bouton BACK -->
		<div class="navitem">
			<a class="button"
				href="${pageContext.request.contextPath}/su/activity/${activityid}">
				<span class="glyphicon glyphicon-arrow-left"></span> <span><fmt:message
						key="navigation.back" /></span>
			</a>
		</div>
		<h1>Delete Diary</h1>
		<table class="table table-list-search" id="viewTable">
			<tbody>
				<tr>
					<td valign="top">Name :</td>
					<td>${diary.diaryname} &nbsp;</td>
				</tr>
				<tr>
					<td valign="top">Date :</td>
					<td><fmt:formatDate dateStyle="short" type="date"
							value="${diary.diarydate.time}" /> &nbsp;</td>
				</tr>
			</tbody>
		</table>
		<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
			<a class="btn btn-primary"
				href="${pageContext.request.contextPath}/deleteActivityDiaries/${activityid}/${diary.iddiary}">
				<span class="glyphicon glyphicon-trash"></span> Delete
			</a>
			<div class="clear">&nbsp;</div>
		</div>
	</div>
</body>
>>>>>>> Stashed changes
</html>