<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>
		<title>My activities</title>
		<head>
			<!-- <meta http-equiv="X-UA-Compatible" content="IE=edge"> -->
    		<meta name="viewport" content="width=device-width, initial-scale=1">
    		<meta name="description" content="">
    		<meta name="author" content="">
		
    		<title>YourTask</title>

    		<!-- Latest compiled and minified CSS -->
    		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    		<!-- Optional theme -->
    		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

			<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

    		<!-- Latest compiled and minified JavaScript -->
    		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>


    		<!-- Custom styles for this template -->
    		<!-- <link href="starter-template.css" rel="stylesheet"> -->
		</head>
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
            			<li><a href="./accountsu">My account</a></li>
            			<li><a href="./diarysu">My diaries</a></li>
            			<li class="active"><a href="#">My activities</a></li>
            			<li><a href="./ordersu">My orders</a></li>
          			</ul>
          			<ul class="nav navbar-nav navbar-right">
          				<li><a href="./">Log out</a></li>
          			</ul>
        		</div><!--/.nav-collapse -->
      		</div>
    	</div>

		<div class="col-lg-8 col-lg-offset-2">
			<div class="col-md-7">
				<div id="contentarea">      
				<!-- <div id="lb"><div id="rb"><div id="bb"><div id="blc"> -->
				<!-- <div id="brc"><div id="tb"><div id="tlc"><div id="trc"> -->
					<div id="content">
						<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexYourtaskuser"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
						<h1>My Activities</h1>
						<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newYourtaskuserActivities?yourtaskuser_userid=${yourtaskuser.userid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="activity.title"/></span></a></div>
						<table class="table table-list-search" id="viewTable">
							<thead>
								<tr>
									<th class="thead">&nbsp;</th>
									<th class="thead">Name</th>
									<th class="thead">Description</th>
									<th class="thead">Visibility</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${yourtaskuser.activities}" var="current"  varStatus="i">	
									<c:choose>
										<c:when test="${(i.count) % 2 == 0}">
						    				<c:set var="rowclass" value="rowtwo"/>
										</c:when>
										<c:otherwise>
							    			<c:set var="rowclass" value="rowone"/>
										</c:otherwise>
									</c:choose>
									<tr class="${rowclass}">
										<td nowrap="nowrap">
											<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectYourtaskuserActivities?yourtaskuser_userid=${yourtaskuser.userid}&activities_activityid=${current.activityid}&"><img src="images/icons/view.gif" /></a>
											<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editYourtaskuserActivities?yourtaskuser_userid=${yourtaskuser.userid}&activities_activityid=${current.activityid}&"><img src="images/icons/edit.gif" /></a>
											<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteYourtaskuserActivities?yourtaskuser_userid=${yourtaskuser.userid}&related_activities_activityid=${current.activityid}&"><img src="images/icons/delete.gif" /></a>
										</td>
										<td>
											${current.activityname}
											&nbsp;
										</td>
										<td>
											${current.activitydescription}
											&nbsp;
										</td>
										<td>
											${current.activityvisibility}
											&nbsp;
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					<div class="clear">&nbsp;</div>
				<div class="spacer">&nbsp;</div>
			</div>
			<!-- </div></div></div></div> -->
			<!-- </div></div></div></div> -->
		</div>
	</body>
</html>