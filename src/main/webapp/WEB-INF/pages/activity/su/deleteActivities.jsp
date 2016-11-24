<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>
		<title>Delete activity</title>
	</head>		
	
	<body>
	
		<div class="container">
						<!-- <h1><fmt:message key="navigation.view"/> <fmt:message key="activity.title"/></h1> -->
						<!-- Bouton BACK -->
						<div class="navitem">
							<a class="button" href="${pageContext.request.contextPath}/su/activities">
								<span class="glyphicon glyphicon-arrow-left"></span>
								<span><fmt:message key="navigation.back"/></span>
							</a>
						</div>
							<h1>Delete activity</h1>
							<table class="table table-list-search" id="viewTable">
								<tbody>
									<div class="form-group">
									<tr>
										<td valign="top">
											Name :
											<!-- <fmt:message key="activity.activityname.title"/>: -->
										</td>
										<td>
											${activity.activityname}
											&nbsp;
										</td>
									</tr>
									<tr>
										<td valign="top">
											Description :
											<!-- <fmt:message key="activity.activitydescription.title"/>: -->
										</td>
										<td>
											${activity.activitydescription}
											&nbsp;
										</td>
									</tr>
									<tr>
										<td valign="top">
											Visibility :
											<!-- <fmt:message key="activity.activityvisibility.title"/>: -->
										</td>
										<td>
											${activity.activityvisibility}
											&nbsp;
										</td>
									</tr>
								</div>
							</tbody>
						</table>
						<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
								<a class="btn btn-primary" href="${pageContext.request.contextPath}/deleteYourtaskuserActivities/${activity.activityid}"><span class="glyphicon glyphicon-trash"></span> DELETE</a>
						</div>
						<div class="clear">&nbsp;</div>
					</div>
					<!-- </div></div></div></div> -->
					<!-- </div></div></div></div> -->
	</body>
</html>
