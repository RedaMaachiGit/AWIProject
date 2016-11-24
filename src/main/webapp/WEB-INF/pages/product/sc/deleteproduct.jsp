<%@page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp" />
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
<head>
<title>Delete product</title>
</head>

<body>

	<div class="container">
		<!-- Bouton BACK -->
		<div class="navitem">
			<a class="button"
				href="${pageContext.request.contextPath}/sc/products"> <span
				class="glyphicon glyphicon-arrow-left"></span> <span><fmt:message
						key="navigation.back" /></span>
			</a>
		</div>
		<h1>Delete product</h1>
		<table class="table table-list-search" id="viewTable">
			<tbody>
				<div class="form-group">
					<tr>
						<td valign="top">Name :</td>
						<td>${product.productname} &nbsp;</td>
					</tr>
					<tr>
						<td valign="top">Description :</td>
						<td>${product.productdescription} &nbsp;</td>
					</tr>
					<tr>
						<td valign="top">Image Link :</td>
						<td>${product.productimage} &nbsp;</td>
					</tr>
					<tr>
						<td valign="top">Price :</td>
						<td>${product.productprice} &nbsp;</td>
					</tr>
					<tr>
						<td valign="top">Available Quantity :</td>
						<td>${product.productavailablequantity} &nbsp;</td>
					</tr>
				</div>
			</tbody>
		</table>
		<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
			<a class="btn btn-primary"
				href="${pageContext.request.contextPath}/deleteYourtaskuserProducts/${product.productid}"><span
				class="glyphicon glyphicon-trash"></span> DELETE</a>
		</div>
		<div class="clear">&nbsp;</div>
	</div>
	<!-- </div></div></div></div> -->
	<!-- </div></div></div></div> -->
</body>
</html>
