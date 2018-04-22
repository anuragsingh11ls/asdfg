package com.anu.usermanagement.core.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.FlightDao;
import com.anu.usermanagement.core.entitys.Flight;


@Repository("flightDao")
public class FlightDaoImpl extends AbstractDaoImpl<Flight, Serializable> implements FlightDao {

	
	public FlightDaoImpl(){
		super(Flight.class);
	}

	public boolean decrementSeat(Long flightId, int quantity) {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Flight> findFlights(String fromAirportCode, String toAirportCode) {
		
		List<Flight> result=getCurrentSession().createCriteria(Flight.class)
		          .createAlias("from", "fromAirport")
		          .createAlias("to", "toAirport")
		          .add(Restrictions.eq("fromAirport.code", fromAirportCode))
		          .add(Restrictions.eq("toAirport.code", toAirportCode))
		          .list();
		return result;
	}

	//@Override
	public Flight getFlight(Long id) {
		// TODO Auto-generated method stub
		return findById(id);
	}




}
