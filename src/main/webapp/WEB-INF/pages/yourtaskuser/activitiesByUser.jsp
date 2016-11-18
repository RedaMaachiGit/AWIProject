<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.yourtaskuser-resources"/>
<html>
<head>
<title>My activities</title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexYourtaskuser"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	

			<h1>My Activities</h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newYourtaskuserActivities?yourtaskuser_userid=${yourtaskuser.userid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="activity.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead">Name</th>
						<th class="thead">Description</th>
						<th class="thead">Visibility</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${yourtaskuser.activities}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectYourtaskuserActivities?yourtaskuser_userid=${yourtaskuser.userid}&activities_activityid=${current.activityid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editYourtaskuserActivities?yourtaskuser_userid=${yourtaskuser.userid}&activities_activityid=${current.activityid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteYourtaskuserActivities?yourtaskuser_userid=${yourtaskuser.userid}&related_activities_activityid=${current.activityid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.activityname}
						&nbsp;
						</td>
						<td>
							${current.activitydescription}
						&nbsp;
						</td>
						<td>
							${current.activityvisibility}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>

		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>