package com.anu.usermanagement.web.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anu.usermanagement.bean.FlightSearchCriteriaBean;
import com.anu.usermanagement.bean.ReservationBean;
import com.anu.usermanagement.core.entitys.Flight;
import com.anu.usermanagement.service.AirlineService;
import com.anu.usermanagement.service.AirportService;
import com.anu.usermanagement.service.ReservationService;

@Controller
public class SearchFlights {
	@Autowired
	private  AirportService airportService;
	/**
	 * This statement is going to Auto wired AirlineService 
	 */
	@Autowired
	private  AirlineService airlineService;
	
	
	@Autowired
	private ReservationService reservationService;
/**
 * 
 * @return
 */
	@RequestMapping("/searchFlightsHome")
	public final ModelAndView searchFlights()
	{
		ModelAndView mv=new ModelAndView("searchFlights");
		//List airports = ;
		mv.addObject("airports",airportService.getAirports());
		return mv;
	}
/**
 * This method is used as a SearchFlights Controller
 * @param flightSearchCriteriaBean
 * @return ModelAndView Object
 */
	@RequestMapping(value = "/searchFlights", method = RequestMethod.POST)
	public final ModelAndView searchFlights(final FlightSearchCriteriaBean flightSearchCriteriaBean)  {
		System.out.println("search");

		ModelAndView mav = new ModelAndView("searchFlights");

		mav.addObject("airports", airportService.getAirports());

		mav.addObject("from", flightSearchCriteriaBean.getFromAirportCode());
		mav.addObject("to", flightSearchCriteriaBean.getToAirportCode());

		//Flights searchResult = airlineService.getFlights(flightSearchCriteriaBean);

		mav.addObject("flightSearchResult", airlineService.getAll(flightSearchCriteriaBean));

		return mav;
	}
	
	//book flight
	
	  @RequestMapping(value = "/bookFlightPage", method = RequestMethod.GET)
	public final ModelAndView bookFlight(@RequestParam final Long id,final ReservationBean reservationBean)  {
		  
		  System.out.println("booking page");
	
	    ModelAndView mav = new ModelAndView("bookFlight");
	  mav.addObject("flight", airlineService.getFlight(id));
	  //  mav.addObject("reservation", reservation);

	    return mav;
	  }
	
	
	  @RequestMapping(value = "/bookFlight.html", method = RequestMethod.POST)
	  public String bookFlight(@Valid ReservationBean reservationBean, BindingResult result,
	    Map<String, Object> model) throws Exception {
	    Flight flight = airlineService.getFlight(reservationBean.getFlightId());

	    if (result.hasErrors()) {
	      model.put("flight", flight);
	      return "bookFlight";
	    }
	    else {
	      try {
	        //Ticket ticket = ;

	        model.put("ticket", reservationService.bookFlight(reservationBean));

	        return "confirmation";
	      }
	      catch (Exception e) {
	        model.put("message", e.getMessage());
	      }
	     

	      model.put("flight", flight);

	      return "bookFlight";
	    }
	  }
	  
	  
	  
	  

}
