package com.ecom.bookmyticket.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecom.bookmyticket.model.Booking_mapping;
import com.ecom.bookmyticket.service.Booking_mappingService;
import com.ecom.bookmyticket.repository.Booking_mappingRepository;

@Service
public class Booking_mappingServiceImpl implements Booking_mappingService{
	
	@Autowired
	Booking_mappingRepository bmr;

	@Override
	public int createBooking_mapping(Booking_mapping bm) {
		// TODO Auto-generated method stub
		return bmr.createBooking_mapping(bm);
	}

	@Override
	public int updateBooking_mapping(Booking_mapping bm) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBooking_mapping(Booking_mapping bm) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Booking_mapping getBooking_mapping(Integer mid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking_mapping> findAllBooking_mapping() {
		// TODO Auto-generated method stub
		return null;
	}

}
