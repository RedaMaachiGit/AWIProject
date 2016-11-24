<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>
		<title>Add/Edit Goal</title>
	</head>

	<body>
			
	<div class="controller">
					<!--  Bouton back -->
					<div class="navitem">
						<a class="button" href="${pageContext.request.contextPath}/su/activity/${activityid}/diary/${diaryid}">
							<span class="glyphicon glyphicon-arrow-left"></span>
							<span><fmt:message key="navigation.back"/></span>
						</a>
					</div>
						<h1>Edit Goal</h1>
						<form:form action="${pageContext.request.contextPath}/saveDiaryGoals/${userid}/${activityid}/${diaryid}" method="POST" modelAttribute="goal">
							<table class="table table-list-search" id="viewTable">
								<tbody>
										<tr style="display:none;">
											<td valign="top">
												Identifier :
												<!-- <fmt:message key="goal.goalid.title"/>: -->
											</td>
											<td>
												<c:choose>
													<c:when test='${newFlag}' >
														<form:input id="goal_goalid" path="goalid" cssStyle="width:300px;"/>
														<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "goal_goalid",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="goal.goalid.help"/>", constraints : {places:0}}})); </script>
													</c:when>
													<c:otherwise>
														${goal.goalid}
														&nbsp;
														<form:hidden id="goal_goalid" path="goalid"/>
													</c:otherwise>
												</c:choose>
											</td>
										</tr>
										<tr>
											<td valign="top">
												Name : 
											</td>
											<td>
												<form:input id="goal_goalname" path="goalname" cssStyle="width:300px;"/>
												<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "goal_goalname",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "Enter/Edit your goal name"}})); </script>
											</td>
										</tr>
										<tr>
											<td valign="top">
												Description : 
											</td>
											<td>
												<form:input id="goal_goaldescription" path="goaldescription" cssStyle="width:300px;"/>
												<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "goal_goaldescription",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "Enter/Edit your goal description"}})); </script>
											</td>
										</tr>
								</tbody>
							</table>
							<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
									<input class="btn btn-primary" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/>
							</div>
						</form:form>
						<div class="clear">&nbsp;</div>
					</div>
	</body>
</html>