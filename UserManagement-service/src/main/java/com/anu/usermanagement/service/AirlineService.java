package com.anu.usermanagement.service;

import java.util.List;

import com.anu.usermanagement.bean.FlightSearchCriteriaBean;
import com.anu.usermanagement.bean.Flights;
import com.anu.usermanagement.core.entitys.Flight;

public interface AirlineService {

 /* Flight getFlight(Long id) ;
  
  Flight getFlight(String flightNumber) ;

  List<Flight> getFlights();*/
  
  Flights getFlights(FlightSearchCriteriaBean flightSearchCriteriaBean);
 
  public List<Flight> getAll(FlightSearchCriteriaBean flightSearchCriteriaBean);
  
  public  Flight getFlight(Long id);
}
