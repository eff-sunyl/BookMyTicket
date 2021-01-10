package com.ecom.bookmyticket.controller;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.bookmyticket.repository.Booking_usersRepository;
import com.ecom.bookmyticket.service.Booking_usersService;
import com.ecom.bookmyticket.model.Booking_users;


@RestController
@RequestMapping("bmtusers")
public class Booking_usersController {
	

	@Autowired
	Booking_usersService bus;
	
	@PostMapping(value="/createUser")
	public int createUser(@RequestBody Booking_users bu)
	{
		return bus.createUser(bu);
	}
	
	
	

}
