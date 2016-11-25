<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.yourtaskuser-resources"/>

<html>
<head>
	<title>Welcome Home </title>
	
<script src="${pageContext.request.contextPath}/js/oauth.js"></script>
<script>
  // This is called with the results from from FB.getLoginStatus().
  function statusChangeCallback(response) {
    console.log('statusChangeCallback');
    console.log(response);
    // The response object is returned with a status field that lets the
    // app know the current login status of the person.
    // Full docs on the response object can be found in the documentation
    // for FB.getLoginStatus().
    if (response.status === 'connected') {
      // Logged into your app and Facebook.
    } else if (response.status === 'not_authorized') {
      // The person is logged into Facebook, but not your app.
      document.getElementById('status').innerHTML = 'Please log ' +
        'into this app.';
    } else {
      // The person is not logged into Facebook, so we're not sure if
      // they are logged into this app or not.
      document.getElementById('status').innerHTML = 'Please log ' +
        'into Facebook.';
    }
  }

  // This function is called when someone finishes with the Login
  // Button.  See the onlogin handler attached to it in the sample
  // code below.
  function checkLoginState() {
    FB.getLoginStatus(function(response) {
      statusChangeCallback(response);
    });
  }

  window.fbAsyncInit = function() {
  FB.init({
    appId      : '1774492366139434',
    cookie     : true,  // enable cookies to allow the server to access 
                        // the session
    xfbml      : true,  // parse social plugins on this page
    version    : 'v2.8' // use graph api version 2.8
  });

  // Now that we've initialized the JavaScript SDK, we call 
  // FB.getLoginStatus().  This function gets the state of the
  // person visiting this page and can return one of three states to
  // the callback you provide.  They can be:
  //
  // 1. Logged into your app ('connected')
  // 2. Logged into Facebook, but not your app ('not_authorized')
  // 3. Not logged into Facebook and can't tell if they are logged into
  //    your app or not.
  //
  // These three cases are handled in the callback function.

  FB.getLoginStatus(function(response) {
    statusChangeCallback(response);
  });

  };

  // Load the SDK asynchronously
  (function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "//connect.facebook.net/en_US/sdk.js";
    fjs.parentNode.insertBefore(js, fjs);
  }(document, 'script', 'facebook-jssdk'));
</script>
	
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
		<form:form onsubmit="logoutFromFacebook();" action="${pageContext.request.contextPath}/register/saveuser" method="POST" modelAttribute="yourtaskuser">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class=" col-lg-2 control-label" valign="top">
							Username:
						</td>
						<td>
							<form:input value='<%= request.getParameter("facebookname") %>' id="yourtaskuser_userusername" path="userusername" cssStyle="width:200px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "yourtaskuser_userusername",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="yourtaskuser.userusername.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class=" col-lg-2 control-label" valign="top">
							Password:
						</td>
						<td>
							<form:input id="yourtaskuser_userpassword" type="password" path="userpassword" cssStyle="width:200px;"/>
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
							<form:input value='<%= request.getParameter("facebookmail") %>' id="yourtaskuser_useremail" path="useremail" type="email" cssStyle="width:200px;"/>
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
							<form:input value='<%= request.getParameter("facebookcity") %>' id="yourtaskuser_usercity" path="usercity" cssStyle="width:200px;"/>
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
			<br>
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
<script>
function logoutFromFacebook() {

	FB.logout(function(response) {
  		// user is now logged out
	});
}
	</script>
</body>
</html>