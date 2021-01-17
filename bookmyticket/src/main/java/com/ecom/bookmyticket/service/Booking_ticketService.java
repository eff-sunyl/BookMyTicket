package com.ecom.bookmyticket.service;
import com.ecom.bookmyticket.model.Booking_ticket;

public interface Booking_ticketService {
	
	public int createTicket(Booking_ticket bt);
	public int updateTicket(Booking_ticket bt);
	public int deleteTicket(Booking_ticket bt);
	public Booking_ticket getTicket(String ticketid);
	

}
