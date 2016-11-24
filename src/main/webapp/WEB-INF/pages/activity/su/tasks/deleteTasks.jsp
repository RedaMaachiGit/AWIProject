<%@page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp" />
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
<head>
<title>Delete Task</title>
</head>
<body>
	<div class="container">
		<div class="navitem">
			<a class="button"
				href="${pageContext.request.contextPath}/su/activity/${activityid}">
				<span class="glyphicon glyphicon-arrow-left"></span> <span><fmt:message
						key="navigation.back" /></span>
			</a>
		</div>
		<h1>Delete Task</h1>
		<table class="table table-list-search" id="viewTable">
			<tbody>
				<tr>
					<td valign="top">Task :</td>
					<td>${task.taskcontent}&nbsp;</td>
				</tr>
			</tbody>
		</table>
		<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
			<a class="btn btn-primary"
				href="${pageContext.request.contextPath}/deleteActivityTasks/${activityid}/${task.taskid}">
				<span class="glyphicon glyphicon-trash"></span> Delete
				</a>
		</div>
		<div class="clear">&nbsp;</div>
	</div>
</body>
</html>
