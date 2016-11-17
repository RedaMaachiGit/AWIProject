<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.roleresource-resources"/>
<html>
<head>
<title>View <fmt:message key="roleresource.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="roleresource.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexRoleResource"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
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
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="resource.title"/></h1>
					
						<c:if test='${roleresource.resource != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="resource.resourceid.title"/>:
						</td>
						<td>
							${roleresource.resource.resourceid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="resource.resourceurl.title"/>:
						</td>
						<td>
							${roleresource.resource.resourceurl}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editRoleResourceResource?roleresource_roleid=${roleresource.roleid}&roleresource_resourceid=${roleresource.resourceid}&resource_resourceid=${roleresource.resource.resourceid}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteRoleResourceResource?roleresource_roleid=${roleresource.roleid}&roleresource_resourceid=${roleresource.resourceid}&related_resource_resourceid=${roleresource.resource.resourceid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${roleresource.resource == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRoleResourceResource?roleresource_roleid=${roleresource.roleid}&roleresource_resourceid=${roleresource.resourceid}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="resource.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="role.title"/></h1>
					
						<c:if test='${roleresource.role != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="role.roleid.title"/>:
						</td>
						<td>
							${roleresource.role.roleid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="role.rolename.title"/>:
						</td>
						<td>
							${roleresource.role.rolename}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editRoleResourceRole?roleresource_roleid=${roleresource.roleid}&roleresource_resourceid=${roleresource.resourceid}&role_roleid=${roleresource.role.roleid}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteRoleResourceRole?roleresource_roleid=${roleresource.roleid}&roleresource_resourceid=${roleresource.resourceid}&related_role_roleid=${roleresource.role.roleid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${roleresource.role == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newRoleResourceRole?roleresource_roleid=${roleresource.roleid}&roleresource_resourceid=${roleresource.resourceid}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="role.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>