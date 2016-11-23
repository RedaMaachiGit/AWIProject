<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.yourtaskuser-resources"/>
<html>
<head>
<title>Edit <fmt:message key="yourtaskuser.title"/></title>
</head>
<body>
<div id="content" class="container">
		<h1>Let's create a new user</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/admin/users"><span class="glyphicon glyphicon-left"></span><fmt:message key="navigation.back"/></a></div>
		<form:form action="${pageContext.request.contextPath}/saveYourtaskuser" method="POST" modelAttribute="yourtaskuser">
					<div class="hidden">
						<div valign="top">
							<fmt:message key="yourtaskuser.userid.title"/>:
						</div>
						<div class='input'>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="yourtaskuser_userid" path="userid" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userid",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${yourtaskuser.userid}
						&nbsp;
									<form:hidden id="yourtaskuser_userid" path="userid"/>
								</c:otherwise>
							</c:choose>
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-2 control-label">
							Date of birth:
						</div>
						<div class='input'>
							<input id="yourtaskuser_userdateofbirth" name="userdateofbirth" type="text" value="<fmt:formatDate value="${yourtaskuser.userdateofbirth.time}" pattern="yyyy-MM-dd"/>" dojoType="dijit.form.DateTextBox" constraints="{datePattern:'<fmt:message key="date.format"/>'}" trim="true" promptMessage="<fmt:message key="date.format" />" invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />." style="width:300px;" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-2 control-label">
							Phone number:
						</div>
						<div class='input'>
							<form:input id="yourtaskuser_userphonenumber" path="userphonenumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userphonenumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userphonenumber.help"/>"}})); </script>
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-2 control-label">
							Email:
						</div>
						<div class='input'>
							<form:input id="yourtaskuser_useremail" path="useremail" type="email" cssStyle="width:300px;" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_useremail",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.useremail.help"/>"}})); </script>
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-2 control-label">
							Street number:
						</div>
						<div class='input'>
							<form:input id="yourtaskuser_userstreetnumber" path="userstreetnumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userstreetnumber",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userstreetnumber.help"/>"}})); </script>
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-2 control-label">
							Zip code:
						</div>
						<div class='input'>
							<form:input id="yourtaskuser_userzipcode" path="userzipcode" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userzipcode",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userzipcode.help"/>"}})); </script>
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-2 control-label">
							City:
						</div>
						<div class='input'>
							<form:input id="yourtaskuser_usercity" path="usercity" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_usercity",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.usercity.help"/>"}})); </script>
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-2 control-label">
							Username:
						</div>
						<div class='input'>
							<form:input id="yourtaskuser_userusername" path="userusername" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userusername",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userusername.help"/>"}})); </script>
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-2 control-label">
							Password:
						</div>
						<div class='input'>
							<form:input id="yourtaskuser_userpassword" path="userpassword" cssStyle="width:300px;" />
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userpassword",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userpassword.help"/>"}})); </script>
						</div>
					</div>
					<div class="hidden">
						<div class="col-lg-2 control-label">
							<fmt:message key="yourtaskuser.usertoken.title"/>:
						</div>
						<div class='input'>
							<form:input id="yourtaskuser_usertoken" path="usertoken" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_usertoken",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.usertoken.help"/>"}})); </script>
						</div>
					</div>
					<div class="hidden">
						<div class="col-lg-2 control-label">
							<fmt:message key="yourtaskuser.userlastconnectiondate.title"/>:
						</div>
						<div class='input'>
							<input id="yourtaskuser_userlastconnectiondate" name="userlastconnectiondate" type="text" value="<fmt:formatDate value="${yourtaskuser.userlastconnectiondate.time}" pattern="yyyy-MM-dd"/>" dojoType="dijit.form.DateTextBox" constraints="{datePattern:'<fmt:message key="date.format"/>'}" trim="true" promptMessage="<fmt:message key="date.format" />" invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />." style="width:300px;" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-2 control-label">
							Type:
						</div>
						<div class='input'>
							<form:input id="yourtaskuser_usertype" path="usertype" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_usertype",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.usertype.help"/>"}})); </script>
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-2 control-label">
							Iban:
						</div>
						<div class='input'>
							<form:input id="yourtaskuser_useriban" path="useriban" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_useriban",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.useriban.help"/>"}})); </script>
						</div>
					</div>
			<span ><input class="btn btn-success" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
		</form:form>
		<div class="clear">&nbsp;</div>
</div>
</body>
</html>