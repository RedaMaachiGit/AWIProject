<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.yourtaskuser-resources"/>
<html>
<head>
<title>Edit <fmt:message key="yourtaskuser.title"/> <fmt:message key="suinfo.title"/></title>
</head>
<body>
<div class="container">
    	<div class="row">
			<div class="col-md-9 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="${pageContext.request.contextPath}/login" >Login</a>
							</div>
							<div class="col-xs-6">
								<a href="#" class="active" disabled="disabled" >Register</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
					<div class="row">
							<div class="col-lg-12">
		<form:form action="${pageContext.request.contextPath}/register/saveuserinfos" method="POST" modelAttribute="suinfo">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="suinfo.suinfoid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="suinfo_suinfoid" path="suinfoid" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "suinfo_suinfoid",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="suinfo.suinfoid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${suinfo.suinfoid}
						&nbsp;
									<form:hidden id="suinfo_suinfoid" path="suinfoid"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="suinfo.suinfofirstname.title"/>:
						</td>
						<td>
							<form:input id="suinfo_suinfofirstname" path="suinfofirstname" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "suinfo_suinfofirstname",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="suinfo.suinfofirstname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="suinfo.suinfolastname.title"/>:
						</td>
						<td>
							<form:input id="suinfo_suinfolastname" path="suinfolastname" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "suinfo_suinfolastname",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="suinfo.suinfolastname.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="yourtaskuser_userid" value="${yourtaskuser_userid}" >
				
				
				
				
				
				
				
				
				
				
				
				
		</form:form>
		<div class="clear">&nbsp;</div>

				</div></div></div>
			</div>
		</div>
	</div>
</div>
</body>
</html>
