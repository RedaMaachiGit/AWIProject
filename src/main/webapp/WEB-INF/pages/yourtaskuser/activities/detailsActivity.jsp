<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.yourtaskuser-resources"/>
<html>
<head>
<title>Activity details</title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1>Activity details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectYourtaskuser?useridKey=${yourtaskuser_userid}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							Name :
						</td>
						<td>
							${activity.activityname}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Description : 
						</td>
						<td>
							${activity.activitydescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Visibility : 
						</td>
						<td>
							${activity.activityvisibility}
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
