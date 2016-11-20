<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>	
		<title>Add Comment</title>
		
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
				<div id="content">
					<div class="navitem">
						<a class="button" href="${pageContext.request.contextPath}/selectPublicActivity?activityidKey=${activity_activityid}&">
							<span class="glyphicon glyphicon-arrow-left"></span>
							<span><fmt:message key="navigation.back"/></span>
						</a>
					</div>
					<!-- <h1><fmt:message key="navigation.edit"/> <fmt:message key="comment.title"/></h1> -->
					<h1>Add comment</h1>
			
					<form:form action="${pageContext.request.contextPath}/saveActivityComments" method="POST" modelAttribute="comment">
						<table class="table table-list-search" id="viewTable">
							<tbody>
								<div class="form-group">
									<tr style="display:none;">
										<td valign="top">
											<fmt:message key="comment.commentid.title"/>:
										</td>
										<td>
											<c:choose>
												<c:when test='${newFlag}' >
													<form:input id="comment_commentid" path="commentid" cssStyle="width:300px;"/>
													<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "comment_commentid",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="comment.commentid.help"/>", constraints : {places:0}}})); </script>
												</c:when>
												<c:otherwise>
													${comment.commentid}
													&nbsp;
													<form:hidden id="comment_commentid" path="commentid"/>
												</c:otherwise>
											</c:choose>
										</td>
									</tr>
									<tr>
										<td valign="top">
											Your comment : 
										</td>
										<td>
											<form:input id="comment_commentcontent" path="commentcontent" cssStyle="width:300px;"/>
											<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "comment_commentcontent",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="comment.commentcontent.help"/>"}})); </script>
										</td>
									</tr>
										<tr style="display:none;">
											<td class="label" valign="top">
												<fmt:message key="comment.commentdate.title"/>:
											</td>
											<td>
												<input id="comment_commentdate" name="commentdate" type="text" value="<fmt:formatDate value="${comment.commentdate.time}" pattern="yyyy-MM-dd"/>" dojoType="dijit.form.DateTextBox" constraints="{datePattern:'<fmt:message key="date.format"/>'}" trim="true" promptMessage="<fmt:message key="date.format" />" invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />." style="width:300px;" />
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
				</div>
			</div>
		</div>
	</body>
</html>