<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.product-resources"/>
<html>
<head>
<title>View <fmt:message key="product.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="product.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexProduct"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.productid.title"/>:
						</td>
						<td>
							${product.productid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.productname.title"/>:
						</td>
						<td>
							${product.productname}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.productdescription.title"/>:
						</td>
						<td>
							${product.productdescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.productimage.title"/>:
						</td>
						<td>
							${product.productimage}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.productprice.title"/>:
						</td>
						<td>
							${product.productprice}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.productavailablequantity.title"/>:
						</td>
						<td>
							${product.productavailablequantity}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="yourtaskuser.title"/></h1>
					
						<c:if test='${product.yourtaskuser != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userid.title"/>:
						</td>
						<td>
							${product.yourtaskuser.userid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userdateofbirth.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${product.yourtaskuser.userdateofbirth.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userphonenumber.title"/>:
						</td>
						<td>
							${product.yourtaskuser.userphonenumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.useremail.title"/>:
						</td>
						<td>
							${product.yourtaskuser.useremail}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userstreetnumber.title"/>:
						</td>
						<td>
							${product.yourtaskuser.userstreetnumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userzipcode.title"/>:
						</td>
						<td>
							${product.yourtaskuser.userzipcode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usercity.title"/>:
						</td>
						<td>
							${product.yourtaskuser.usercity}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userusername.title"/>:
						</td>
						<td>
							${product.yourtaskuser.userusername}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userpassword.title"/>:
						</td>
						<td>
							${product.yourtaskuser.userpassword}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usertoken.title"/>:
						</td>
						<td>
							${product.yourtaskuser.usertoken}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userlastconnectiondate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${product.yourtaskuser.userlastconnectiondate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usertype.title"/>:
						</td>
						<td>
							${product.yourtaskuser.usertype}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.useriban.title"/>:
						</td>
						<td>
							${product.yourtaskuser.useriban}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editProductYourtaskuser?product_productid=${product.productid}&yourtaskuser_userid=${product.yourtaskuser.userid}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteProductYourtaskuser?product_productid=${product.productid}&related_yourtaskuser_userid=${product.yourtaskuser.userid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${product.yourtaskuser == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductYourtaskuser?product_productid=${product.productid}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="yourtaskuser.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="orderproduct.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newProductOrderProducts?product_productid=${product.productid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="orderproduct.title"/></span></a></div>
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
					<c:forEach items="${product.orderProducts}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectProductOrderProducts?product_productid=${product.productid}&orderproducts_orderid=${current.orderid}&orderproducts_productid=${current.productid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editProductOrderProducts?product_productid=${product.productid}&orderproducts_orderid=${current.orderid}&orderproducts_productid=${current.productid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteProductOrderProducts?product_productid=${product.productid}&related_orderproducts_orderid=${current.orderid}&related_orderproducts_productid=${current.productid}&"><img src="images/icons/delete.gif" /></a>
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