<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.yourtaskuser-resources"/>
<html>
<head>
<title>YourTask <fmt:message key="yourtaskuser.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="yourtaskuser.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexYourtaskuser"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
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
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="role.title"/></h1>
					
						<c:if test='${yourtaskuser.role != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="role.roleid.title"/>:
						</td>
						<td>
							${yourtaskuser.role.roleid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="role.rolename.title"/>:
						</td>
						<td>
							${yourtaskuser.role.rolename}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editYourtaskuserRole?yourtaskuser_userid=${yourtaskuser.userid}&role_roleid=${yourtaskuser.role.roleid}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteYourtaskuserRole?yourtaskuser_userid=${yourtaskuser.userid}&related_role_roleid=${yourtaskuser.role.roleid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${yourtaskuser.role == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newYourtaskuserRole?yourtaskuser_userid=${yourtaskuser.userid}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="role.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="suinfo.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newYourtaskuserSuinfos?yourtaskuser_userid=${yourtaskuser.userid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="suinfo.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="suinfo.suinfoid.title"/></th>
						<th class="thead"><fmt:message key="suinfo.suinfofirstname.title"/></th>
						<th class="thead"><fmt:message key="suinfo.suinfolastname.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${yourtaskuser.suinfos}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectYourtaskuserSuinfos?yourtaskuser_userid=${yourtaskuser.userid}&suinfos_suinfoid=${current.suinfoid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editYourtaskuserSuinfos?yourtaskuser_userid=${yourtaskuser.userid}&suinfos_suinfoid=${current.suinfoid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteYourtaskuserSuinfos?yourtaskuser_userid=${yourtaskuser.userid}&related_suinfos_suinfoid=${current.suinfoid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.suinfoid}
						&nbsp;
						</td>
						<td>
							${current.suinfofirstname}
						&nbsp;
						</td>
						<td>
							${current.suinfolastname}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="notification.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newYourtaskuserNotifications?yourtaskuser_userid=${yourtaskuser.userid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="notification.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="notification.notificationid.title"/></th>
						<th class="thead"><fmt:message key="notification.notificationseen.title"/></th>
						<th class="thead"><fmt:message key="notification.notificationcontent.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${yourtaskuser.notifications}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectYourtaskuserNotifications?yourtaskuser_userid=${yourtaskuser.userid}&notifications_notificationid=${current.notificationid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editYourtaskuserNotifications?yourtaskuser_userid=${yourtaskuser.userid}&notifications_notificationid=${current.notificationid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteYourtaskuserNotifications?yourtaskuser_userid=${yourtaskuser.userid}&related_notifications_notificationid=${current.notificationid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.notificationid}
						&nbsp;
						</td>
						<td>
							${current.notificationseen}
						&nbsp;
						</td>
						<td>
							${current.notificationcontent}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="scinfo.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newYourtaskuserScinfos?yourtaskuser_userid=${yourtaskuser.userid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="scinfo.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="scinfo.scinfoid.title"/></th>
						<th class="thead"><fmt:message key="scinfo.scinfosiret.title"/></th>
						<th class="thead"><fmt:message key="scinfo.scinfoactivitydomain.title"/></th>
						<th class="thead"><fmt:message key="scinfo.scinfowebsite.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${yourtaskuser.scinfos}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectYourtaskuserScinfos?yourtaskuser_userid=${yourtaskuser.userid}&scinfos_scinfoid=${current.scinfoid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editYourtaskuserScinfos?yourtaskuser_userid=${yourtaskuser.userid}&scinfos_scinfoid=${current.scinfoid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteYourtaskuserScinfos?yourtaskuser_userid=${yourtaskuser.userid}&related_scinfos_scinfoid=${current.scinfoid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.scinfoid}
						&nbsp;
						</td>
						<td>
							${current.scinfosiret}
						&nbsp;
						</td>
						<td>
							${current.scinfoactivitydomain}
						&nbsp;
						</td>
						<td>
							${current.scinfowebsite}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="order.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newYourtaskuserOrdersForUseridsc?yourtaskuser_userid=${yourtaskuser.userid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="order.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="order.orderid.title"/></th>
						<th class="thead"><fmt:message key="order.orderdate.title"/></th>
						<th class="thead"><fmt:message key="order.ordershippingcost.title"/></th>
						<th class="thead"><fmt:message key="order.orderprice.title"/></th>
						<th class="thead"><fmt:message key="order.orderstate.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${yourtaskuser.ordersForUseridsc}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectYourtaskuserOrdersForUseridsc?yourtaskuser_userid=${yourtaskuser.userid}&ordersforuseridsc_orderid=${current.orderid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editYourtaskuserOrdersForUseridsc?yourtaskuser_userid=${yourtaskuser.userid}&ordersforuseridsc_orderid=${current.orderid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteYourtaskuserOrdersForUseridsc?yourtaskuser_userid=${yourtaskuser.userid}&related_ordersforuseridsc_orderid=${current.orderid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.orderid}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${current.orderdate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.ordershippingcost}
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
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="activity.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newYourtaskuserActivities?yourtaskuser_userid=${yourtaskuser.userid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="activity.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="activity.activityid.title"/></th>
						<th class="thead"><fmt:message key="activity.activityname.title"/></th>
						<th class="thead"><fmt:message key="activity.activitydescription.title"/></th>
						<th class="thead"><fmt:message key="activity.activityvisibility.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${yourtaskuser.activities}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectYourtaskuserActivities?yourtaskuser_userid=${yourtaskuser.userid}&activities_activityid=${current.activityid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editYourtaskuserActivities?yourtaskuser_userid=${yourtaskuser.userid}&activities_activityid=${current.activityid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteYourtaskuserActivities?yourtaskuser_userid=${yourtaskuser.userid}&related_activities_activityid=${current.activityid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.activityid}
						&nbsp;
						</td>
						<td>
							${current.activityname}
						&nbsp;
						</td>
						<td>
							${current.activitydescription}
						&nbsp;
						</td>
						<td>
							${current.activityvisibility}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="diary.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newYourtaskuserDiaries?yourtaskuser_userid=${yourtaskuser.userid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="diary.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="diary.iddiary.title"/></th>
						<th class="thead"><fmt:message key="diary.diaryname.title"/></th>
						<th class="thead"><fmt:message key="diary.diarydate.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${yourtaskuser.diaries}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectYourtaskuserDiaries?yourtaskuser_userid=${yourtaskuser.userid}&diaries_iddiary=${current.iddiary}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editYourtaskuserDiaries?yourtaskuser_userid=${yourtaskuser.userid}&diaries_iddiary=${current.iddiary}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteYourtaskuserDiaries?yourtaskuser_userid=${yourtaskuser.userid}&related_diaries_iddiary=${current.iddiary}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.iddiary}
						&nbsp;
						</td>
						<td>
							${current.diaryname}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${current.diarydate.time}"/>
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="product.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newYourtaskuserProducts?yourtaskuser_userid=${yourtaskuser.userid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="product.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="product.productid.title"/></th>
						<th class="thead"><fmt:message key="product.productname.title"/></th>
						<th class="thead"><fmt:message key="product.productdescription.title"/></th>
						<th class="thead"><fmt:message key="product.productimage.title"/></th>
						<th class="thead"><fmt:message key="product.productprice.title"/></th>
						<th class="thead"><fmt:message key="product.productavailablequantity.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${yourtaskuser.products}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectYourtaskuserProducts?yourtaskuser_userid=${yourtaskuser.userid}&products_productid=${current.productid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editYourtaskuserProducts?yourtaskuser_userid=${yourtaskuser.userid}&products_productid=${current.productid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteYourtaskuserProducts?yourtaskuser_userid=${yourtaskuser.userid}&related_products_productid=${current.productid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.productid}
						&nbsp;
						</td>
						<td>
							${current.productname}
						&nbsp;
						</td>
						<td>
							${current.productdescription}
						&nbsp;
						</td>
						<td>
							${current.productimage}
						&nbsp;
						</td>
						<td>
							${current.productprice}
						&nbsp;
						</td>
						<td>
							${current.productavailablequantity}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="comment.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newYourtaskuserComments?yourtaskuser_userid=${yourtaskuser.userid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="comment.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="comment.commentid.title"/></th>
						<th class="thead"><fmt:message key="comment.commentcontent.title"/></th>
						<th class="thead"><fmt:message key="comment.commentdate.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${yourtaskuser.comments}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectYourtaskuserComments?yourtaskuser_userid=${yourtaskuser.userid}&comments_commentid=${current.commentid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editYourtaskuserComments?yourtaskuser_userid=${yourtaskuser.userid}&comments_commentid=${current.commentid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteYourtaskuserComments?yourtaskuser_userid=${yourtaskuser.userid}&related_comments_commentid=${current.commentid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.commentid}
						&nbsp;
						</td>
						<td>
							${current.commentcontent}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${current.commentdate.time}"/>
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="order.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newYourtaskuserOrdersForUserid?yourtaskuser_userid=${yourtaskuser.userid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="order.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="order.orderid.title"/></th>
						<th class="thead"><fmt:message key="order.orderdate.title"/></th>
						<th class="thead"><fmt:message key="order.ordershippingcost.title"/></th>
						<th class="thead"><fmt:message key="order.orderprice.title"/></th>
						<th class="thead"><fmt:message key="order.orderstate.title"/></th>
					</tr>
				</thead>
				<tbody>
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
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectYourtaskuserOrdersForUserid?yourtaskuser_userid=${yourtaskuser.userid}&ordersforuserid_orderid=${current.orderid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editYourtaskuserOrdersForUserid?yourtaskuser_userid=${yourtaskuser.userid}&ordersforuserid_orderid=${current.orderid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteYourtaskuserOrdersForUserid?yourtaskuser_userid=${yourtaskuser.userid}&related_ordersforuserid_orderid=${current.orderid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.orderid}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${current.orderdate.time}"/>
						&nbsp;
						</td>
						<td>
							${current.ordershippingcost}
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
			
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>