<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.product-resources"/>
<html>
<head>
<title>List <fmt:message key="product.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>See all products</h1>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<!--<th class="thead">&nbsp;</th>-->
					<th class="thead">Name</th>
					<th class="thead">Description</th>
					<th class="thead">Image</th>
					<th class="thead">Price</th>
					<th class="thead">Available Quantity</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					<!--<td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProduct?productidKey=${current.productid}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProduct?productidKey=${current.productid}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProduct?productidKey=${current.productid}&"><img src="images/icons/delete.gif" /></a>
					</td>-->
					<td nowrap="nowrap" class="tabletd">
						
							${current.productname}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productdescription}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<img src="${current.productimage}" alt="Product Image" style="max-height:20%;">
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productprice}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.productavailablequantity}
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>