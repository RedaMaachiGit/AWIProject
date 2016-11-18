<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.activity-resources"/>
<html>
<head>
<title>Activity details</title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1>Activity details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexActivity"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							Name : 
						</td>
						<td>
							${activity.activityname}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Description : 
						</td>
						<td>
							${activity.activitydescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Visibility : 
						</td>
						<td>
							${activity.activityvisibility}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>

			<h1>Diaries</h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newActivityDiaries?activity_activityid=${activity.activityid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="diary.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead">Name</th>
						<th class="thead">Date</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${activity.diaries}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectActivityDiaries?activity_activityid=${activity.activityid}&diaries_iddiary=${current.iddiary}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editActivityDiaries?activity_activityid=${activity.activityid}&diaries_iddiary=${current.iddiary}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteActivityDiaries?activity_activityid=${activity.activityid}&related_diaries_iddiary=${current.iddiary}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.diaryname}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${current.diarydate.time}"/>
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			
			<h1>Tasks</h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newActivityTasks?activity_activityid=${activity.activityid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="task.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead">Task</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${activity.tasks}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editActivityTasks?activity_activityid=${activity.activityid}&tasks_taskid=${current.taskid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteActivityTasks?activity_activityid=${activity.activityid}&related_tasks_taskid=${current.taskid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.taskcontent}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			
			<h1>Comments</h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newActivityComments?activity_activityid=${activity.activityid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="comment.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<!--<th class="thead">&nbsp;</th>-->
						<th class="thead">Date</th>
						<th class="thead">Comment</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${activity.comments}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<!--
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectActivityComments?activity_activityid=${activity.activityid}&comments_commentid=${current.commentid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editActivityComments?activity_activityid=${activity.activityid}&comments_commentid=${current.commentid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteActivityComments?activity_activityid=${activity.activityid}&related_comments_commentid=${current.commentid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						-->
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${current.commentdate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.commentcontent}
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