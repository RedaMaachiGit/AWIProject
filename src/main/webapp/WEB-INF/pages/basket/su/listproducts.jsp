<%@page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp" />
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
<head>
<title>Buy products</title>
<script src="${pageContext.request.contextPath}/js/datatables.min.js"></script>
<link href="${pageContext.request.contextPath}/css/datatables.min.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="container">
		<h1>Your basket</h1>
		<br> ${product2}
		<table class="table table-bordered table-hover" id="viewTable">
			<thead>
				<tr>
					<th class="thead">Name</th>
					<th class="thead">Description</th>
					<th class="thead">Image</th>
					<th class="thead">Price</th>
					<th class="thead">Available Quantity</th>
					<th>remove from basket</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
							<c:set var="rowclass" value="rowtwo" />
						</c:when>
						<c:otherwise>
							<c:set var="rowclass" value="rowone" />
						</c:otherwise>
					</c:choose>
					<tr class="${rowclass}">
						<td>${current.productname}&nbsp;</td>
						<td>${current.productdescription}&nbsp;</td>
						<td><img src="${current.productimage}" alt="Product Image"
							style="max-height: 20%;"> &nbsp;</td>
						<td>${current.productprice}&nbsp;</td>
						<td>${current.productavailablequantity}&nbsp;</td>
						<td><a class="btn btn-danger"
							href="${pageContext.request.contextPath}/su/basket/remove/${current.productid}">
								<span class="glyphicon glyphicon-remove"></span>
						</a> &nbsp;</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
		<div class="row">
			<a class="btn btn-lg btn-success"
				href="${pageContext.request.contextPath}/su/basket/order">
				Validate your order</a> <a class="btn btn-lg btn-primary"
				href="${pageContext.request.contextPath}/su/allproducts">
				Continue shopping</a>
		</div>

		<div class="clear">&nbsp;</div>
		<div class="spacer">&nbsp;</div>
	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#viewTable').DataTable();
			$('#viewTable2').DataTable();
		});
	</script>
</body>
</html>