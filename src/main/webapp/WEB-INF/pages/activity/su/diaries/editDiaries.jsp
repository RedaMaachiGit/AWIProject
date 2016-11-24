<<<<<<< Updated upstream
<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>
		<title>Edit Diary</title>
	</head>

	<body>
	<div class="container">
					<!--  Bouton back -->
					<div class="navitem">
						<a class="button" href="${pageContext.request.contextPath}/su/activity/${activityid}">
							<span class="glyphicon glyphicon-arrow-left"></span>
							<span><fmt:message key="navigation.back"/></span>
						</a>
					</div>
						<h1>Add or edit a diary</h1>
						<form:form action="${pageContext.request.contextPath}/su/saveActivityDiaries/${activityid}" method="POST" modelAttribute="diary">
							<table class="table table-list-search" id="viewTable">
								<tbody>
									<div class="form-group">
										<tr style="display:none;">
											<td valign="top">
												Identifier : 
												<!-- <fmt:message key="diary.iddiary.title"/>:-->
											</td>
											<td>
												<c:choose>
													<c:when test='${newFlag}' >
														<form:input id="diary_iddiary" path="iddiary" cssStyle="width:300px;"/>
														<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "diary_iddiary",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="diary.iddiary.help"/>", constraints : {places:0}}})); </script>
													</c:when>
													<c:otherwise>
														${diary.iddiary}
														&nbsp;
														<form:hidden id="diary_iddiary" path="iddiary"/>
													</c:otherwise>
												</c:choose>
											</td>
										</tr>
										<tr>
											<td valign="top">
												Name :
											</td>
											<td>
												<form:input id="diary_diaryname" path="diaryname" cssStyle="width:300px;"/>
												<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "diary_diaryname",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "Enter/Edit diary name"}})); </script>
											</td>
										</tr>
										<tr style="display:none;">
											<td valign="top">
												Date :
											</td>
											<td>
												<input id="diary_diarydate" name="diarydate" type="text" value="<fmt:formatDate value="${diary.diarydate.time}" pattern="yyyy-MM-dd"/>" dojoType="dijit.form.DateTextBox" constraints="{datePattern:'<fmt:message key="date.format"/>'}" trim="true" promptMessage="<fmt:message key="date.format" />" invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />." style="width:300px;" />
											</td>
										</tr>
									</div>
								</tbody>
							</table>
							<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
								<span class="inputbutton">
									<input class="btn btn-primary" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/>
								</span>
							</div>
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
</body>
</html>
=======
<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>
		<title>Edit Diary</title>
	</head>

	<body>
	<div class="container">
					<!--  Bouton back -->
					<div class="navitem">
						<a class="button" href="${pageContext.request.contextPath}/su/activity/${activityid}">
							<span class="glyphicon glyphicon-arrow-left"></span>
							<span><fmt:message key="navigation.back"/></span>
						</a>
					</div>
						<h1>Add or edit a diary</h1>
						<form:form action="${pageContext.request.contextPath}/su/saveActivityDiaries/${activityid}" method="POST" modelAttribute="diary">
							<table class="table table-list-search" id="viewTable">
								<tbody>
									<div class="form-group">
										<tr style="display:none;">
											<td valign="top">
												Identifier : 
												<!-- <fmt:message key="diary.iddiary.title"/>:-->
											</td>
											<td>
												<c:choose>
													<c:when test='${newFlag}' >
														<form:input id="diary_iddiary" path="iddiary" cssStyle="width:300px;"/>
														<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "diary_iddiary",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="diary.iddiary.help"/>", constraints : {places:0}}})); </script>
													</c:when>
													<c:otherwise>
														${diary.iddiary}
														&nbsp;
														<form:hidden id="diary_iddiary" path="iddiary"/>
													</c:otherwise>
												</c:choose>
											</td>
										</tr>
										<tr>
											<td valign="top">
												Name :
											</td>
											<td>
												<form:input id="diary_diaryname" path="diaryname" cssStyle="width:300px;"/>
												<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "diary_diaryname",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "Enter/Edit diary name"}})); </script>
											</td>
										</tr>
										<tr style="display:none;">
											<td valign="top">
												Date :
											</td>
											<td>
												<input id="diary_diarydate" name="diarydate" type="text" value="<fmt:formatDate value="${diary.diarydate.time}" pattern="yyyy-MM-dd"/>" dojoType="dijit.form.DateTextBox" constraints="{datePattern:'<fmt:message key="date.format"/>'}" trim="true" promptMessage="<fmt:message key="date.format" />" invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />." style="width:300px;" />
											</td>
										</tr>
									</div>
								</tbody>
							</table>
							<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
								<span class="inputbutton">
									<input class="btn btn-primary" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/>
								</span>
							</div>
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
</body>
</html>
>>>>>>> Stashed changes
