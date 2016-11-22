<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>
		<title>Activity details</title>
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
          			<li>
          				<!-- <a href="./">Log out</a> -->
          				<c:url value="/logout" var="logoutUrl" />
      					<a class="float-xs-right btn btn-outline-danger" href="${logoutUrl}">Log out</a>
          			</li>
          		</ul>
        	</div><!--/.nav-collapse -->
      	</div>
    </div>
			
	<div class="col-lg-8 col-lg-offset-2">
		<div class="col-md-7">
			<div id="contentarea">      
				<div id="content">
					<!-- Bouton BACK -->
					<div class="navitem">
						<a class="button" href="${pageContext.request.contextPath}/su/allactivities">
							<span class="glyphicon glyphicon-arrow-left"></span>
							<span><fmt:message key="navigation.back"/></span>
						</a>
					</div>
				
					<h1>Activity details</h1>
				
					<table class="table table-list-search" id="viewTable">
						<tbody>
							<div class="form-group">
								<div class="clear">&nbsp;</div>
									Name : ${activity.activityname}
									&nbsp;
									</br>
									Description : ${activity.activitydescription}
										&nbsp;
							</div>
						</tbody>
					</table>

					<h1>Diaries</h1>
					
					<table class="table table-list-search" id="viewTable">
						<thead>
							<tr>
								<th class="thead">&nbsp;</th>
								<th class="thead">Name</th>
								<th class="thead">Date</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${activity.diaries}" var="current"  varStatus="i">	
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
										<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/su/allactivities/activity/${activity.activityid}/diary/${current.iddiary}">
											<span class="glyphicon glyphicon-zoom-in"></span>
										</a>
									</td>
									<td>
										${current.diaryname}
									&nbsp;
									</td>
									<td>
										<fmt:formatDate dateStyle="short" type="date" value="${current.diarydate.time}"/>
									&nbsp;
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
			
					<h1>Tasks</h1>
					
					<table class="table table-list-search" id="viewTable">
						<thead>
							<tr>
								<th class="thead">&nbsp;</th>
								<th class="thead">Task</th>
							</tr>
						</thead>
						<div class="form-group">
							<tbody>
								<c:forEach items="${activity.tasks}" var="current"  varStatus="i">	
									<c:choose>
										<c:when test="${(i.count) % 2 == 0}">
								    		<c:set var="rowclass" value="rowtwo"/>
										</c:when>
										<c:otherwise>
								    		<c:set var="rowclass" value="rowone"/>
										</c:otherwise>
									</c:choose>
									<tr class="${rowclass}">
										<td>
											${current.taskcontent}
										&nbsp;
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</div>
					</table>
			
					<h1>Comments</h1>
					
					<div class="navitem">
						<a class="button" href="${pageContext.request.contextPath}/su/allactivities/activity/${activity.activityid}/createComment">
							<span class="glyphicon glyphicon-plus"></span>
							<span><fmt:message key="navigation.new"/> <fmt:message key="comment.title"/></span>
						</a>
					</div>
					<table class="table table-list-search" id="viewTable">
						<thead>
							<tr>
								<!--<th class="thead">&nbsp;</th>-->
								<th class="thead">Date</th>
								<th class="thead">Comment</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${activity.comments}" var="current"  varStatus="i">	
								<c:choose>
									<c:when test="${(i.count) % 2 == 0}">
							    		<c:set var="rowclass" value="rowtwo"/>
									</c:when>
									<c:otherwise>
							    		<c:set var="rowclass" value="rowone"/>
									</c:otherwise>
								</c:choose>
								<tr class="${rowclass}">
									<!--
									<td nowrap="nowrap">
										<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectActivityComments?activity_activityid=${activity.activityid}&comments_commentid=${current.commentid}&"><img src="images/icons/view.gif" /></a>
										<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editActivityComments?activity_activityid=${activity.activityid}&comments_commentid=${current.commentid}&"><img src="images/icons/edit.gif" /></a>
										<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteActivityComments?activity_activityid=${activity.activityid}&related_comments_commentid=${current.commentid}&"><img src="images/icons/delete.gif" /></a>
									</td>
									-->
									<td>
										<fmt:formatDate dateStyle="short" type="date" value="${current.commentdate.time}"/>
									&nbsp;
									</td>
									<td>
										${current.commentcontent}
									&nbsp;
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="clear">&nbsp;</div>
				</div>
			</div>
		</div>
	</body>
</html>