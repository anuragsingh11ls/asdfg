package com.anu.usermanagement.core.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.AirportDao;
import com.anu.usermanagement.core.entitys.Airport;

@Repository
public class AirportDaoImpl extends AbstractDaoImpl<Airport, String> implements AirportDao {
	private AirportDaoImpl(){
		super(Airport.class);
	}
	public Airport getAirport(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Airport airport) {
		// TODO Auto-generated method stub
		
	}

	public List<Airport> getAirports() {
		// TODO Auto-generated method stub
		return findAll();
	}
 

 /* @Override
  public List<Airport> getAirports() {
    return  getHibernateTemplate().loadAll(Airport.class);
  }

  @Override
  public void save(Airport airport) {
    getHibernateTemplate().saveOrUpdate(airport);
  }

  @Override
  public Airport getAirport(final String code) {
    return getHibernateTemplate().execute(new HibernateCallback<Airport>() {

      @Override
      public Airport doInHibernate(Session session) throws HibernateException, SQLException {
        Criteria c = session.createCriteria(Airport.class);
        c.add(Restrictions.eq("code", code.toUpperCase()));
        
        @SuppressWarnings("unchecked")
        List<Airport> airports = (List<Airport>) c.list();
        return airports.size() > 0 ? airports.get(0) : null;
      }
    });
  }*/
}
