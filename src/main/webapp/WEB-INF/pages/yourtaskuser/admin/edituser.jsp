<%@page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp" />
<fmt:setBundle basename="bundles.yourtaskuser-resources" />
<html>
<head>
<title>Edit a user <fmt:message key="yourtaskuser.title" /></title>
</head>
<body>
	<div id="contentarea" class="container">
		<div class=row>
			<div class="col-sm-6">
				<div class="panel panel-success">
					<div class="panel-heading">User's principal informations</div>
					<div class="panel-body">
						<form:form action="${pageContext.request.contextPath}/admin/user/edit" method="POST" modelAttribute="yourtaskuser">
									<div class="hidden">
										<div class="control-label"><fmt:message
												key="yourtaskuser.userid.title" />:</div>
										<div class='input'><c:choose>
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
											</c:choose></div>
									</div>
									<div class="form-group">
										<div class="control-label">date of birth</div>
										<div class='input'><input id="yourtaskuser_userdateofbirth"
											name="userdateofbirth" type="text"
											value="<fmt:formatDate value="${yourtaskuser.userdateofbirth.time}" pattern="yyyy-MM-dd"/>"
											dojoType="dijit.form.DateTextBox"
											constraints="{datePattern:'<fmt:message key="date.format"/>'}"
											trim="true" promptMessage="<fmt:message key="date.format" />"
											invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />."
											style="width: 300px;" /></div>
									</div>
									<div class="form-group">
										<div class="control-label">phone number:</div>
										<div class='input'><form:input id="yourtaskuser_userphonenumber"
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
												</script></div>
									</div>
									<div class="form-group">
										<div class="control-label">email:</div>
										<div class='input'><form:input id="yourtaskuser_useremail"
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
												</script></div>
									</div>
									<div class="form-group">
										<div class="control-label">Street member:</div>
										<div class='input'><form:input id="yourtaskuser_userstreetnumber"
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
												</script></div>
									</div>
									<div class="form-group">
										<div class="control-label">Zip code:</div>
										<div class='input'><form:input id="yourtaskuser_userzipcode"
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
												</script></div>
									</div>
									<div class="form-group">
										<div class="control-label">City:</div>
										<div class='input'><form:input id="yourtaskuser_usercity"
												path="usercity" cssStyle="width:300px;" /> <script
												type="text/javascript">
													Spring
															.addDecoration(new Spring.ElementDecoration(
																	{
																		elementId : "yourtaskuser_usercity",
																		widgetType : "dijit.form.ValidationTextBox",
																		widgetAttrs : {
																			promptMessage : "<fmt:message key="yourtaskuser.usercity.help"/>"
																		}
																	}));
												</script></div>
									</div>
									<div class="form-group">
										<div class="control-label">username:</div>
										<div class='input'><form:input id="yourtaskuser_userusername"
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
												</script></div>
									</div>
									<div class="form-group">
										<div class="control-label">password:</div>
										<div class='input'><form:input type="password" id="yourtaskuser_userpassword"
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
												</script></div>
									</div>
									<div class="hidden">
										<div class="control-label"><fmt:message
												key="yourtaskuser.usertoken.title" />:</div>
										<div class='input'><form:input id="yourtaskuser_usertoken"
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
												</script></div>
									</div>
									<div class="hidden">
										<div class="control-label"><fmt:message
												key="yourtaskuser.userlastconnectiondate.title" />:</div>
										<div class='input'><input id="yourtaskuser_userlastconnectiondate"
											name="userlastconnectiondate" type="text"
											value="<fmt:formatDate value="${yourtaskuser.userlastconnectiondate.time}" pattern="yyyy-MM-dd"/>"
											dojoType="dijit.form.DateTextBox"
											constraints="{datePattern:'<fmt:message key="date.format"/>'}"
											trim="true" promptMessage="<fmt:message key="date.format" />"
											invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />."
											style="width: 300px;" /></div>
									</div>
									<div class="hidden">
										<div class="control-label"><fmt:message
												key="yourtaskuser.usertype.title" />:</div>
										<div class='input'><form:input id="yourtaskuser_usertype"
												path="usertype" cssStyle="width:300px;" /> <script
												type="text/javascript">
													Spring
															.addDecoration(new Spring.ElementDecoration(
																	{
																		elementId : "yourtaskuser_usertype",
																		widgetType : "dijit.form.ValidationTextBox",
																		widgetAttrs : {
																			promptMessage : "<fmt:message key="yourtaskuser.usertype.help"/>"
																		}
																	}));
												</script></div>
									</div>
									<div class="form-group">
										<div class="control-label">Iban:</div>
										<div class='input'><form:input id="yourtaskuser_useriban"
												path="useriban" cssStyle="width:300px;" /> <script
												type="text/javascript">
													Spring
															.addDecoration(new Spring.ElementDecoration(
																	{
																		elementId : "yourtaskuser_useriban",
																		widgetType : "dijit.form.ValidationTextBox",
																		widgetAttrs : {
																			promptMessage : "<fmt:message key="yourtaskuser.useriban.help"/>"
																		}
																	}));
												</script></div>
									</div>
							<input class="btn btn-success"
								id="save" type="submit"
								value="<fmt:message key="navigation.save"/>" />
							<script type="text/javascript">
								Spring
										.addDecoration(new Spring.ValidateAllDecoration(
												{
													elementId : 'save',
													event : 'onclick'
												}));
							</script>
						</form:form>
					</div>
				</div>
			</div>
			
			<div class="col-sm-6">
				<div class="panel panel-success">
					<div class="panel-heading">Secondary informations</div>
					<div class="panel-body">
						<form:form
							action="${pageContext.request.contextPath}/admin/user/editsuinfo"
							method="POST" modelAttribute="suinfo">
									<div class="hidden">
										<div class="control-label"><fmt:message
												key="suinfo.suinfoid.title" />:</div>
										<div class='input'><c:choose>
												<c:when test='${newFlag}'>
													<form:input id="suinfo_suinfoid" path="suinfoid"
														cssStyle="width:300px;" />
													<script type="text/javascript">
														Spring
																.addDecoration(new Spring.ElementDecoration(
																		{
																			elementId : "suinfo_suinfoid",
																			widgetType : "dijit.form.NumberTextBox",
																			widgetAttrs : {
																				promptMessage : "<fmt:message key="suinfo.suinfoid.help"/>",
																				constraints : {
																					places : 0
																				}
																			}
																		}));
													</script>
												</c:when>
												<c:otherwise>
							${suinfo.suinfoid}
						&nbsp;
									<form:hidden id="suinfo_suinfoid" path="suinfoid" />
												</c:otherwise>
											</c:choose></div>
									</div>
									<div class="form-group">
										<div class="control-label">First name:</div>
										<div class='input'><form:input id="suinfo_suinfofirstname"
												path="suinfofirstname" cssStyle="width:300px;" /> <script
												type="text/javascript">
													Spring
															.addDecoration(new Spring.ElementDecoration(
																	{
																		elementId : "suinfo_suinfofirstname",
																		widgetType : "dijit.form.ValidationTextBox",
																		widgetAttrs : {
																			promptMessage : "<fmt:message key="suinfo.suinfofirstname.help"/>"
																		}
																	}));
												</script></div>
									</div>
									<div class="form-group">
										<div class="control-label">Last name:</div>
										<div class='input'><form:input id="suinfo_suinfolastname"
												path="suinfolastname" cssStyle="width:300px;" /> <script
												type="text/javascript">
													Spring
															.addDecoration(new Spring.ElementDecoration(
																	{
																		elementId : "suinfo_suinfolastname",
																		widgetType : "dijit.form.ValidationTextBox",
																		widgetAttrs : {
																			promptMessage : "<fmt:message key="suinfo.suinfolastname.help"/>"
																		}
																	}));
												</script></div>
									</div>
							<input class="btn btn-success"
								id="save" type="submit"
								value="<fmt:message key="navigation.save"/>" />
							<script type="text/javascript">
								Spring
										.addDecoration(new Spring.ValidateAllDecoration(
												{
													elementId : 'save',
													event : 'onclick'
												}));
							</script>
							<input type="hidden" name="yourtaskuser_userid"
								value="${yourtaskuser_userid}">
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>