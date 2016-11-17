<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.diary-resources"/>
<html>
<head>
<title>Edit <fmt:message key="diary.title"/> <fmt:message key="diaryentry.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="diaryentry.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectDiary?iddiaryKey=${diary_iddiary}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveDiaryDiaryentries" method="POST" modelAttribute="diaryentry">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="diaryentry.diaryentryid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="diaryentry_diaryentryid" path="diaryentryid" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "diaryentry_diaryentryid",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="diaryentry.diaryentryid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${diaryentry.diaryentryid}
						&nbsp;
									<form:hidden id="diaryentry_diaryentryid" path="diaryentryid"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="diaryentry.diaryentrydate.title"/>:
						</td>
						<td>
							<input id="diaryentry_diaryentrydate" name="diaryentrydate" type="text" value="<fmt:formatDate value="${diaryentry.diaryentrydate.time}" pattern="yyyy-MM-dd"/>" dojoType="dijit.form.DateTextBox" constraints="{datePattern:'<fmt:message key="date.format"/>'}" trim="true" promptMessage="<fmt:message key="date.format" />" invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />." style="width:300px;" />
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="diaryentry.diaryentrycontent.title"/>:
						</td>
						<td>
							<form:input id="diaryentry_diaryentrycontent" path="diaryentrycontent" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "diaryentry_diaryentrycontent",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="diaryentry.diaryentrycontent.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="diaryentry.diaryentryvisibility.title"/>:
						</td>
						<td>
							<form:checkbox id="diaryentry_diaryentryvisibility" path="diaryentryvisibility" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "diaryentry_diaryentryvisibility",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="diary_iddiary" value="${diary_iddiary}" >
				
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
