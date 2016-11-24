<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
	<head>
		<title>New product</title>
	</head>		

	<body>
		<div class="container">
						<!-- Bouton back -->
						<div class="navitem">
							<a class="button" href="${pageContext.request.contextPath}/sc/products">
								<span class="glyphicon glyphicon-arrow-left"></span>
								<span><fmt:message key="navigation.back"/></span>
							</a>
						</div>				
							<form:form action="${pageContext.request.contextPath}/sc/saveYourtaskuserProducts" method="POST" modelAttribute="product">
												<div class="form-group">
													<div class="col-lg-2 control-label">
														Name :
													</div>
													<div class='input'>
														<form:input id="product_productname" path="productname" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_productname",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "Enter your product name"}})); </script>
													</div>
												</div>
												<div class="form-group">
													<div class="col-lg-2 control-label">
														Description :
													</div>
													<div class='input'>
														<form:input id="product_productdescription" path="productdescription" cssStyle="width:300px;"/>
														<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_productdescription",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "Enter the product description"}})); </script>
													</div>
												</div>
												<div class="form-group">
													<div class="col-lg-2 control-label">
														Image link :
													</div>
													<div class='input'>
														<form:input id="product_productimage" path="productimage" cssStyle="width:300px;"/>
														<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_productimage",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "Enter the link of the product image"}})); </script>
													</div>
												</div>
												<div class="form-group">
													<div class="col-lg-2 control-label">
														Price :
													</div>
													<div class='input'>
														<form:input id="product_productprice" path="productprice" cssStyle="width:300px;"/>
														<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_productprice",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "Enter the price of the product"}})); </script>
													</div>
												</div>
												<div class="form-group">
													<div class="col-lg-2 control-label">
														Available quantity :
													</div>
													<div class='input'>
														<form:input id="product_productavailablequantity" path="productavailablequantity" cssStyle="width:300px;"/>
														<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_productavailablequantity",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "Enter the available quantity", constraints : {places:0}}})); </script>
													</div>
												</div>
											</div>
									<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
										<span>
											<input class="btn btn-primary" id="save" type="submit" value="SAVE PRODUCT"/>
										</span>
									</div>
									<!-- <script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script> -->
									<!-- <input type="hidden" name="yourtaskuser_userid" value="${yourtaskuser_userid}" > -->
								</form:form>
								<div class="clear">&nbsp;</div>
							</div>
	</body>
</html>
