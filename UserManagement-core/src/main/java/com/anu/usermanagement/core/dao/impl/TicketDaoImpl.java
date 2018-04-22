package com.anu.usermanagement.core.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.TicketDao;
import com.anu.usermanagement.core.entitys.Ticket;

@Repository("ticketDao")
public class TicketDaoImpl extends AbstractDaoImpl<Ticket, String> implements TicketDao {

	protected TicketDaoImpl() {
    super(Ticket.class);
  }


  public void save(Ticket ticket) {
	  ticket.setIssueDate(new Date());
	  System.out.println("anurag in ticket"+ticket);
    saveOrUpdate(ticket);
    System.out.println("anurag in ticket"+ticket);
  }

  public List<Ticket> getTickets() {
    return findAll();
  }

  //@Override
  public Ticket getTicket(Long ticketId) {
    return findById(ticketId.toString());
  }
}
