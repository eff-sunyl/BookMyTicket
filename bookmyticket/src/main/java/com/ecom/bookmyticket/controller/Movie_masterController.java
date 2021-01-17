package com.ecom.bookmyticket.controller;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.bookmyticket.repository.Movie_masterRepository;
import com.ecom.bookmyticket.service.Movie_masterService;
import com.ecom.bookmyticket.model.Booking_users;
import com.ecom.bookmyticket.model.Movie_master;

@RestController
@RequestMapping("movies")
public class Movie_masterController {

	@Autowired
	Movie_masterService mms;
	

	@GetMapping(value="/demo")
	public String getDemo()
	{
	 return "Hello jerk";
	}
	
	@PostMapping(value="/createMovie")
	public int createMovie(@RequestBody Movie_master mm)
	{
		return mms.createMovie(mm);
	}
	
}
