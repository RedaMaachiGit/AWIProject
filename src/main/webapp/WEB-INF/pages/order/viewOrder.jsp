<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.order-resources"/>
<html>
<head>
<title>View <fmt:message key="order.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="order.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexOrder"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
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
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="yourtaskuser.title"/></h1>
					
						<c:if test='${order.yourtaskuserByUseridsc != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userid.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUseridsc.userid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userdateofbirth.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${order.yourtaskuserByUseridsc.userdateofbirth.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userphonenumber.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUseridsc.userphonenumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.useremail.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUseridsc.useremail}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userstreetnumber.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUseridsc.userstreetnumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userzipcode.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUseridsc.userzipcode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usercity.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUseridsc.usercity}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userusername.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUseridsc.userusername}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userpassword.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUseridsc.userpassword}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usertoken.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUseridsc.usertoken}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userlastconnectiondate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${order.yourtaskuserByUseridsc.userlastconnectiondate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usertype.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUseridsc.usertype}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.useriban.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUseridsc.useriban}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editOrderYourtaskuserByUseridsc?order_orderid=${order.orderid}&yourtaskuserbyuseridsc_userid=${order.yourtaskuserByUseridsc.userid}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteOrderYourtaskuserByUseridsc?order_orderid=${order.orderid}&related_yourtaskuserbyuseridsc_userid=${order.yourtaskuserByUseridsc.userid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${order.yourtaskuserByUseridsc == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newOrderYourtaskuserByUseridsc?order_orderid=${order.orderid}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="yourtaskuser.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="yourtaskuser.title"/></h1>
					
						<c:if test='${order.yourtaskuserByUserid != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userid.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUserid.userid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userdateofbirth.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${order.yourtaskuserByUserid.userdateofbirth.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userphonenumber.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUserid.userphonenumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.useremail.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUserid.useremail}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userstreetnumber.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUserid.userstreetnumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userzipcode.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUserid.userzipcode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usercity.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUserid.usercity}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userusername.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUserid.userusername}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userpassword.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUserid.userpassword}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usertoken.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUserid.usertoken}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userlastconnectiondate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${order.yourtaskuserByUserid.userlastconnectiondate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usertype.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUserid.usertype}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.useriban.title"/>:
						</td>
						<td>
							${order.yourtaskuserByUserid.useriban}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editOrderYourtaskuserByUserid?order_orderid=${order.orderid}&yourtaskuserbyuserid_userid=${order.yourtaskuserByUserid.userid}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteOrderYourtaskuserByUserid?order_orderid=${order.orderid}&related_yourtaskuserbyuserid_userid=${order.yourtaskuserByUserid.userid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${order.yourtaskuserByUserid == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newOrderYourtaskuserByUserid?order_orderid=${order.orderid}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="yourtaskuser.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="orderproduct.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newOrderOrderProducts?order_orderid=${order.orderid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="orderproduct.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="orderproduct.orderid.title"/></th>
						<th class="thead"><fmt:message key="orderproduct.productid.title"/></th>
						<th class="thead"><fmt:message key="orderproduct.quantity.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${order.orderProducts}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectOrderOrderProducts?order_orderid=${order.orderid}&orderproducts_orderid=${current.orderid}&orderproducts_productid=${current.productid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editOrderOrderProducts?order_orderid=${order.orderid}&orderproducts_orderid=${current.orderid}&orderproducts_productid=${current.productid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteOrderOrderProducts?order_orderid=${order.orderid}&related_orderproducts_orderid=${current.orderid}&related_orderproducts_productid=${current.productid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.orderid}
						&nbsp;
						</td>
						<td>
							${current.productid}
						&nbsp;
						</td>
						<td>
							${current.quantity}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>