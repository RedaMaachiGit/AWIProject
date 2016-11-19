<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.diary-resources"/>
<html>
<head>
<title>Diary Details</title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1>Diary details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectPublicActivity?activityidKey=${activity_activityid}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
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
						
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
						
			<h1>Goals</h1>
					
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead">Goal</th>
						<th class="thead">Description</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${diary.goals}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<!--<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectDiaryGoals?diary_iddiary=${diary.iddiary}&goals_goalid=${current.goalid}&"><img src="images/icons/view.gif" /></a>-->
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editDiaryGoals?diary_iddiary=${diary.iddiary}&goals_goalid=${current.goalid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteDiaryGoals?diary_iddiary=${diary.iddiary}&related_goals_goalid=${current.goalid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.goalname}
						&nbsp;
						</td>
						<td>
							${current.goaldescription}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			
			<h1>Diary Entries</h1>
					
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead">Date</th>
						<th class="thead">Content</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${diary.diaryentries}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<!--<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectDiaryDiaryentries?diary_iddiary=${diary.iddiary}&diaryentries_diaryentryid=${current.diaryentryid}&"><img src="images/icons/view.gif" /></a>-->
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editDiaryDiaryentries?diary_iddiary=${diary.iddiary}&diaryentries_diaryentryid=${current.diaryentryid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteDiaryDiaryentries?diary_iddiary=${diary.iddiary}&related_diaryentries_diaryentryid=${current.diaryentryid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${current.diaryentrydate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.diaryentrycontent}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>

			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>