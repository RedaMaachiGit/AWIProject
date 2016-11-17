<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.yourtaskuser-resources"/>
<html>
<head>
<title>List <fmt:message key="yourtaskuser.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="yourtaskuser.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newYourtaskuser"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="yourtaskuser.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="yourtaskuser.userid.title"/></th>
					<th class="thead"><fmt:message key="yourtaskuser.userdateofbirth.title"/></th>
					<th class="thead"><fmt:message key="yourtaskuser.userphonenumber.title"/></th>
					<th class="thead"><fmt:message key="yourtaskuser.useremail.title"/></th>
					<th class="thead"><fmt:message key="yourtaskuser.userstreetnumber.title"/></th>
					<th class="thead"><fmt:message key="yourtaskuser.userzipcode.title"/></th>
					<th class="thead"><fmt:message key="yourtaskuser.usercity.title"/></th>
					<th class="thead"><fmt:message key="yourtaskuser.userusername.title"/></th>
					<th class="thead"><fmt:message key="yourtaskuser.userpassword.title"/></th>
					<th class="thead"><fmt:message key="yourtaskuser.usertoken.title"/></th>
					<th class="thead"><fmt:message key="yourtaskuser.userlastconnectiondate.title"/></th>
					<th class="thead"><fmt:message key="yourtaskuser.usertype.title"/></th>
					<th class="thead"><fmt:message key="yourtaskuser.useriban.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${yourtaskusers}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectYourtaskuser?useridKey=${current.userid}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editYourtaskuser?useridKey=${current.userid}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteYourtaskuser?useridKey=${current.userid}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.userid}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="date" value="${current.userdateofbirth.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.userphonenumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.useremail}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.userstreetnumber}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.userzipcode}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.usercity}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.userusername}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.userpassword}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.usertoken}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="date" value="${current.userlastconnectiondate.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.usertype}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.useriban}
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