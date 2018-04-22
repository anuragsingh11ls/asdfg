package com.anu.usermanagement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anu.usermanagement.core.dao.AirportDao;
import com.anu.usermanagement.core.entitys.Airport;
import com.anu.usermanagement.service.AirportService;

@Service("airportService")
@Transactional(readOnly = true)
public class AirportServiceImpl implements AirportService {
	@Autowired
	private  AirportDao airportDao;

	public List<Airport> getAirports() {
		// TODO Auto-generated method stub
		return airportDao.getAirports();
	}

/*  public AirportServiceImpl(AirportDao airportDao) {
    this.airportDao = airportDao;
  }

  @Override
  public List<Airport> getAirports() {
    return airportDao.getAirports();
  }

  @Override
  public Airport getAirport(String code) throws NoSuchAirportException {
    Airport airport = airportDao.getAirport(code);
    if (airport != null) {
      return airport;
    }
    throw new NoSuchAirportException("Airport:" + code + " not found");
  }*/
}
