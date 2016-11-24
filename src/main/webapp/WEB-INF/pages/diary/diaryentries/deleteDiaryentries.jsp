<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>
		<title>View <fmt:message key="diary.title"/> <fmt:message key="diaryentry.title"/></title>
			</head>
	<body>
		
		
		<div class="container">
						<div class="navitem">
							<a class="button" href="${pageContext.request.contextPath}/su/activity/${activityid}/diary/${diaryid}">
								<span class="glyphicon glyphicon-arrow-left"></span>
								<span><fmt:message key="navigation.back"/></span>
							</a>
						</div>
					
						<!-- <h1><fmt:message key="navigation.view"/> <fmt:message key="diaryentry.title"/></h1> -->
						<h1>Delete diary entry</h1>
						</br>
							<table class="table table-list-search" id="viewTable">
								<tbody>
										<tr>
											<td valign="top">
												Date : 
											</td>
											<td>
												<fmt:formatDate dateStyle="short" type="date" value="${diaryentry.diaryentrydate.time}"/>
												&nbsp;
											</td>
										</tr>
										<tr>
											<td valign="top">
												Content : 
											</td>
											<td>
												${diaryentry.diaryentrycontent}
												&nbsp;
											</td>
										</tr>
								</tbody>
							</table>
							
							<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
									<a class="btn btn-primary" href="${pageContext.request.contextPath}/deleteDiaryDiaryentries/${userid}/${activityid}/${diaryid}/${diaryentry.diaryentryid}"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a>
							<!-- <div class="clear">&nbsp;</div> -->
						</div>
	</body>
</html>