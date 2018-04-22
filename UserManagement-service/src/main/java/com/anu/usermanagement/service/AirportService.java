package com.anu.usermanagement.service;

import java.util.List;

import com.anu.usermanagement.core.entitys.Airport;

public interface AirportService {
  List<Airport> getAirports();
  
 // Airport getAirport(String code) ;
}
