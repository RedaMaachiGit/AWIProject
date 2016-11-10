<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page pageEncoding="UTF-8" %>

<html lang="en">
  <head>
    <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge"> -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Starter Template for Bootstrap</title>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>


    <!-- Custom styles for this template -->
    <link href="starter-template.css" rel="stylesheet">

  </head>

  <body>

    <div class="navbar navbar-inverse navbar">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Your Task</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
          <li><a href="./homesu">Home</a></li>
            <li class="active"><a href="#">My account</a></li>
            <li><a href="./diarysu">My diaries</a></li>
            <li><a href="./">My activities</a></li>
            <li><a href="./">My orders</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>
    
    <div class="container">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<h1>My information</h1>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="login-form" action="http://phpoll.com/login/process" method="post" role="form" style="display: block;">				
									<div class="form-group">
										<input type="text" name="name" id="name" tabindex="1" class="form-control" placeholder="Name" value="">									
									</div>
									
									<div class="form-group">
										<input type="text" name="surname" id="surname" tabindex="2" class="form-control" placeholder="Surname">
									</div>
									
									<div class="form-group">
										<input type="text" name="dateBirth" id="dateBirth" tabindex="3" class="form-control" placeholder="Date of birth">
									</div>
									
									<div class="form-group">
										<input type="email" name="email" id="email" tabindex="4" class="form-control" placeholder="Email address">
									</div>
									
									<div class="form-group">
										<input type="text" name="streetNumber" id="streetNumber" tabindex="5" class="form-control" placeholder="Street number">
									</div>
												
									<div class="form-group">
										<input type="text" name="streetName" id="streetName" tabindex="6" class="form-control" placeholder="Street name">
									</div>
											
									<div class="form-group">
										<input type="text" name="zipCode" id="zipCode" tabindex="7" class="form-control" placeholder="Zip code">
									</div>
									
									<div class="form-group">
										<input type="text" name="cityName" id="cityName" tabindex="8" class="form-control" placeholder="City name">
									</div>
									
									<div class="form-group">
										<input type="tel" name="phoneNumber" id="phoneNumber" tabindex="9" class="form-control" placeholder="Phone number">
									</div>
									
									<div class="form-group">
										<input type="text" name="iban" id="iban" tabindex="10" class="form-control" placeholder="IBAN">
									</div>
									
									<div class="form-group">
										<input type="text" name="username" id="username" tabindex="11" class="form-control" placeholder="Username">
									</div>
									
									<div class="form-group">
										<input type="password" name="password" id="password" tabindex="12" class="form-control" placeholder="Password">
									</div>
																		
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<button type="submit" id="submit" name="submit" class="btn-lg btn-primary btn-block">Edit</button>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
											</div>
										</div>
									</div>
								</form>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
    
    
   </body>
</html>
