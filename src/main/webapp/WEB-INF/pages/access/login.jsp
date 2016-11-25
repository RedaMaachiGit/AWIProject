<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<html>
<head>

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
      testAPI();
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

  // Here we run a very simple test of the Graph API after login is
  // successful.  See statusChangeCallback() for when this call is made.
  function testAPI() {
    console.log('Welcome!  Fetching your information.... ');
    FB.api('/me', function(response) {
      //console.log('Successful login for: ' + response.name + 'reponse: ' + ' ' + response.mail + ' ' + response.first_name + ' ' + response.location);
      window.location = 'http://yourtask.mybluemix.net/register/user?facebookmail=' + response.mail + '&facebookcity=' + response.location + '&facebookname=' + response.name.replace(/ /g,"_");
    });
  }
</script>

<title>Welcome to Yourtask</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="" disabled="disabled" class="active">Login</a>
							</div>
							<div class="col-xs-6">
								<a href="${pageContext.request.contextPath}/register">Register</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="login-form" action="j_spring_security_check"
									method="post" role="form" style="display: block;">
									<div class="form-group">
										<input type="text" name="j_username" id="j_username" size="20"
											maxlength="50" tabindex="1" class="form-control"
											placeholder="Username" value="">
									</div>
									<div class="form-group">
										<input type="password" name="j_password" id="j_password"
											tabindex="2" class="form-control" placeholder="Password">
									</div>
									<div class="form-group text-center">
										<input type="checkbox" tabindex="3" class="" name="remember"
											id="remember"> <label for="remember">
											Remember Me</label>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" tabindex="4"
													class="form-control btn btn-primary btn-login"
													type="submit" value="Login">
											</div>
											<fb:login-button scope="public_profile,email" onlogin="checkLoginState();">
											</fb:login-button>

											<div id="status">
											</div>
											
										</div>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<div class="text-center">
													<a href="" tabindex="5" class="forgot-password">Forgot
														Password?</a>
												</div>
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">What is YourTask</div>
					<div class="panel-body">
						<p>Software engineering project - IG5. Team is composed of
							four fifth year engineering students of Polytech Montpellier
							majoring Computer Science and Management. Babacar THIAW Coline
							LABAT Gaetan PHILIPPE Reda MAACHI.The aim of the project is to
							build an application which purpose is to help people in achieving
							objectives by making activities such as gardening, running or
							building a treehouse. In addition to that, users of the app can
							shop products like on a shopping website. They also can interact
							with sellers or other users and keep a diary of their activities.

						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript">
	function checkLoginState() {
		  FB.getLoginStatus(function(response) {
		    statusChangeCallback(response);
		  });
		}
	</script>
</body>
</html>