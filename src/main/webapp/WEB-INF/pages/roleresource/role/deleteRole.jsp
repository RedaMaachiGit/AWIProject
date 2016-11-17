<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.roleresource-resources"/>
<html>
<head>
<title>View <fmt:message key="roleresource.title"/> <fmt:message key="role.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="role.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectRoleResource?roleidKey=${roleresource_roleid}&resourceidKey=${roleresource_resourceid}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
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
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteRoleResourceRole?roleresource_roleid=${roleresource_roleid}&roleresource_resourceid=${roleresource_resourceid}&related_role_roleid=${role.roleid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>