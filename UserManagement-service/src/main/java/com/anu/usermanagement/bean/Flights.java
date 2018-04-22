package com.anu.usermanagement.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

import com.anu.usermanagement.core.entitys.Flight;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@AutoProperty
public class Flights {

  private List<Flight> flights;

  public Flights() {}
  
  public Flights(List<Flight> flights) {
    this.flights = flights;
  }

  public List<Flight> getFlights() {
    return flights;
  }

  public void setFlights(List<Flight> flights) {
    this.flights = flights;
  }

  public int getFlightCount() {
    return flights != null
        ? flights.size()
        : 0;
  }

  public String toString() {
    return Pojomatic.toString(this);
  }
}
