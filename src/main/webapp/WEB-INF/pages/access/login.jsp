<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
<head>
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
								<a href="" disabled="disabled" class="active" >Login</a>
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
								<form id="login-form" action="j_spring_security_check" method="post" role="form" style="display: block;">
									<div class="form-group">
										<input type="text" name="j_username" id="j_username" size="20" maxlength="50" tabindex="1" class="form-control" placeholder="Username" value="">
									</div>
									<div class="form-group">
										<input type="password" name="j_password" id="j_password" tabindex="2" class="form-control" placeholder="Password">
									</div>
									<div class="form-group text-center">
										<input type="checkbox" tabindex="3" class="" name="remember" id="remember">
										<label for="remember"> Remember Me</label>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" tabindex="4" class="form-control btn btn-primary btn-login" type="submit" value="Login">
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<div class="text-center">
													<a href="" tabindex="5" class="forgot-password">Forgot Password?</a>
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