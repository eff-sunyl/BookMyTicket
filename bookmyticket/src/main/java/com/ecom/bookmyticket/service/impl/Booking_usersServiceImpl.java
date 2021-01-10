package com.ecom.bookmyticket.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.bookmyticket.model.Booking_users;
import com.ecom.bookmyticket.service.Booking_usersService;
import com.ecom.bookmyticket.repository.Booking_usersRepository;

@Service
public class Booking_usersServiceImpl implements Booking_usersService {

	@Autowired
	Booking_usersRepository bur;
	
	@Override
	public int createUser(Booking_users bu) {
		// TODO Auto-generated method stub
		return bur.createUser(bu);
		
	}

	@Override
	public int updateuser(Booking_users bu) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(Booking_users bu) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Booking_users getUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
