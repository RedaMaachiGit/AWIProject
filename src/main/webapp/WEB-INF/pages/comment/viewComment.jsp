<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.comment-resources"/>
<html>
<head>
<title>View <fmt:message key="comment.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="comment.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexComment"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="comment.commentid.title"/>:
						</td>
						<td>
							${comment.commentid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="comment.commentcontent.title"/>:
						</td>
						<td>
							${comment.commentcontent}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="comment.commentdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${comment.commentdate.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="activity.title"/></h1>
					
						<c:if test='${comment.activity != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="activity.activityid.title"/>:
						</td>
						<td>
							${comment.activity.activityid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="activity.activityname.title"/>:
						</td>
						<td>
							${comment.activity.activityname}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="activity.activitydescription.title"/>:
						</td>
						<td>
							${comment.activity.activitydescription}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="activity.activityvisibility.title"/>:
						</td>
						<td>
							${comment.activity.activityvisibility}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editCommentActivity?comment_commentid=${comment.commentid}&activity_activityid=${comment.activity.activityid}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteCommentActivity?comment_commentid=${comment.commentid}&related_activity_activityid=${comment.activity.activityid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${comment.activity == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCommentActivity?comment_commentid=${comment.commentid}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="activity.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="yourtaskuser.title"/></h1>
					
						<c:if test='${comment.yourtaskuser != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userid.title"/>:
						</td>
						<td>
							${comment.yourtaskuser.userid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userdateofbirth.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${comment.yourtaskuser.userdateofbirth.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userphonenumber.title"/>:
						</td>
						<td>
							${comment.yourtaskuser.userphonenumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.useremail.title"/>:
						</td>
						<td>
							${comment.yourtaskuser.useremail}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userstreetnumber.title"/>:
						</td>
						<td>
							${comment.yourtaskuser.userstreetnumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userzipcode.title"/>:
						</td>
						<td>
							${comment.yourtaskuser.userzipcode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usercity.title"/>:
						</td>
						<td>
							${comment.yourtaskuser.usercity}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userusername.title"/>:
						</td>
						<td>
							${comment.yourtaskuser.userusername}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userpassword.title"/>:
						</td>
						<td>
							${comment.yourtaskuser.userpassword}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usertoken.title"/>:
						</td>
						<td>
							${comment.yourtaskuser.usertoken}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.userlastconnectiondate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${comment.yourtaskuser.userlastconnectiondate.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.usertype.title"/>:
						</td>
						<td>
							${comment.yourtaskuser.usertype}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="yourtaskuser.useriban.title"/>:
						</td>
						<td>
							${comment.yourtaskuser.useriban}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editCommentYourtaskuser?comment_commentid=${comment.commentid}&yourtaskuser_userid=${comment.yourtaskuser.userid}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteCommentYourtaskuser?comment_commentid=${comment.commentid}&related_yourtaskuser_userid=${comment.yourtaskuser.userid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${comment.yourtaskuser == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCommentYourtaskuser?comment_commentid=${comment.commentid}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="yourtaskuser.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>