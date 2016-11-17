<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.yourtaskuser-resources"/>
<html>
<head>
<title>View <fmt:message key="yourtaskuser.title"/> <fmt:message key="order.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="order.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectYourtaskuser?useridKey=${yourtaskuser_userid}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="order.orderid.title"/>:
						</td>
						<td>
							${order.orderid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="order.orderdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${order.orderdate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="order.ordershippingcost.title"/>:
						</td>
						<td>
							${order.ordershippingcost}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="order.orderprice.title"/>:
						</td>
						<td>
							${order.orderprice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="order.orderstate.title"/>:
						</td>
						<td>
							${order.orderstate}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteYourtaskuserOrdersForUserid?yourtaskuser_userid=${yourtaskuser_userid}&related_ordersforuserid_orderid=${order.orderid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
