<%@page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp" />
<fmt:setBundle basename="bundles.yourtaskuser-resources" />
<html>
<head>
<title>Profile <fmt:message key="yourtaskuser.title" /></title>
</head>
<body>
	<div id="contentarea">
		<div class=row>
			<div class="col-sm-6">
			<div class="card">
				<div class="card-header">Your principal informations</div>
				<div class="card-block">
					<form:form
						action="${pageContext.request.contextPath}/profile/saveYourtaskuser"
						method="POST" modelAttribute="yourtaskuser">
						<table cellpadding="0" cellspacing="0" id="viewTable">
							<tbody>
								<tr>
									<td class="label" valign="top"><fmt:message
											key="yourtaskuser.userid.title" />:</td>
									<td><c:choose>
											<c:when test='${newFlag}'>
												<form:input id="yourtaskuser_userid" path="userid"
													cssStyle="width:300px;" />
												<script type="text/javascript">
													Spring
															.addDecoration(new Spring.ElementDecoration(
																	{
																		elementId : "yourtaskuser_userid",
																		widgetType : "dijit.form.NumberTextBox",
																		widgetAttrs : {
																			promptMessage : "<fmt:message key="yourtaskuser.userid.help"/>",
																			constraints : {
																				places : 0
																			}
																		}
																	}));
												</script>
											</c:when>
											<c:otherwise>
							${yourtaskuser.userid}
						&nbsp;
									<form:hidden id="yourtaskuser_userid" path="userid" />
											</c:otherwise>
										</c:choose></td>
								</tr>
								<tr>
									<td class="label" valign="top"><fmt:message
											key="yourtaskuser.userdateofbirth.title" />:</td>
									<td><input id="yourtaskuser_userdateofbirth"
										name="userdateofbirth" type="text"
										value="<fmt:formatDate value="${yourtaskuser.userdateofbirth.time}" pattern="yyyy-MM-dd"/>"
										dojoType="dijit.form.DateTextBox"
										constraints="{datePattern:'<fmt:message key="date.format"/>'}"
										trim="true" promptMessage="<fmt:message key="date.format" />"
										invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />."
										style="width: 300px;" /></td>
								</tr>
								<tr>
									<td class="label" valign="top"><fmt:message
											key="yourtaskuser.userphonenumber.title" />:</td>
									<td><form:input id="yourtaskuser_userphonenumber"
											path="userphonenumber" cssStyle="width:300px;" /> <script
											type="text/javascript">
												Spring
														.addDecoration(new Spring.ElementDecoration(
																{
																	elementId : "yourtaskuser_userphonenumber",
																	widgetType : "dijit.form.ValidationTextBox",
																	widgetAttrs : {
																		promptMessage : "<fmt:message key="yourtaskuser.userphonenumber.help"/>"
																	}
																}));
											</script>
									</td>
								</tr>
								<tr>
									<td class="label" valign="top"><fmt:message
											key="yourtaskuser.useremail.title" />:</td>
									<td><form:input id="yourtaskuser_useremail"
											path="useremail" cssStyle="width:300px;" /> <script
											type="text/javascript">
												Spring
														.addDecoration(new Spring.ElementDecoration(
																{
																	elementId : "yourtaskuser_useremail",
																	widgetType : "dijit.form.ValidationTextBox",
																	widgetAttrs : {
																		promptMessage : "<fmt:message key="yourtaskuser.useremail.help"/>"
																	}
																}));
											</script>
									</td>
								</tr>
								<tr>
									<td class="label" valign="top"><fmt:message
											key="yourtaskuser.userstreetnumber.title" />:</td>
									<td><form:input id="yourtaskuser_userstreetnumber"
											path="userstreetnumber" cssStyle="width:300px;" /> <script
											type="text/javascript">
												Spring
														.addDecoration(new Spring.ElementDecoration(
																{
																	elementId : "yourtaskuser_userstreetnumber",
																	widgetType : "dijit.form.ValidationTextBox",
																	widgetAttrs : {
																		promptMessage : "<fmt:message key="yourtaskuser.userstreetnumber.help"/>"
																	}
																}));
											</script>
									</td>
								</tr>
								<tr>
									<td class="label" valign="top"><fmt:message
											key="yourtaskuser.userzipcode.title" />:</td>
									<td><form:input id="yourtaskuser_userzipcode"
											path="userzipcode" cssStyle="width:300px;" /> <script
											type="text/javascript">
												Spring
														.addDecoration(new Spring.ElementDecoration(
																{
																	elementId : "yourtaskuser_userzipcode",
																	widgetType : "dijit.form.ValidationTextBox",
																	widgetAttrs : {
																		promptMessage : "<fmt:message key="yourtaskuser.userzipcode.help"/>"
																	}
																}));
											</script>
									</td>
								</tr>
								<tr>
									<td class="label" valign="top"><fmt:message
											key="yourtaskuser.usercity.title" />:</td>
									<td><form:input id="yourtaskuser_usercity" path="usercity"
											cssStyle="width:300px;" /> <script type="text/javascript">
												Spring
														.addDecoration(new Spring.ElementDecoration(
																{
																	elementId : "yourtaskuser_usercity",
																	widgetType : "dijit.form.ValidationTextBox",
																	widgetAttrs : {
																		promptMessage : "<fmt:message key="yourtaskuser.usercity.help"/>"
																	}
																}));
											</script>
									</td>
								</tr>
								<tr>
									<td class="label" valign="top"><fmt:message
											key="yourtaskuser.userusername.title" />:</td>
									<td><form:input id="yourtaskuser_userusername"
											path="userusername" cssStyle="width:300px;" /> <script
											type="text/javascript">
												Spring
														.addDecoration(new Spring.ElementDecoration(
																{
																	elementId : "yourtaskuser_userusername",
																	widgetType : "dijit.form.ValidationTextBox",
																	widgetAttrs : {
																		promptMessage : "<fmt:message key="yourtaskuser.userusername.help"/>"
																	}
																}));
											</script>
									</td>
								</tr>
								<tr>
									<td class="label" valign="top"><fmt:message
											key="yourtaskuser.userpassword.title" />:</td>
									<td><form:input id="yourtaskuser_userpassword"
											path="userpassword" cssStyle="width:300px;" /> <script
											type="text/javascript">
												Spring
														.addDecoration(new Spring.ElementDecoration(
																{
																	elementId : "yourtaskuser_userpassword",
																	widgetType : "dijit.form.ValidationTextBox",
																	widgetAttrs : {
																		promptMessage : "<fmt:message key="yourtaskuser.userpassword.help"/>"
																	}
																}));
											</script>
									</td>
								</tr>
								<tr>
									<td class="label" valign="top"><fmt:message
											key="yourtaskuser.usertoken.title" />:</td>
									<td><form:input id="yourtaskuser_usertoken"
											path="usertoken" cssStyle="width:300px;" /> <script
											type="text/javascript">
												Spring
														.addDecoration(new Spring.ElementDecoration(
																{
																	elementId : "yourtaskuser_usertoken",
																	widgetType : "dijit.form.ValidationTextBox",
																	widgetAttrs : {
																		promptMessage : "<fmt:message key="yourtaskuser.usertoken.help"/>"
																	}
																}));
											</script>
									</td>
								</tr>
								<tr>
									<td class="label" valign="top"><fmt:message
											key="yourtaskuser.userlastconnectiondate.title" />:</td>
									<td><input id="yourtaskuser_userlastconnectiondate"
										name="userlastconnectiondate" type="text"
										value="<fmt:formatDate value="${yourtaskuser.userlastconnectiondate.time}" pattern="yyyy-MM-dd"/>"
										dojoType="dijit.form.DateTextBox"
										constraints="{datePattern:'<fmt:message key="date.format"/>'}"
										trim="true" promptMessage="<fmt:message key="date.format" />"
										invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />."
										style="width: 300px;" /></td>
								</tr>
								<tr>
									<td class="label" valign="top"><fmt:message
											key="yourtaskuser.usertype.title" />:</td>
									<td><form:input id="yourtaskuser_usertype" path="usertype"
											cssStyle="width:300px;" /> <script type="text/javascript">
												Spring
														.addDecoration(new Spring.ElementDecoration(
																{
																	elementId : "yourtaskuser_usertype",
																	widgetType : "dijit.form.ValidationTextBox",
																	widgetAttrs : {
																		promptMessage : "<fmt:message key="yourtaskuser.usertype.help"/>"
																	}
																}));
											</script>
									</td>
								</tr>
								<tr>
									<td class="label" valign="top"><fmt:message
											key="yourtaskuser.useriban.title" />:</td>
									<td><form:input id="yourtaskuser_useriban" path="useriban"
											cssStyle="width:300px;" /> <script type="text/javascript">
												Spring
														.addDecoration(new Spring.ElementDecoration(
																{
																	elementId : "yourtaskuser_useriban",
																	widgetType : "dijit.form.ValidationTextBox",
																	widgetAttrs : {
																		promptMessage : "<fmt:message key="yourtaskuser.useriban.help"/>"
																	}
																}));
											</script>
									</td>
								</tr>
							</tbody>
						</table>
						<span class="inputbutton"><input class="savebutton"
							id="save" type="submit"
							value="<fmt:message key="navigation.save"/>" /></span>
						<script type="text/javascript">
							Spring
									.addDecoration(new Spring.ValidateAllDecoration(
											{
												elementId : 'save',
												event : 'onclick'
											}));
						</script>
					</form:form>
				</div></div>
			</div>
			<div class="col-sm-6">
			<div class="card">
			<div class="card-header">
				Secondary informations
			</div>
			<div class="card-body">
