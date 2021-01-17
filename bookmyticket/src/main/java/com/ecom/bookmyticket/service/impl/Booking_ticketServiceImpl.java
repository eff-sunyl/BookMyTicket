package com.ecom.bookmyticket.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecom.bookmyticket.model.Booking_ticket;
import com.ecom.bookmyticket.service.Booking_ticketService;
import com.ecom.bookmyticket.repository.Booking_ticketRepository;

@Service
public class Booking_ticketServiceImpl implements Booking_ticketService{
	
	@Autowired
	Booking_ticketRepository btr;

	@Override
	public int createTicket(Booking_ticket bt) {
		// TODO Auto-generated method stub
		return btr.createTicket(bt);
	}

	@Override
	public int updateTicket(Booking_ticket bt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteTicket(Booking_ticket bt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Booking_ticket getTicket(String ticketid) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
