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
							<br>
							<div class="col-lg-6"><a href="./register/user" class="btn btn-register">I AM A USER</a></div>
							<div class="col-lg-6"><a href="./register/company" class="btn btn-register">I AM A COMPANY</a></div>
				</div></div></div>
			</div>
		</div>
	</div>
</div>
</body>
</html>