<form:form action="${pageContext.request.contextPath}/profile/saveYourtaskuserScinfos" method="POST" modelAttribute="scinfo">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="scinfo.scinfoid.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="scinfo_scinfoid" path="scinfoid" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "scinfo_scinfoid",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="scinfo.scinfoid.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${scinfo.scinfoid}
						&nbsp;
									<form:hidden id="scinfo_scinfoid" path="scinfoid"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="scinfo.scinfosiret.title"/>:
						</td>
						<td>
							<form:input id="scinfo_scinfosiret" path="scinfosiret" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "scinfo_scinfosiret",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="scinfo.scinfosiret.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="scinfo.scinfoactivitydomain.title"/>:
						</td>
						<td>
							<form:input id="scinfo_scinfoactivitydomain" path="scinfoactivitydomain" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "scinfo_scinfoactivitydomain",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="scinfo.scinfoactivitydomain.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="scinfo.scinfowebsite.title"/>:
						</td>
						<td>
							<form:input id="scinfo_scinfowebsite" path="scinfowebsite" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "scinfo_scinfowebsite",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="scinfo.scinfowebsite.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="yourtaskuser_userid" value="${yourtaskuser_userid}" >			
		</form:form>
			</div></div>
			</div>
		</div>
	</div>
</body>
</html>