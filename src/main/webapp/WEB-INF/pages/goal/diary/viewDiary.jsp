<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.goal-resources"/>
<html>
<head>
<title>View <fmt:message key="goal.title"/> <fmt:message key="diary.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="diary.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectGoal?goalidKey=${goal_goalid}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="diary.iddiary.title"/>:
						</td>
						<td>
							${diary.iddiary}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="diary.diaryname.title"/>:
						</td>
						<td>
							${diary.diaryname}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="diary.diarydate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${diary.diarydate.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
