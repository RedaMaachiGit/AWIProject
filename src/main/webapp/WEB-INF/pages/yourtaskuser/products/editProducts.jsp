<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.yourtaskuser-resources"/>
<html>
<head>
<title>Add/Edit Product</title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Add/Edit Product</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/sc/${yourtaskuser_userid}/products"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
		<form:form action="${pageContext.request.contextPath}/saveYourtaskuserProducts/${yourtaskuser_userid}" method="POST" modelAttribute="product">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr style="display:none;">
						<td class="label" valign="top">
							<fmt:message key="product.productid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="product_productid" path="productid" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_productid",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="product.productid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${product.productid}
						&nbsp;
									<form:hidden id="product_productid" path="productid"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Name : 
						</td>
						<td>
							<form:input id="product_productname" path="productname" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_productname",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "Enter your product name"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Description : 
						</td>
						<td>
							<form:input id="product_productdescription" path="productdescription" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_productdescription",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "Enter the product description"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Image link : 
						</td>
						<td>
							<form:input id="product_productimage" path="productimage" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_productimage",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "Enter the link of the product image"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Price : 
						</td>
						<td>
							<form:input id="product_productprice" path="productprice" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_productprice",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "Enter the price of the product"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Available Quantity : 
						</td>
						<td>
							<form:input id="product_productavailablequantity" path="productavailablequantity" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_productavailablequantity",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "Enter the available quantity", constraints : {places:0}}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="yourtaskuser_userid" value="${yourtaskuser_userid}" >
				
				
				
				
				
				
				
				
				
				
				
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
