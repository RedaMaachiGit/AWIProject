
<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>
		<title>Add/Edit Task</title>
	</head>
	<body>
			
	<div class="col-lg-8 col-lg-offset-2">
		<div class="col-md-7">
			<div id="contentarea">      
			<!-- <div id="lb"><div id="rb"><div id="bb"><div id="blc"> -->
			<!-- <div id="brc"><div id="tb"><div id="tlc"><div id="trc"> -->
				<div id="content">
					
					<!-- Bouton BACK -->
					<div class="navitem">
						<a class="button" href="${pageContext.request.contextPath}/su/activity/${activityid}">
							<span class="glyphicon glyphicon-arrow-left"></span>
							<span><fmt:message key="navigation.back"/></span>
						</a>
					</div>
					<h1>Add or edit Task</h1>
						<form:form action="${pageContext.request.contextPath}/su/saveActivityTasks/${activityid}" method="POST" modelAttribute="task">
							<table class="table table-list-search" id="viewTable">
								<tbody>
										<tr style="display:none;">
											<td valign="top">
												Identifier :
												<!-- <fmt:message key="task.taskid.title"/>: -->
											</td>
											<td>
												<c:choose>
													<c:when test='${newFlag}' >
														<form:input id="task_taskid" path="taskid" cssStyle="width:300px;"/>
														<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "task_taskid",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="task.taskid.help"/>", constraints : {places:0}}})); </script>
													</c:when>
													<c:otherwise>
														${task.taskid}
														&nbsp;
														<form:hidden id="task_taskid" path="taskid"/>
													</c:otherwise>
												</c:choose>
											</td>
										</tr>
										<tr>
											<td valign="top">
												Task : 
											</td>
											<td>
												<form:input id="task_taskcontent" path="taskcontent" cssStyle="width:300px;"/>
												<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "task_taskcontent",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "Enter/Edit task content"}})); </script>
											</td>
										</tr>
								</tbody>
							</table>
							<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
								<span class="inputbutton">
									<input class="btn btn-primary" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/>
								</span>
							</div>
							<!-- <script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script> -->
							<!-- <input type="hidden" name="activity_activityid" value="${activity_activityid}" > -->
						</form:form>
						<div class="clear">&nbsp;</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>