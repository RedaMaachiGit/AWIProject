<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.product-resources"/>
<html>
<head>
<title>View <fmt:message key="product.title"/> <fmt:message key="yourtaskuser.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="yourtaskuser.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectProduct?productidKey=${product_productid}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.userid.title"/>:
						</td>
						<td>
							${yourtaskuser.userid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.userdateofbirth.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${yourtaskuser.userdateofbirth.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.userphonenumber.title"/>:
						</td>
						<td>
							${yourtaskuser.userphonenumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.useremail.title"/>:
						</td>
						<td>
							${yourtaskuser.useremail}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.userstreetnumber.title"/>:
						</td>
						<td>
							${yourtaskuser.userstreetnumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.userzipcode.title"/>:
						</td>
						<td>
							${yourtaskuser.userzipcode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.usercity.title"/>:
						</td>
						<td>
							${yourtaskuser.usercity}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.userusername.title"/>:
						</td>
						<td>
							${yourtaskuser.userusername}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.userpassword.title"/>:
						</td>
						<td>
							${yourtaskuser.userpassword}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.usertoken.title"/>:
						</td>
						<td>
							${yourtaskuser.usertoken}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.userlastconnectiondate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${yourtaskuser.userlastconnectiondate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.usertype.title"/>:
						</td>
						<td>
							${yourtaskuser.usertype}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="yourtaskuser.useriban.title"/>:
						</td>
						<td>
							${yourtaskuser.useriban}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
