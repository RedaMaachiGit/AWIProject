<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.diary-resources"/>
<html>
<head>
<title>View <fmt:message key="diary.title"/> <fmt:message key="diaryentry.title"/></title>
</head>
<body>
<div id="contentarea" class="container">      
			<h1><fmt:message key="navigation.view"/> <fmt:message key="diaryentry.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectDiary?iddiaryKey=${diary_iddiary}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="diaryentry.diaryentryid.title"/>:
						</td>
						<td>
							${diaryentry.diaryentryid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="diaryentry.diaryentrydate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${diaryentry.diaryentrydate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="diaryentry.diaryentrycontent.title"/>:
						</td>
						<td>
							${diaryentry.diaryentrycontent}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="diaryentry.diaryentryvisibility.title"/>:
						</td>
						<td>
							${diaryentry.diaryentryvisibility}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
		</div>
</body>
</html>
