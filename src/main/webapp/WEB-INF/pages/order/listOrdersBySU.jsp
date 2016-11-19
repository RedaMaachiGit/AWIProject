<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.order-resources"/>
<html>
<head>
<title>List <fmt:message key="order.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>My Orders</h1>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<!--<th class="thead">&nbsp;</th>-->
					<th class="thead">Date</th>
					<th class="thead">Price</th>
					<th class="thead">State</th>
				</tr>
			</thead>
			<tbody>
				<!--<c:forEach items="${orders}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					 <td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectOrder?orderidKey=${current.orderid}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editOrder?orderidKey=${current.orderid}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteOrder?orderidKey=${current.orderid}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="date" value="${current.orderdate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.orderprice}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.orderstate}
						&nbsp;
					</td>
				</tr>
				</c:forEach>
				-->
				<c:forEach items="${yourtaskuser.ordersForUserid}" var="current"  varStatus="i">	
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
			    			<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>
					<tr class="${rowclass}">
						<!-- <td nowrap="nowrap" class="tabletd">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectOrder?orderidKey=${current.orderid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editOrder?orderidKey=${current.orderid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteOrder?orderidKey=${current.orderid}&"><img src="images/icons/delete.gif" /></a>
						</td>-->
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${current.orderdate.time}"/>
							&nbsp;
						</td>
						<td>
							${current.orderprice}
							&nbsp;
						</td>
						<td>
							${current.orderstate}
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