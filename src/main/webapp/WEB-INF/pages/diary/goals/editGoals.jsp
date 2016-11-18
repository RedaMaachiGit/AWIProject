<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.diary-resources"/>
<html>
<head>
<title>Add/Edit Goal</title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Add/Edit Goal</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectDiary?iddiaryKey=${diary_iddiary}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveDiaryGoals" method="POST" modelAttribute="goal">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr style="display:none;">
						<td class="label" valign="top">
							<fmt:message key="goal.goalid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="goal_goalid" path="goalid" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "goal_goalid",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="goal.goalid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${goal.goalid}
						&nbsp;
									<form:hidden id="goal_goalid" path="goalid"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Name : 
						</td>
						<td>
							<form:input id="goal_goalname" path="goalname" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "goal_goalname",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "Enter/Edit your goal name"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							Description : 
						</td>
						<td>
							<form:input id="goal_goaldescription" path="goaldescription" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "goal_goaldescription",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "Enter/Edit your goal description"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="diary_iddiary" value="${diary_iddiary}" >
				
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
