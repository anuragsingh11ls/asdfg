package com.anu.usermanagement.bean;

import java.util.List;

import javax.persistence.Column;
import javax.xml.bind.annotation.XmlElement;

import org.pojomatic.annotations.AutoProperty;

import com.anu.usermanagement.core.entitys.Airport;
//@XmlRootElement
@AutoProperty
public class AirportBean {
	
	private String code;
	
	
	  private String name;

	
	  private String city;


	public String getCode() {
		return code;
	}


	public String getName() {
		return name;
	}


	public String getCity() {
		return city;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	/*private List<Airport> airport;

	public List<Airport> getAirport() {
		return airport;
	}

	public void setAirport(List<Airport> airport) {
		this.airport = airport;
	}*/

}
