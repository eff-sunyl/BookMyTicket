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
import com.ecom.bookmyticket.repository.Theatre_masterRepository;
import com.ecom.bookmyticket.service.Booking_mappingService;
import com.ecom.bookmyticket.model.Booking_mapping;
import com.ecom.bookmyticket.model.Theatre_master;

@RestController
@RequestMapping("mapping")

public class Booking_mappingController {
	
	@Autowired
	Booking_mappingRepository bmr;
	
	@GetMapping(value="/demo")
	public String getDemo()
	{
	 return "Hello jerk";
	}
	
	@PostMapping(value="/createMapping")
	public int createMapping(@RequestBody Booking_mapping bm)
	{
		return bmr.createBooking_mapping(bm);
	}
	
	

}
