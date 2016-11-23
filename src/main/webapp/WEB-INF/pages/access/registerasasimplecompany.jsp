<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.yourtaskuser-resources"/>

<html>
<head>
	<title>Welcome Home </title>
</head>

<body>
<div class="container">
    	<div class="row">
			<div class="col-md-6">
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
						<td class=" col-lg-2 control-label" valign="top">
							Username:
						</td>
						<td>
							<form:input id="yourtaskuser_userusername" path="userusername" cssStyle="width:200px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userusername",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userusername.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class=" col-lg-2 control-label" valign="top">
							Password:
						</td>
						<td>
							<form:input id="yourtaskuser_userpassword" path="userpassword" cssStyle="width:200px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userpassword",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userpassword.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class=" col-lg-2 control-label" valign="top">
							Date of birth:
						</td>
						<td>
							<input id="yourtaskuser_userdateofbirth" name="userdateofbirth" type="text" value="<fmt:formatDate value="${yourtaskuser.userdateofbirth.time}" pattern="yyyy-MM-dd"/>" dojoType="dijit.form.DateTextBox" constraints="{datePattern:'<fmt:message key="date.format"/>'}" trim="true" promptMessage="<fmt:message key="date.format" />" invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />." style="width:300px;" />
						</td>
					</tr>
					<tr>
						<td class=" col-lg-2 control-label" valign="top">
							Phone number:
						</td>
						<td>
							<form:input id="yourtaskuser_userphonenumber" path="userphonenumber" cssStyle="width:200px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userphonenumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userphonenumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class=" col-lg-2 control-label" valign="top">
							Email:
						</td>
						<td>
							<form:input id="yourtaskuser_useremail" type="email" path="useremail" cssStyle="width:200px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_useremail",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.useremail.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class=" col-lg-2 control-label" valign="top">
							Street number:
						</td>
						<td>
							<form:input id="yourtaskuser_userstreetnumber" path="userstreetnumber" cssStyle="width:200px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userstreetnumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userstreetnumber.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class=" col-lg-2 control-label" valign="top">
							Zip code:
						</td>
						<td>
							<form:input id="yourtaskuser_userzipcode" path="userzipcode" cssStyle="width:200px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userzipcode",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userzipcode.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class=" col-lg-2 control-label" valign="top">
							City:
						</td>
						<td>
							<form:input id="yourtaskuser_usercity" path="usercity" cssStyle="width:200px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_usercity",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.usercity.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class=" col-lg-2 control-label" valign="top">
							Iban:
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
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">
						What is YourTask
					</div>
					<div class="panel-body">
						<p>Software engineering project - IG5. Team is composed of four fifth year engineering students of Polytech Montpellier majoring Computer Science and Management.
							Babacar THIAW Coline LABAT Gaetan PHILIPPE Reda MAACHI.The aim of the project is to build an application which purpose is to help people in achieving objectives by making activities such as gardening, running or building a treehouse. In addition to that, users of the app can shop products like on a shopping website. They also can interact with sellers or other users and keep a diary of their activities.
						
						</p>	
					</div>
				</div>
			</div>
	</div>
</div>
</body>
</html>