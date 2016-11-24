<%@page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp" />
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
<head>
<title>Activity details</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="navitem">
				<a class="button"
					href="${pageContext.request.contextPath}/su/allactivities"> <span
					class="glyphicon glyphicon-arrow-left"></span> <span><fmt:message
							key="navigation.back" /></span>
				</a>
			</div>

			<h1>Activity details</h1>

			<div class="panel panel-default">
				<div class="panel-heading">Basic information</div>
				<div class="panel-body">
					Name : ${activity.activityname} <br> Description :
					${activity.activitydescription}<br>
				</div>
			</div>
		</div>
		<div class="row">
			<h1>Diaries</h1>
			<table class="table table-bordered table-hover table-list-search" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead">Name</th>
						<th class="thead">Date</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${activity.diaries}" var="current" varStatus="i">
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
								<c:set var="rowclass" value="rowtwo" />
							</c:when>
							<c:otherwise>
								<c:set var="rowclass" value="rowone" />
							</c:otherwise>
						</c:choose>
						<tr class="${rowclass}">
							<td nowrap="nowrap"><a
								title="<fmt:message key="navigation.view" />"
								href="${pageContext.request.contextPath}/su/${userid}/activity/${activity.activityid}/diary/${current.iddiary}">
									<span class="glyphicon glyphicon-zoom-in"></span>
							</a></td>
							<td>${current.diaryname}&nbsp;</td>
							<td><fmt:formatDate dateStyle="short" type="date"
									value="${current.diarydate.time}" /> &nbsp;</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="row">
			<h1>Tasks</h1>
			<table class="table table-bordered table-hover table-list-search" id="viewTable">
				<thead>
					<tr>
						<th class="thead">Task</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${activity.tasks}" var="current" varStatus="i">
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
								<c:set var="rowclass" value="rowtwo" />
							</c:when>
							<c:otherwise>
								<c:set var="rowclass" value="rowone" />
							</c:otherwise>
						</c:choose>
						<tr class="${rowclass}">
							<td>${current.taskcontent}&nbsp;</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="row">
			<h1>Comments</h1>
			<div class="navitem">
				<a class="button"
					href="${pageContext.request.contextPath}/su/allactivities/activity/${activity.activityid}/createComment">
					<span class="glyphicon glyphicon-plus"></span> <span><fmt:message
							key="navigation.new" /> <fmt:message key="comment.title" /></span>
				</a>
			</div>
			<table class="table table-bordered table-hover table-list-search" id="viewTable">
				<thead>
					<tr>
						<!--<th class="thead">&nbsp;</th>-->
						<th class="thead">Date</th>
						<th class="thead">Comment</th>
						<th class="thead">Posted By</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listcomment}" var="current" varStatus="i">
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
								<c:set var="rowclass" value="rowtwo" />
							</c:when>
							<c:otherwise>
								<c:set var="rowclass" value="rowone" />
							</c:otherwise>
						</c:choose>
						<tr class="${rowclass}">
							<td><fmt:formatDate dateStyle="short" type="date"
									value="${current.commentdate.time}" /> &nbsp;</td>
							<td>${current.commentcontent}&nbsp;</td>
							<td>${listusercomment[i.index].userusername}&nbsp;</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="clear">&nbsp;</div>
	</div>
</body>
</html>