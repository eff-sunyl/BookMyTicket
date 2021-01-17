package com.ecom.bookmyticket.controller;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.bookmyticket.repository.Booking_mappingRepository;
import com.ecom.bookmyticket.repository.Booking_ticketRepository;
import com.ecom.bookmyticket.service.Booking_ticketService;
import com.ecom.bookmyticket.model.Booking_mapping;
import com.ecom.bookmyticket.model.Booking_ticket;

@RestController
@RequestMapping("ticket")

public class Booking_ticketController {
	
	@Autowired
	Booking_ticketRepository btr;
	
	@GetMapping(value="/demo")
	public String getDemo()
	{
	 return "Hello jerk";
	}
	
	@PostMapping(value="/createTicket")
	public int createMapping(@RequestBody Booking_ticket bt)
	{
		return btr.createTicket(bt);
	}
	
	

}
