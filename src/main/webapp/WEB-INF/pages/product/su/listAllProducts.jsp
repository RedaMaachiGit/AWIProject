<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>
		<title>Buy products</title>
		<script src="${pageContext.request.contextPath}/js/datatables.min.js" ></script>
		<link href="${pageContext.request.contextPath}/css/datatables.min.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		<div class="container">
						<div class="row">
							<a class="btn btn-primary" href="${pageContext.request.contextPath}/su/basket/list">
							<span class="glyphicon glyphicon-shopping-cart"></span> See my basket</a>
						</div>
						<h1>Buy Products</h1>
						<h2>From companies using our app</h2>
						<br>
						<table class="table table-bordered table-hover" id="viewTable">
							<thead>
								<tr>
									<th class="thead">Name</th>
									<th class="thead">Description</th>
									<th class="thead">Image</th>
									<th class="thead">Price</th>
									<th class="thead">Available Quantity</th>
									<th> Add to basket</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${products}" var="current"  varStatus="i">	
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
										<td>
											<a class="btn btn-primary" 
											href="${pageContext.request.contextPath}/su/basket/add/${current.productid}">
											<span class="glyphicon glyphicon-plus"></span></a>
											&nbsp;
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<br>
						
						<h2>From external companies</h2>
						<table class="table table-bordered table-hover" id="viewTable2">
							<thead>
								<tr>
									<th class="thead">Name</th>
									<th class="thead">Description</th>
									<th class="thead">Image</th>
									<th class="thead">Price</th>
									<th class="thead">Available Quantity</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${externalproducts}" var="current"  varStatus="i">	
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
											${externalproducts[i.index].name}
											&nbsp;
										</td>
										<td>
											${externalproducts[i.index].description}
											&nbsp;
										</td>
										<td>
											<img src="${externalproducts[i.index].image}" alt="Product Image" style="max-height:5%;">
											&nbsp;
										</td>
										<td>
											${externalproducts[i.index].price}
											&nbsp;
										</td>
										<td>
											${externalproducts[i.index].availablequantity}
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
			    $('#viewTable2').DataTable();
			});
			</script>
	</body>
</html>