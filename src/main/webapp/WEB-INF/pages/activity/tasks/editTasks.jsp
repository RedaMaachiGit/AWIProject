<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>
		<title>Add/Edit Task</title>
		
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
			<!-- <div id="lb"><div id="rb"><div id="bb"><div id="blc"> -->
			<!-- <div id="brc"><div id="tb"><div id="tlc"><div id="trc"> -->
				<div id="content">
					
					<!-- Bouton BACK -->
					<div class="navitem">
						<a class="button" href="${pageContext.request.contextPath}/selectActivity?activityidKey=${activity_activityid}&">
							<span class="glyphicon glyphicon-arrow-left"></span>
							<span><fmt:message key="navigation.back"/></span>
						</a>
					</div>
					<h1>Add or edit Task</h1>
						<form:form action="${pageContext.request.contextPath}/saveActivityTasks" method="POST" modelAttribute="task">
							<table class="table table-list-search" id="viewTable">
								<tbody>
									<div class="form-group">
										<tr style="display:none;">
											<td valign="top">
												Identifier :
												<!-- <fmt:message key="task.taskid.title"/>: -->
											</td>
											<td>
												<c:choose>
													<c:when test='${newFlag}' >
														<form:input id="task_taskid" path="taskid" cssStyle="width:300px;"/>
														<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "task_taskid",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="task.taskid.help"/>", constraints : {places:0}}})); </script>
													</c:when>
													<c:otherwise>
														${task.taskid}
														&nbsp;
														<form:hidden id="task_taskid" path="taskid"/>
													</c:otherwise>
												</c:choose>
											</td>
										</tr>
										<tr>
											<td valign="top">
												Task : 
											</td>
											<td>
												<form:input id="task_taskcontent" path="taskcontent" cssStyle="width:300px;"/>
												<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "task_taskcontent",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "Enter/Edit task content"}})); </script>
											</td>
										</tr>
									</div>
								</tbody>
							</table>
							<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
								<span class="inputbutton">
									<input class="btn-lg btn-primary btn-block" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/>
								</span>
							</div>
							<!-- <script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script> -->
							<!-- <input type="hidden" name="activity_activityid" value="${activity_activityid}" > -->
						</form:form>
						<div class="clear">&nbsp;</div>
					</div>
					<!-- </div></div></div></div> -->
					<!-- </div></div></div></div> -->
				</div>
			</div>
		</div>
	</body>
</html>