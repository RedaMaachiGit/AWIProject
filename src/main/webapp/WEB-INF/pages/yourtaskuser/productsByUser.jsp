<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>
		<title>My activities</title>
		<script src="${pageContext.request.contextPath}/js/datatables.min.js" ></script>
		<link href="${pageContext.request.contextPath}/css/datatables.min.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		<div class="container">
						<h1>My Products</h1>
						<div class="navitem">
							<a class="btn btn-primary" href="${pageContext.request.contextPath}/sc/product/new">
								<span class="glyphicon glyphicon-plus"></span>
								<span>New Product</span>
							</a>
						</div>
						<br>
						<table class="table table-bordered table-hover" id="viewTable">
							<thead>
								<tr>
									<th class="thead">&nbsp;</th>
									<th class="thead">Name</th>
									<th class="thead">Description</th>
									<th class="thead">Image</th>
									<th class="thead">Price</th>
									<th class="thead">Available Quantity</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${yourtaskuser.products}" var="current"  varStatus="i">	
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
											<!--<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/sc/${yourtaskuser.userid}/product/${current.productid}">
												<span class="glyphicon glyphicon-zoom-in"></span>
											</a>-->
											
											<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/sc/product/${current.productid}/editProduct">
												<span class="glyphicon glyphicon-pencil"></span>
											</a>
											
											<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/sc/product/${current.productid}/deleteProduct">
												<span class="glyphicon glyphicon-trash"></span>
											</a>
										</td>
										<td>
											${current.productname}
											&nbsp;
										</td>
										<td>
											${current.productdescription}
											&nbsp;
										</td>
										<td>
											<img src="${current.productimage}" alt="Product Image" style="max-height:20%;">
											&nbsp;
										</td>
										<td>
											${current.productprice}
											&nbsp;
										</td>
										<td>
											${current.productavailablequantity}
											&nbsp;
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					<div class="clear">&nbsp;</div>
				<div class="spacer">&nbsp;</div>
			</div>
			<script type="text/javascript">
			$(document).ready(function(){
			    $('#viewTable').DataTable();
			});
			</script>
	</body>
</html>