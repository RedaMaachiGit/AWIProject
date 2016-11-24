<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>
		<title>New activity</title>
	</head>		

	<body>
		<div class="container">
						<!-- Bouton back -->
						<div class="navitem">
							<a class="button" href="${pageContext.request.contextPath}/su/activities">
								<span class="glyphicon glyphicon-arrow-left"></span>
								<span><fmt:message key="navigation.back"/></span>
							</a>
						</div>	
						<div class="row">
							<h1>Add a new activity</h1>
						</div>		
						<div class="row">
							<form:form action="${pageContext.request.contextPath}/su/saveYourtaskuserActivities" method="POST" modelAttribute="activity">
												<div class="form-group">
													<div class="col-lg-2 control-label">
														Name :
														<!-- <fmt:message key="activity.activityname.title"/>: -->
													</div>
													<div class='input'>
														<form:input id="activity_activityname" path="activityname" cssStyle="width:300px;"/>
														<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "activity_activityname",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="activity.activityname.help"/>"}})); </script>
													</div>
												</div>
												<div class="form-group">
													<div class="col-lg-2 control-label">
														Description :
														<!-- <fmt:message key="activity.activitydescription.title"/>: -->
													</div>
													<div class='input'>
														<form:input id="activity_activitydescription" path="activitydescription" cssStyle="width:300px;"/>
														<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "activity_activitydescription",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="activity.activitydescription.help"/>"}})); </script>
													</div>
												</div>
												<div class="form-group">
													<div class="col-lg-2 control-label">
														Visibility :
													</div>
													<div class='input'>
														<form:checkbox id="activity_activityvisibility" path="activityvisibility" />
														<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "activity_activityvisibility",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
													</div>
												</div>
									<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
										<span>
											<input class="btn btn-primary" id="save" type="submit" value="SAVE ACTIVITY"/>
										</span>
									</div>
								</form:form>
								<div class="clear">&nbsp;</div>
							</div>
	</body>
</html>
