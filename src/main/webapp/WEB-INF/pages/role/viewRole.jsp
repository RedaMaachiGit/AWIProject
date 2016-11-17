<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.role-resources"/>
<html>
<head>
<title>View <fmt:message key="role.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="role.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexRole"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="role.roleid.title"/>:
						</td>
						<td>
							${role.roleid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="role.rolename.title"/>:
						</td>
						<td>
							${role.rolename}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="yourtaskuser.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRoleYourtaskusers?role_roleid=${role.roleid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="yourtaskuser.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="yourtaskuser.userid.title"/></th>
						<th class="thead"><fmt:message key="yourtaskuser.userdateofbirth.title"/></th>
						<th class="thead"><fmt:message key="yourtaskuser.userphonenumber.title"/></th>
						<th class="thead"><fmt:message key="yourtaskuser.useremail.title"/></th>
						<th class="thead"><fmt:message key="yourtaskuser.userstreetnumber.title"/></th>
						<th class="thead"><fmt:message key="yourtaskuser.userzipcode.title"/></th>
						<th class="thead"><fmt:message key="yourtaskuser.usercity.title"/></th>
						<th class="thead"><fmt:message key="yourtaskuser.userusername.title"/></th>
						<th class="thead"><fmt:message key="yourtaskuser.userpassword.title"/></th>
						<th class="thead"><fmt:message key="yourtaskuser.usertoken.title"/></th>
						<th class="thead"><fmt:message key="yourtaskuser.userlastconnectiondate.title"/></th>
						<th class="thead"><fmt:message key="yourtaskuser.usertype.title"/></th>
						<th class="thead"><fmt:message key="yourtaskuser.useriban.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${role.yourtaskusers}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectRoleYourtaskusers?role_roleid=${role.roleid}&yourtaskusers_userid=${current.userid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editRoleYourtaskusers?role_roleid=${role.roleid}&yourtaskusers_userid=${current.userid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteRoleYourtaskusers?role_roleid=${role.roleid}&related_yourtaskusers_userid=${current.userid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.userid}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${current.userdateofbirth.time}"/>
						&nbsp;
						</td>
						<td>
							${current.userphonenumber}
						&nbsp;
						</td>
						<td>
							${current.useremail}
						&nbsp;
						</td>
						<td>
							${current.userstreetnumber}
						&nbsp;
						</td>
						<td>
							${current.userzipcode}
						&nbsp;
						</td>
						<td>
							${current.usercity}
						&nbsp;
						</td>
						<td>
							${current.userusername}
						&nbsp;
						</td>
						<td>
							${current.userpassword}
						&nbsp;
						</td>
						<td>
							${current.usertoken}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${current.userlastconnectiondate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.usertype}
						&nbsp;
						</td>
						<td>
							${current.useriban}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="roleresource.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRoleRoleResources?role_roleid=${role.roleid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="roleresource.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="roleresource.roleid.title"/></th>
						<th class="thead"><fmt:message key="roleresource.resourceid.title"/></th>
						<th class="thead"><fmt:message key="roleresource.rightrole.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${role.roleResources}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectRoleRoleResources?role_roleid=${role.roleid}&roleresources_roleid=${current.roleid}&roleresources_resourceid=${current.resourceid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editRoleRoleResources?role_roleid=${role.roleid}&roleresources_roleid=${current.roleid}&roleresources_resourceid=${current.resourceid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteRoleRoleResources?role_roleid=${role.roleid}&related_roleresources_roleid=${current.roleid}&related_roleresources_resourceid=${current.resourceid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.roleid}
						&nbsp;
						</td>
						<td>
							${current.resourceid}
						&nbsp;
						</td>
						<td>
							${current.rightrole}
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