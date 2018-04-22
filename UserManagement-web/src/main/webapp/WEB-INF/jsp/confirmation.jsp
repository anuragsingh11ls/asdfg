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
	Your flight has been successfully booked.
	<br /> Confirmation Number:
	<c:out value="${ticket.id}" />
	<br /> Ticket Issue date:
	<c:out value="${ticket.issueDate}" />
	<br /> Flight:
	<c:out value="${ticket.flight.number}" />
	<br /> Number of Seats:
	<c:out value="${ticket.numberOfSeats}" />
	<br/>
<table class="table">
	<tr>
		<td>From:</td>
		<td><c:out value="${ticket.flight.from.city}" /> ( <c:out
				value="${ticket.flight.from.code}" /> )</td>
		<td>Departure:</td>
		<td><%-- <joda:format value="${ticket.flight.departureTime}" style="MM" /> --%></td>
	</tr>

	<tr>
		<td>To:</td>
		<td><c:out value="${ticket.flight.to.city}" /> ( <c:out
				value="${ticket.flight.to.code}" /> )</td>

		<td>Arrival:</td>
		<td><%-- <joda:format value="${ticket.flight.arrivalTime}" style="MM" /> --%></td>
	</tr>
</table>
<a href='<c:url value="searchFlightsHome"/>'>Search and Book more Flights</a>
<br/>
</body>
</html>