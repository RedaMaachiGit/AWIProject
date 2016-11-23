<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.yourtaskuser-resources"/>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.1.1.min.js" crossorigin="anonymous"></script>
<script src="${pageContext.request.contextPath}/js/datatables.min.js" ></script>
<link href="${pageContext.request.contextPath}/css/datatables.min.css" rel="stylesheet" type="text/css" />
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<title>User's list</title>
</head>
<body>
<div id="contentarea" class="container" >
	<div class="row">
		<div class="navitem">
			<a href="${pageContext.request.contextPath}/admin/users/newuser" class="btn btn-primary">NEW USER</a>	
			<a href="${pageContext.request.contextPath}/admin/users/newcompany" class="btn btn-primary">NEW COMPANY</a></div>	
	</div>
	<br>
	<div class="row">
		<div class="table-responsive">	
		<table id="listTable" class="table table-hover table-bordered">
			<thead>
				<tr>
					<th >Actions</th>
					<th >id</th>
					<th >username</th>
					<th >id</th>
					<th >date of birth</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${yourtaskusers}" var="current" varStatus="i">
				<tr>
					<td >
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/admin/users/view/${current.userid}" ><span class="glyphicon glyphicon-search"></span></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/admin/users/edit/${current.userid}"><span class="glyphicon glyphicon-pencil"></span></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/admin/users/delete/${current.userid}&"><span class="glyphicon glyphicon-trash"></span></a>
					</td>
					<td >${current.userid}</td>
					<td >${current.userusername}</td>
					<td>${current.useremail}</td>
					<td><fmt:formatDate dateStyle="short" type="date" value="${current.userdateofbirth.time}"/></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
</div>

<script type="text/javascript">
$(document).ready(function(){
    $('#listTable').DataTable();
});
</script>
</body>
</html>