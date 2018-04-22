package com.anu.usermanagement.serviceimpl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anu.usermanagement.bean.ReservationBean;
import com.anu.usermanagement.core.dao.FlightDao;
import com.anu.usermanagement.core.dao.TicketDao;
import com.anu.usermanagement.core.entitys.Ticket;
import com.anu.usermanagement.service.ReservationService;
@Service("reservationService")
@Transactional
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private  FlightDao flightDao;
	@Autowired
	private  TicketDao ticketDao;
	
	//@Override
	public Ticket bookFlight(ReservationBean reservationBean) {
		
		
		Ticket ticket = new Ticket();
		//BeanUtils.copyProperties(reservationBean, ticket);
		//ticket.setIssueDate(new Date());
		ticket.setFlight(flightDao.getFlight(reservationBean.getFlightId()));
		ticket.setReservationName(reservationBean.getReservationName());
		ticket.setNumberOfSeats(reservationBean.getQuantity());
		System.out.println("============="+ticket);
		ticketDao.save(ticket);

		return ticket;
	}
	//@Override
	public Ticket getReservation(Long reservationId) {
		// TODO Auto-generated method stub
		return null;
	}
	//@Override
	public List<Ticket> getReservations() {
		// TODO Auto-generated method stub
		return null;
	}



/*	@Override
	@Transactional(rollbackFor = { NoSeatAvailableException.class }, readOnly=false)
	public Ticket bookFlight(Reservation booking) throws  NoSeatAvailableException {

		if (!flightDao.decrementSeat(booking.getFlightId(), booking.getQuantity())) {
			throw new NoSeatAvailableException("Could not book seats on flight:" + booking.getFlightId()
					+ " of quantity:" + booking.getQuantity());
		}

		Ticket ticket = new Ticket();
		ticket.setIssueDate(new LocalDate());
		ticket.setFlight(flightDao.getFlight(booking.getFlightId()));
		ticket.setReservationName(booking.getReservationName());
		ticket.setNumberOfSeats(booking.getQuantity());

		ticketDao.save(ticket);

		return ticket;
	}

	@Override
	public List<Ticket> getReservations() {
		return ticketDao.getTickets();
	}

	@Override
	public Ticket getReservation(Long reservationId) throws NoSuchReservationException {
		Ticket ticket = ticketDao.getTicket(reservationId);
		if (ticket == null) {
			throw new NoSuchReservationException("Ticket not found:" + reservationId);
		}

		return ticket;
	}*/
}
