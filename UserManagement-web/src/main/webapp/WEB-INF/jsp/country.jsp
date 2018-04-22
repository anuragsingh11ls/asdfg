<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	countryyyyyyyyyyyyyyyyyyyy
	<form:form method="POST" action="/#" commandName="countryBean">

		<table>
			<tr>
				<td>Country :</td>
				<td><select name="">
						<option value="" label="--- Select ---"</option>
						<c:forEach items="${countryList}" var="countryBean">
							<option>
								<c:out value="${countryBean.countryName}" />
							</option>
						</c:forEach>


				</select></td>
				<td><form:errors path="countryName" cssClass="error" /></td>
			</tr>

		</table>
		<%-- <table>
			<tr>
				<td>Country :</td>
				<td><form:select path="countryName">
						<form:option value="NONE" label="--- Select ---" />
						<form:options items="${countryList}" var="countryBean" />
					</form:select></td>
				<td><form:errors path="countryName" cssClass="error" /></td>
			</tr>

		</table> --%>

	</form:form>
	<table>
		<display:table name="countryList" requestURI="">
			<%--  <display:column property="id" title="ID" sortable="true" style="width:80px" /> --%>
			<display:column property="countryName" title="Title" sortable="true"
				style="width:300px " />
			<display:column property="countryName" title="Category"
				sortable="true" sortProperty="countryName" style="width:200px" />
			<%--    <display:column property="author" title="Author" sortable="true" sortProperty="author.surname" style="width:200px" />
    <display:column property="isbn" title="ISBN" sortable="true" style="width:180px"/ --%>>
</display:table>
	</table>
	
	<table>
	
	
	</table>

	<h3>Country</h3>
	<c:if test="${!empty countryList}">
		<table class="data">
			<tr>
				<th>CountryName</th>

				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${countryList}" var="countryBean">
				<tr>
					<td>${countryBean.countryName}</td>




				</tr>
			</c:forEach>
		</table>
	</c:if>

	<%-- <form:select path="country">
   <form:option value="NONE" label="--- Select ---"/>
   <form:options items="${countryList}" />
</form:select> --%>
</body>
</html>