<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="/head.jsp"/> 
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" action="/create" commandName="registerBean">
		<table>
			<tr>
				<td><form:label path="userName">UserName</form:label></td>
				<td><form:input path="userName" /></td>
				<td><form:errors path="userName" cssClass="error"></form:errors></td>
			</tr>

			<tr>
				<td><form:label path="firstName">FirstName</form:label></td>
				<td><form:input path="firstName" /></td>
				<td><form:errors path="firstName" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="lastName">LastName</form:label></td>
				<td><form:input path="lastName" /></td>
				<td><form:errors path="lastName" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:input path="password" /></td>
				<td><form:errors path="password" cssClass="error"></form:errors></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
	<!-- <a href="anurag">click</a>
	<tr>
		<a href="countryPage">Country</a>
	</tr>
	<tr>
		<a href="searchFlightsHome">SearchFlights</a>
	</tr>
	<a href="contact">contact</a>
	</tr>
 -->
	<h3>Employees</h3>
	<c:if test="${!empty userList}">
		<table class="data">
			<tr>
				<th>UserName</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${userList}" var="registerBean">
				<tr><td>${registerBean.userName}</td>
					<td> ${registerBean.firstName}</td>
					<td>${registerBean.lastName}</td>
					
					
					<td><a href="delete/${registerBean.id}">delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>