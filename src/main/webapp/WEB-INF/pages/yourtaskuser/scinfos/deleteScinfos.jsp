<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.yourtaskuser-resources"/>
<html>
<head>
<title>View <fmt:message key="yourtaskuser.title"/> <fmt:message key="scinfo.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="scinfo.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectYourtaskuser?useridKey=${yourtaskuser_userid}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="scinfo.scinfoid.title"/>:
						</td>
						<td>
							${scinfo.scinfoid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="scinfo.scinfosiret.title"/>:
						</td>
						<td>
							${scinfo.scinfosiret}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="scinfo.scinfoactivitydomain.title"/>:
						</td>
						<td>
							${scinfo.scinfoactivitydomain}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="scinfo.scinfowebsite.title"/>:
						</td>
						<td>
							${scinfo.scinfowebsite}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteYourtaskuserScinfos?yourtaskuser_userid=${yourtaskuser_userid}&related_scinfos_scinfoid=${scinfo.scinfoid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
