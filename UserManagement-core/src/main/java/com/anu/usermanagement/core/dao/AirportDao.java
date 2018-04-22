package com.anu.usermanagement.core.dao;

import java.util.List;

import com.anu.usermanagement.core.entitys.Airport;

public interface AirportDao {
  Airport getAirport(String code);

  void save(Airport airport);

  List<Airport> getAirports();
}
