<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.resource-resources"/>
<html>
<head>
<title>View <fmt:message key="resource.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="resource.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexResource"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="resource.resourceid.title"/>:
						</td>
						<td>
							${resource.resourceid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="resource.resourceurl.title"/>:
						</td>
						<td>
							${resource.resourceurl}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="roleresource.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newResourceRoleResources?resource_resourceid=${resource.resourceid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="roleresource.title"/></span></a></div>
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
					<c:forEach items="${resource.roleResources}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectResourceRoleResources?resource_resourceid=${resource.resourceid}&roleresources_roleid=${current.roleid}&roleresources_resourceid=${current.resourceid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editResourceRoleResources?resource_resourceid=${resource.resourceid}&roleresources_roleid=${current.roleid}&roleresources_resourceid=${current.resourceid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteResourceRoleResources?resource_resourceid=${resource.resourceid}&related_roleresources_roleid=${current.roleid}&related_roleresources_resourceid=${current.resourceid}&"><img src="images/icons/delete.gif" /></a>
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