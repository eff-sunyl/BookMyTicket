package com.ecom.bookmyticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.bookmyticket.repository.Theatre_masterRepository;
import com.ecom.bookmyticket.service.Theatre_masterService;
import com.ecom.bookmyticket.model.Movie_master;
import com.ecom.bookmyticket.model.Theatre_master;

@RestController
@RequestMapping("theatres")

public class Theatre_masterController {
    
	@Autowired
	Theatre_masterRepository tmr;
	
	@GetMapping(value="/demo")
	public String getDemo()
	{
	 return "Hello jerk";
	}
	
	@PostMapping(value="/createTheatre")
	public int createMovie(@RequestBody Theatre_master tm)
	{
		return tmr.createTheatre(tm);
	}
	
	
	

}
