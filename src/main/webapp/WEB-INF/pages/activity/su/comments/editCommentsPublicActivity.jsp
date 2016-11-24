<%@page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp" />
<!-- <fmt:setBundle basename="bundles.activity-resources"/> -->
<html>
<head>
<title>New Comment</title>
</head>

<body>
	<div class="container">
		<div class="navitem">
			<a class="button"
				href="${pageContext.request.contextPath}/su/allactivities/activity/${activityid}">
				<span class="glyphicon glyphicon-arrow-left"></span> <span><fmt:message
						key="navigation.back" /></span>
			</a>
		</div>
		<h1>Add a comment</h1>
		<form:form
			action="${pageContext.request.contextPath}/su/savePublicActivityComments/${activityid}"
			method="POST" modelAttribute="comment">
			<table class="table table-list-search" id="viewTable">
				<tbody>
					<tr style="display: none;">
						<td valign="top">Identifier : <!-- <fmt:message key="comment.commentid.title"/>: -->
						</td>
						<td><c:choose>
								<c:when test='${newFlag}'>
									<form:input id="comment_commentid" path="commentid"
										cssStyle="width:300px;" />
									<script type="text/javascript">
										Spring
												.addDecoration(new Spring.ElementDecoration(
														{
															elementId : "comment_commentid",
															widgetType : "dijit.form.NumberTextBox",
															widgetAttrs : {
																promptMessage : "<fmt:message key="comment.commentid.help"/>",
																constraints : {
																	places : 0
																}
															}
														}));
									</script>
								</c:when>
								<c:otherwise>
														${comment.commentid}
														&nbsp;
														<form:hidden id="comment_commentid" path="commentid" />
								</c:otherwise>
							</c:choose></td>
					</tr>
					<tr>
						<td valign="top">Your comment :</td>
						<td><form:input id="comment_commentcontent"
								path="commentcontent" cssStyle="width:300px;" /> <script
								type="text/javascript">
									Spring
											.addDecoration(new Spring.ElementDecoration(
													{
														elementId : "comment_commentcontent",
														widgetType : "dijit.form.ValidationTextBox",
														widgetAttrs : {
															promptMessage : "Enter your comment"
														}
													}));
								</script></td>
					</tr>
					<tr style="display: none;">
						<td valign="top">Date : <!-- <fmt:message key="comment.commentdate.title"/>: -->
						</td>
						<td><input id="comment_commentdate" name="commentdate"
							type="text"
							value="<fmt:formatDate value="${comment.commentdate.time}" pattern="yyyy-MM-dd"/>"
							dojoType="dijit.form.DateTextBox"
							constraints="{datePattern:'<fmt:message key="date.format"/>'}"
							trim="true" promptMessage="<fmt:message key="date.format" />"
							invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />."
							style="width: 300px;" /></td>
					</tr>
				</tbody>
			</table>
			<div class="col-sm-offset-3 col-sm-4 col-sm-offset-3">
				<span class="inputbutton"> <input class="btn btn-primary"
					id="save" type="submit"
					value="<fmt:message key="navigation.save"/>" />
				</span>
			</div>
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
</body>
</html>