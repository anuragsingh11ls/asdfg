package com.anu.usermanagement.core.dao;

import java.util.List;

import com.anu.usermanagement.core.entitys.Ticket;

public interface TicketDao {  
  void save(Ticket ticket);
  
  List<Ticket> getTickets();
  
  Ticket getTicket(Long ticketId);
}
