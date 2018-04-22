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
	<H2>Search Flights</H2>

	<form:form commandName="flightSearchBean" action='/searchFlights'
		method="post">
		<table>
			<tr>
				<td>From :</td>

				<td><select name="fromAirportCode" STYLE="width: 250px">
						<option value="">--Select One--</option>
						<c:forEach items="${airports}" var="airport">
							<option
								<c:if test="${from eq airport.code}">
                         selected="selected"
                         </c:if>
								value='<c:out value="${airport.code}"/>'>
								<c:out value='${airport.name}' />
							</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>To:</td>
				<td><select name="toAirportCode" STYLE="width: 250px">
						<option value="">--Select One--</option>
						<c:forEach items="${airports}" var="airport">
							<option
								<c:if test="${airport.code eq to}">
                         selected="selected"
                         </c:if>
								value='<c:out value="${airport.code}"/>'>
								<c:out value='${airport.name}' />
							</option>
						</c:forEach>
				</select></td>

			</tr>

			<tr>
				<td colspan="2">
					<p class="submit">
						<input class="submit" type="submit" value="Submit" />
					</p>
				</td>
			</tr>
		</table>
	</form:form>
	<center>
		<table>
			<display:table name="flightSearchResult" class="table" requestURI=""
				id="" export="true" pagesize="10">
				<display:column title="Number" property="number" />
				<display:column title="Departure City" property="from.city"
					sortable="true" escapeXml="true" />
				<display:column property="departureTime" title="Departure Time"
					sortable="true" style="width:300px " />
				<display:column title="Arrival City" property="to.city"
					sortable="true" escapeXml="true" />
				<display:column property="arrivalTime" title="Arrivel Time"
					sortable="true" style="width:300px " />

				<display:column title="Seat Abailable" property="seatsAvailable" />
				<display:column title="Miles" property="miles" />
				<display:column title="" sortable="false" href="bookFlightPage"
					paramId="id" paramProperty="id" titleKey="flightId">
       		 Book
       </display:column>


			</display:table>

		</table>
	</center>



	<script type="text/javascript">
		highlightTableRows("flightSearchResult.flights");
	</script>
</body>
</html>