<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.yourtaskuser-resources"/>

<html>
<head>
	<title>Registration</title>
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
						<br>
						<div class="col-md-6"><a href="./register/user" class="btn btn-primary">I AM A USER</a></div>
						<div class="col-md-6"><a href="./register/company" class="btn btn-primary">I AM A COMPANY</a></div>
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
</div>
</body>
</html>