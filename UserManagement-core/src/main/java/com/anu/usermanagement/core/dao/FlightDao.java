package com.anu.usermanagement.core.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.anu.usermanagement.core.entitys.Flight;

public interface FlightDao {
  boolean decrementSeat(Long flightId, int quantity);

  List<Flight> findFlights(String fromAirportCode, String toAirportCode) ;
  
  public Flight getFlight(Long id);

/*  public List<Flight> getFlights();
  
  Flight getFlight(Long id);

  Flight getFlight(String flightNumber);

  void save(Flight flight);*/
}
