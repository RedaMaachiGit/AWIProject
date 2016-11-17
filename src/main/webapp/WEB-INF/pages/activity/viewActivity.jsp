<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.activity-resources"/>
<html>
<head>
<title>View <fmt:message key="activity.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="activity.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexActivity"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="activity.activityid.title"/>:
						</td>
						<td>
							${activity.activityid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="activity.activityname.title"/>:
						</td>
						<td>
							${activity.activityname}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="activity.activitydescription.title"/>:
						</td>
						<td>
							${activity.activitydescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="activity.activityvisibility.title"/>:
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
			<h1><fmt:message key="yourtaskuser.title"/></h1>
					
						<c:if test='${activity.yourtaskuser != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userid.title"/>:
						</td>
						<td>
							${activity.yourtaskuser.userid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userdateofbirth.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${activity.yourtaskuser.userdateofbirth.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userphonenumber.title"/>:
						</td>
						<td>
							${activity.yourtaskuser.userphonenumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.useremail.title"/>:
						</td>
						<td>
							${activity.yourtaskuser.useremail}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userstreetnumber.title"/>:
						</td>
						<td>
							${activity.yourtaskuser.userstreetnumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userzipcode.title"/>:
						</td>
						<td>
							${activity.yourtaskuser.userzipcode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usercity.title"/>:
						</td>
						<td>
							${activity.yourtaskuser.usercity}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userusername.title"/>:
						</td>
						<td>
							${activity.yourtaskuser.userusername}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userpassword.title"/>:
						</td>
						<td>
							${activity.yourtaskuser.userpassword}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usertoken.title"/>:
						</td>
						<td>
							${activity.yourtaskuser.usertoken}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userlastconnectiondate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${activity.yourtaskuser.userlastconnectiondate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usertype.title"/>:
						</td>
						<td>
							${activity.yourtaskuser.usertype}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.useriban.title"/>:
						</td>
						<td>
							${activity.yourtaskuser.useriban}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editActivityYourtaskuser?activity_activityid=${activity.activityid}&yourtaskuser_userid=${activity.yourtaskuser.userid}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteActivityYourtaskuser?activity_activityid=${activity.activityid}&related_yourtaskuser_userid=${activity.yourtaskuser.userid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${activity.yourtaskuser == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newActivityYourtaskuser?activity_activityid=${activity.activityid}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="yourtaskuser.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="diary.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newActivityDiaries?activity_activityid=${activity.activityid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="diary.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="diary.iddiary.title"/></th>
						<th class="thead"><fmt:message key="diary.diaryname.title"/></th>
						<th class="thead"><fmt:message key="diary.diarydate.title"/></th>
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
							${current.iddiary}
						&nbsp;
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
			<h1><fmt:message key="comment.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newActivityComments?activity_activityid=${activity.activityid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="comment.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="comment.commentid.title"/></th>
						<th class="thead"><fmt:message key="comment.commentcontent.title"/></th>
						<th class="thead"><fmt:message key="comment.commentdate.title"/></th>
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
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectActivityComments?activity_activityid=${activity.activityid}&comments_commentid=${current.commentid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editActivityComments?activity_activityid=${activity.activityid}&comments_commentid=${current.commentid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteActivityComments?activity_activityid=${activity.activityid}&related_comments_commentid=${current.commentid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.commentid}
						&nbsp;
						</td>
						<td>
							${current.commentcontent}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${current.commentdate.time}"/>
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="task.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newActivityTasks?activity_activityid=${activity.activityid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="task.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="task.taskid.title"/></th>
						<th class="thead"><fmt:message key="task.taskcontent.title"/></th>
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectActivityTasks?activity_activityid=${activity.activityid}&tasks_taskid=${current.taskid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editActivityTasks?activity_activityid=${activity.activityid}&tasks_taskid=${current.taskid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteActivityTasks?activity_activityid=${activity.activityid}&related_tasks_taskid=${current.taskid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.taskid}
						&nbsp;
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
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>