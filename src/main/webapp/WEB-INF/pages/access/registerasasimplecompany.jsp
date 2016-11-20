<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.yourtaskuser-resources"/>

<html>
<head>
	<title>Welcome Home </title>
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
		<form:form action="${pageContext.request.contextPath}/register/savecompany" method="POST" modelAttribute="yourtaskuser">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.userusername.title"/>:
						</td>
						<td>
							<form:input id="yourtaskuser_userusername" path="userusername" cssStyle="width:200px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userusername",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userusername.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.userpassword.title"/>:
						</td>
						<td>
							<form:input id="yourtaskuser_userpassword" path="userpassword" cssStyle="width:200px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userpassword",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userpassword.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.userdateofbirth.title"/>:
						</td>
						<td>
							<input id="yourtaskuser_userdateofbirth" name="userdateofbirth" type="text" value="<fmt:formatDate value="${yourtaskuser.userdateofbirth.time}" pattern="yyyy-MM-dd"/>" dojoType="dijit.form.DateTextBox" constraints="{datePattern:'<fmt:message key="date.format"/>'}" trim="true" promptMessage="<fmt:message key="date.format" />" invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />." style="width:300px;" />
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.userphonenumber.title"/>:
						</td>
						<td>
							<form:input id="yourtaskuser_userphonenumber" path="userphonenumber" cssStyle="width:200px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userphonenumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userphonenumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.useremail.title"/>:
						</td>
						<td>
							<form:input id="yourtaskuser_useremail" path="useremail" cssStyle="width:200px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_useremail",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.useremail.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.userstreetnumber.title"/>:
						</td>
						<td>
							<form:input id="yourtaskuser_userstreetnumber" path="userstreetnumber" cssStyle="width:200px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userstreetnumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userstreetnumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.userzipcode.title"/>:
						</td>
						<td>
							<form:input id="yourtaskuser_userzipcode" path="userzipcode" cssStyle="width:200px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userzipcode",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userzipcode.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.usercity.title"/>:
						</td>
						<td>
							<form:input id="yourtaskuser_usercity" path="usercity" cssStyle="width:200px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_usercity",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.usercity.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.useriban.title"/>:
						</td>
						<td>
							<form:input id="yourtaskuser_useriban" path="useriban" cssStyle="width:200px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_useriban",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.useriban.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span><input class="btn btn-success" id="save" type="submit" value="BEGIN YOUR JOURNEY"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
		</form:form>
		<div class="clear">&nbsp;</div>

				</div></div></div>
			</div>
		</div>
	</div>
</div>
</body>
</html>