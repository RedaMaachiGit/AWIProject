<%@page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp" />
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
<head>
<title>Add/Edit Diary Entry</title>
</head>

<body>

	<div class="container">
		<!-- Bouton back -->
		<div class="navitem">
			<a class="button"
				href="${pageContext.request.contextPath}/su/activity/${activityid}/diary/${diaryid}">
				<span class="glyphicon glyphicon-arrow-left"></span> <span><fmt:message
						key="navigation.back" /></span>
			</a>
		</div>
		<h1>Add or edit diary entry</h1>
		<form:form
			action="${pageContext.request.contextPath}/saveDiaryDiaryentries/${userid}/${activityid}/${diaryid}"
			method="POST" modelAttribute="diaryentry">
			<table class="table table-list-search" id="viewTable">
				<tbody>
					<tr style="display: none;">
						<td valign="top"><fmt:message
								key="diaryentry.diaryentryid.title" />:</td>
						<td><c:choose>
								<c:when test='${newFlag}'>
									<form:input id="diaryentry_diaryentryid" path="diaryentryid"
										cssStyle="width:300px;" />
									<script type="text/javascript">
										Spring
												.addDecoration(new Spring.ElementDecoration(
														{
															elementId : "diaryentry_diaryentryid",
															widgetType : "dijit.form.NumberTextBox",
															widgetAttrs : {
																promptMessage : "<fmt:message key="diaryentry.diaryentryid.help"/>",
																constraints : {
																	places : 0
																}
															}
														}));
									</script>
								</c:when>
								<c:otherwise>
														${diaryentry.diaryentryid}
														&nbsp;
																<form:hidden id="diaryentry_diaryentryid"
										path="diaryentryid" />
								</c:otherwise>
							</c:choose></td>
					</tr>
					<tr style="display: none;">
						<td valign="top">Date :</td>
						<td><input id="diaryentry_diaryentrydate"
							name="diaryentrydate" type="text"
							value="<fmt:formatDate value="${diaryentry.diaryentrydate.time}" pattern="yyyy-MM-dd"/>"
							dojoType="dijit.form.DateTextBox"
							constraints="{datePattern:'<fmt:message key="date.format"/>'}"
							trim="true" promptMessage="<fmt:message key="date.format" />"
							invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />."
							style="width: 300px;" /></td>
					</tr>
					<tr>
						<td valign="top">Content :</td>
						<td><form:input id="diaryentry_diaryentrycontent"
								path="diaryentrycontent" cssStyle="width:300px;" /> <script
								type="text/javascript">
									Spring
											.addDecoration(new Spring.ElementDecoration(
													{
														elementId : "diaryentry_diaryentrycontent",
														widgetType : "dijit.form.ValidationTextBox",
														widgetAttrs : {
															promptMessage : "Enter your diary entry content"
														}
													}));
								</script>
						</td>
					</tr>
					<tr style="display: none;">
						<td valign="top"><fmt:message
								key="diaryentry.diaryentryvisibility.title" />:</td>
						<td><form:checkbox id="diaryentry_diaryentryvisibility"
								path="diaryentryvisibility" /> <script type="text/javascript">
									Spring
											.addDecoration(new Spring.ElementDecoration(
													{
														elementId : "diaryentry_diaryentryvisibility",
														widgetType : "dijit.form.CheckBox",
														widgetAttrs : {}
													}));
								</script>
						</td>
					</tr>
				</tbody>
			</table>

			<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
				<input class="btn btn-primary" id="save" type="submit"
					value="<fmt:message key="navigation.save"/>" />
			</div>
			<!-- <script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script> -->
			<!-- <input type="hidden" name="diary_iddiary" value="${diary_iddiary}" > -->
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
</body>
</html>