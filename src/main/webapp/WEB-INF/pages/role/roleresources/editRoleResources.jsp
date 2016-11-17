<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.role-resources"/>
<html>
<head>
<title>Edit <fmt:message key="role.title"/> <fmt:message key="roleresource.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="roleresource.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectRole?roleidKey=${role_roleid}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveRoleRoleResources" method="POST" modelAttribute="roleresource">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roleresource.roleid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="roleresource_roleid" path="roleid" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "roleresource_roleid",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="roleresource.roleid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${roleresource.roleid}
						&nbsp;
									<form:hidden id="roleresource_roleid" path="roleid"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roleresource.resourceid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="roleresource_resourceid" path="resourceid" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "roleresource_resourceid",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="roleresource.resourceid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${roleresource.resourceid}
						&nbsp;
									<form:hidden id="roleresource_resourceid" path="resourceid"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="roleresource.rightrole.title"/>:
						</td>
						<td>
							<form:checkbox id="roleresource_rightrole" path="rightrole" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "roleresource_rightrole",widgetType : "dijit.form.CheckBox",widgetAttrs : {}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="role_roleid" value="${role_roleid}" >
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
