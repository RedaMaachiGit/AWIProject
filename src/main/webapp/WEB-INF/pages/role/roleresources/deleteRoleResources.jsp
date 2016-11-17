<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.role-resources"/>
<html>
<head>
<title>View <fmt:message key="role.title"/> <fmt:message key="roleresource.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="roleresource.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectRole?roleidKey=${role_roleid}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roleresource.roleid.title"/>:
						</td>
						<td>
							${roleresource.roleid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roleresource.resourceid.title"/>:
						</td>
						<td>
							${roleresource.resourceid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roleresource.rightrole.title"/>:
						</td>
						<td>
							${roleresource.rightrole}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteRoleRoleResources?role_roleid=${role_roleid}&related_roleresources_roleid=${roleresource.roleid}&related_roleresources_resourceid=${roleresource.resourceid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
