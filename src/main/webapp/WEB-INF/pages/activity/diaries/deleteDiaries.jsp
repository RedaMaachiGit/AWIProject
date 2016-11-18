<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.activity-resources"/>
<html>
<head>
<title>Delete Diary</title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1>Delete Diary</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectActivity?activityidKey=${activity_activityid}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							Name : 
						</td>
						<td>
							${diary.diaryname}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Date : 
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${diary.diarydate.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteActivityDiaries?activity_activityid=${activity_activityid}&related_diaries_iddiary=${diary.iddiary}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
