package com.anu.usermanagement.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anu.usermanagement.bean.FlightSearchCriteriaBean;
import com.anu.usermanagement.bean.Flights;
import com.anu.usermanagement.core.dao.FlightDao;
import com.anu.usermanagement.core.entitys.Flight;
import com.anu.usermanagement.service.AirlineService;

@Service("airlineService")
@Transactional(readOnly = true)
public class AirlineServiceImpl implements AirlineService {
	
	@Autowired
	private FlightDao flightDao;

	public Flights getFlights(FlightSearchCriteriaBean flightSearchCriteriaBean) {
		 String fromAirportCode = flightSearchCriteriaBean.getFromAirportCode();
		    String toAirportCode = flightSearchCriteriaBean.getToAirportCode();

		    List<Flight> flights = flightDao.findFlights(fromAirportCode, toAirportCode);

		    Flights results = new Flights();
		    results.setFlights(flights);

		return results;
		//return null;
	}
/*	*/

	public List<Flight> getAll(FlightSearchCriteriaBean flightSearchCriteriaBean) {
		String fromAirportCode = flightSearchCriteriaBean.getFromAirportCode();
	    String toAirportCode = flightSearchCriteriaBean.getToAirportCode();

	    List<Flight> flights = flightDao.findFlights(fromAirportCode, toAirportCode);


		return flights;
	}

	///@Override
	public Flight getFlight(Long id) {
		return flightDao.getFlight(id);
		
	}

	/*public Flight getFlight(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Flight getFlight(String flightNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Flight> getFlights() {
		// TODO Auto-generated method stub
		return null;
	}

	public Flights getFlights(FlightSearchCriteria criteria) {
		 String fromAirportCode = criteria.getFromAirportCode();
		    String toAirportCode = criteria.getToAirportCode();

		    List<Flight> flights = flightDao.findFlights(fromAirportCode, toAirportCode);

		    Flights results = new Flights();
		    results.setFlights(flights);

		return results;
	}*/

 
}
