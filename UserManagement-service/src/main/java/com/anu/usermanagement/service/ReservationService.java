package com.anu.usermanagement.service;

import java.util.List;

import com.anu.usermanagement.bean.ReservationBean;
import com.anu.usermanagement.core.entitys.Ticket;

public interface ReservationService {

  Ticket bookFlight(ReservationBean reservationBean) ;

  Ticket getReservation(Long reservationId) ;

  List<Ticket> getReservations();
}
