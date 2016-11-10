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
            <li class="./accountsu"><a href="#">My account</a></li>
            <li class="active"><a href="#">My diaries</a></li>
            <li><a href="./">My activities</a></li>
            <li><a href="./">My orders</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>
  
  
  <div class="container">
	<div class="row">
	<h1>List of my diaries</h1>
        <div class="col-md-1">
            <form action="#" method="get">
                <div class="input-group">
                    <!-- USE TWITTER TYPEAHEAD JSON WITH API TO SEARCH -->
                    <!-- <input class="form-control" id="system-search" name="q" placeholder="Search for" required> -->
                    <!-- <span class="input-group-btn"> -->
                        <!-- <button type="submit" class="btn btn-default"><i class="glyphicon glyphicon-search"></i></button> -->
                    <!-- </span> -->
                </div>
            </form>
        </div>
		<div class="col-md-8">
    	 <table class="table table-list-search">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Creation date</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Sample</td>
                            <td>12-11-2011 11:11</td>
                        </tr>
                        <tr>
                            <td>Try</td>
                            <td>11-20-2013 08:56</td>
                        </tr>
                        <tr>
                            <td>§</td>
                            <td>%</td>
                        </tr>
                    </tbody>
                </table>   
		</div>
	</div>
</div>
  
  
  
  
  
  
  </body>
</html>