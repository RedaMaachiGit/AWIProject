<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>
		<title>All public activities</title>
		<script src="${pageContext.request.contextPath}/js/datatables.min.js" ></script>
		<link href="${pageContext.request.contextPath}/css/datatables.min.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		<div class="container">
						<h1>All Public Activities</h1>
						<br>
						<table class="table table-bordered table-hover" id="viewTable">
							<thead>
								<tr>
									<th class="thead">&nbsp;</th>
									<th class="thead">Name</th>
									<th class="thead">Description</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${activitys}" var="current" varStatus="i">
									<c:choose>
										<c:when test="${(i.count) % 2 == 0}">
						    				<c:set var="rowclass" value="rowtwo"/>
										</c:when>
										<c:otherwise>
						    				<c:set var="rowclass" value="rowone"/>
										</c:otherwise>
									</c:choose>	
									<tr class="${rowclass}">
										<td nowrap="nowrap" class="tabletd">
											<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/su/allactivities/activity/${current.activityid}">
												<span class="glyphicon glyphicon-zoom-in"></span>
											</a>
										</td>
										<td nowrap="nowrap" class="tabletd">
											
												${current.activityname}
											&nbsp;
										</td>
										<td nowrap="nowrap" class="tabletd">
												
												${current.activitydescription}
											&nbsp;
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					<div class="clear">&nbsp;</div>
				<div class="spacer">&nbsp;</div>
			</div>
			<script type="text/javascript">
$(document).ready(function(){
    $('#viewTable').DataTable();
});
</script>
	</body>
</html>