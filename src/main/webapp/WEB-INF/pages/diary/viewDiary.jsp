<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.diary-resources"/>
<html>
<head>
<title>View <fmt:message key="diary.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="diary.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexDiary"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
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
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="activity.title"/></h1>
					
						<c:if test='${diary.activity != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="activity.activityid.title"/>:
						</td>
						<td>
							${diary.activity.activityid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="activity.activityname.title"/>:
						</td>
						<td>
							${diary.activity.activityname}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="activity.activitydescription.title"/>:
						</td>
						<td>
							${diary.activity.activitydescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="activity.activityvisibility.title"/>:
						</td>
						<td>
							${diary.activity.activityvisibility}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editDiaryActivity?diary_iddiary=${diary.iddiary}&activity_activityid=${diary.activity.activityid}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteDiaryActivity?diary_iddiary=${diary.iddiary}&related_activity_activityid=${diary.activity.activityid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${diary.activity == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newDiaryActivity?diary_iddiary=${diary.iddiary}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="activity.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="yourtaskuser.title"/></h1>
					
						<c:if test='${diary.yourtaskuser != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userid.title"/>:
						</td>
						<td>
							${diary.yourtaskuser.userid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userdateofbirth.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${diary.yourtaskuser.userdateofbirth.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userphonenumber.title"/>:
						</td>
						<td>
							${diary.yourtaskuser.userphonenumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.useremail.title"/>:
						</td>
						<td>
							${diary.yourtaskuser.useremail}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userstreetnumber.title"/>:
						</td>
						<td>
							${diary.yourtaskuser.userstreetnumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userzipcode.title"/>:
						</td>
						<td>
							${diary.yourtaskuser.userzipcode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usercity.title"/>:
						</td>
						<td>
							${diary.yourtaskuser.usercity}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userusername.title"/>:
						</td>
						<td>
							${diary.yourtaskuser.userusername}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userpassword.title"/>:
						</td>
						<td>
							${diary.yourtaskuser.userpassword}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usertoken.title"/>:
						</td>
						<td>
							${diary.yourtaskuser.usertoken}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userlastconnectiondate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${diary.yourtaskuser.userlastconnectiondate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usertype.title"/>:
						</td>
						<td>
							${diary.yourtaskuser.usertype}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.useriban.title"/>:
						</td>
						<td>
							${diary.yourtaskuser.useriban}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editDiaryYourtaskuser?diary_iddiary=${diary.iddiary}&yourtaskuser_userid=${diary.yourtaskuser.userid}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteDiaryYourtaskuser?diary_iddiary=${diary.iddiary}&related_yourtaskuser_userid=${diary.yourtaskuser.userid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${diary.yourtaskuser == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newDiaryYourtaskuser?diary_iddiary=${diary.iddiary}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="yourtaskuser.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="diaryentry.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newDiaryDiaryentries?diary_iddiary=${diary.iddiary}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="diaryentry.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="diaryentry.diaryentryid.title"/></th>
						<th class="thead"><fmt:message key="diaryentry.diaryentrydate.title"/></th>
						<th class="thead"><fmt:message key="diaryentry.diaryentrycontent.title"/></th>
						<th class="thead"><fmt:message key="diaryentry.diaryentryvisibility.title"/></th>
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectDiaryDiaryentries?diary_iddiary=${diary.iddiary}&diaryentries_diaryentryid=${current.diaryentryid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editDiaryDiaryentries?diary_iddiary=${diary.iddiary}&diaryentries_diaryentryid=${current.diaryentryid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteDiaryDiaryentries?diary_iddiary=${diary.iddiary}&related_diaryentries_diaryentryid=${current.diaryentryid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.diaryentryid}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${current.diaryentrydate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.diaryentrycontent}
						&nbsp;
						</td>
						<td>
							${current.diaryentryvisibility}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="goal.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newDiaryGoals?diary_iddiary=${diary.iddiary}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="goal.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="goal.goalid.title"/></th>
						<th class="thead"><fmt:message key="goal.goalname.title"/></th>
						<th class="thead"><fmt:message key="goal.goaldescription.title"/></th>
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectDiaryGoals?diary_iddiary=${diary.iddiary}&goals_goalid=${current.goalid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editDiaryGoals?diary_iddiary=${diary.iddiary}&goals_goalid=${current.goalid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteDiaryGoals?diary_iddiary=${diary.iddiary}&related_goals_goalid=${current.goalid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.goalid}
						&nbsp;
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
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>