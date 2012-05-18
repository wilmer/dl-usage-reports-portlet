<%
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>

<%@ include file="/html/init.jsp" %>

<%
String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<portlet:renderURL var="Url">
	<portlet:param name="userGroupId" value="14701" />
	<portlet:param name="redirect" value="<%= redirect %>" />
	<portlet:param name="jspPage" value="/html/portlet/view_report.jsp" />
</portlet:renderURL>

<a href="<%=Url%>">ESU 10</a>

<portlet:renderURL var="testUrl">
	<portlet:param name="userGroupId" value="21801" />
	<portlet:param name="redirect" value="<%= redirect %>" />
	<portlet:param name="jspPage" value="/html/portlet/view_report.jsp" />
</portlet:renderURL>

<a href="<%=testUrl%>">Test</a>