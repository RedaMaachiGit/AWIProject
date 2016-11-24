<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>
		<title>Edit <fmt:message key="activity.title"/></title>
	</head>		

	<body>
		<div class="col-lg-8 col-lg-offset-2">
			<div class="col-md-7">
				<div id="contentarea">      
				<!-- <div id="lb"><div id="rb"><div id="bb"><div id="blc"> -->
					<!-- <div id="brc"><div id="tb"><div id="tlc"><div id="trc"> -->
						<div id="content">
						<!-- <h1><fmt:message key="navigation.edit"/> <fmt:message key="activity.title"/></h1> -->
						<!-- Bouton back -->
							<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexActivity"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
								<form:form action="${pageContext.request.contextPath}/saveActivity" method="POST" modelAttribute="activity">
									<table class="table table-list-search" id="viewTable">
										<tbody>
											<div class="form-group">
												<tr>
													<td valign="top"> 
														Identifier :
													</td>
													<td>
														<c:choose>
															<c:when test='${newFlag}' >
																<form:input id="activity_activityid" path="activityid" cssStyle="width:300px;"/>
																<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "activity_activityid",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="activity.activityid.help"/>", constraints : {places:0}}})); </script>
															</c:when>
															<c:otherwise>
																${activity.activityid}&nbsp;
																<form:hidden id="activity_activityid" path="activityid"/>
															</c:otherwise>
														</c:choose>
													</td>
												</tr>
												<tr>
													<td valign="top">
														Name :
													</td>
													<td>
														<form:input id="activity_activityname" path="activityname" cssStyle="width:300px;"/>
														<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "activity_activityname",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "Enter activity name"}})); </script>
													</td>
												</tr>
												<tr>
													<td  valign="top">
														Description :
													</td>
													<td>
														<form:input id="activity_activitydescription" path="activitydescription" cssStyle="width:300px;"/>
														<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "activity_activitydescription",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "Enter activity description"}})); </script>
													</td>
												</tr>
												<tr>
													<td valign="top">
														Visibility :
													</td>
													<td>
														<form:checkbox id="activity_activityvisibility" path="activityvisibility" />
														<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "activity_activityvisibility",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
													</td>
												</tr>
											</div>
										</tbody>
									</table>
									<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
										<span class="inputbutton">
											<input class="btn-lg btn-primary btn-block" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/>
										</span>
									</div>
									<!-- <script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script> -->
								</form:form>
								<div class="clear">&nbsp;</div>
							</div>
						<!-- </div></div></div></div> -->
					</div>
				</div>
			</div>
		</div>
	</body>
</html>