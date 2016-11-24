<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>
		<title>Edit activity</title>
	</head>		

	<body>
		<div class="container">
						<!-- Bouton back -->
						<div class="navitem">
							<a class="button" href="${pageContext.request.contextPath}/su/${yourtaskuser_userid}/activities">
								<span class="glyphicon glyphicon-arrow-left"></span>
								<span><fmt:message key="navigation.back"/></span>
							</a>
						</div>
							<h1>Edit activity</h1>
							<form:form action="${pageContext.request.contextPath}/saveYourtaskuserActivities/${yourtaskuser_userid}" method="POST" modelAttribute="activity">
											<div class="form-group" style="display:none;">
													<div class="col-lg-2 control-label">
														Identifier :
														<!-- <fmt:message key="activity.activityid.title"/>: -->
													</div>
													<div class='input'>
														<c:choose>
															<c:when test='${newFlag}' >
																<form:input id="activity_activityid" path="activityid" cssStyle="width:300px;"/>
																<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "activity_activityid",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="activity.activityid.help"/>", constraints : {places:0}}})); </script>
															</c:when>
															<c:otherwise>
																${activity.activityid}
																&nbsp;
																<form:hidden id="activity_activityid" path="activityid"/>
															</c:otherwise>
														</c:choose>
													</div>
												</div>
												<div class="form-group">
													<div class="col-lg-2 control-label">
														Name :
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
														<!-- <fmt:message key="activity.activityvisibility.title"/>: -->
													</div>
													<div class='input'>
														<form:checkbox id="activity_activityvisibility" path="activityvisibility" />
														<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "activity_activityvisibility",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
													</div>
												</div>
									<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
										<span class="inputbutton">
											<input class="btn btn-primary" id="save" type="submit" value="CONFIRM EDIT"/>
										</span>
									</div>
									<!-- <script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script> -->
									<!-- <input type="hidden" name="yourtaskuser_userid" value="${yourtaskuser_userid}" > -->
								</form:form>
								<div class="clear">&nbsp;</div>
							</div>
	</body>
</html>
