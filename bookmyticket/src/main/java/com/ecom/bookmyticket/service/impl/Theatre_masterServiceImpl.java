package com.ecom.bookmyticket.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecom.bookmyticket.model.Theatre_master;
import com.ecom.bookmyticket.service.Theatre_masterService;
import com.ecom.bookmyticket.repository.Theatre_masterRepository;
import java.util.List;


@Service
public class Theatre_masterServiceImpl implements Theatre_masterService{
	
	@Autowired
	Theatre_masterRepository tmr;

	@Override
	public int createTheatre(Theatre_master tm) {
		// TODO Auto-generated method stub
		return tmr.createTheatre(tm);
	}

	@Override
	public int updateTheatre(Theatre_master tm) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteTheatre(Theatre_master tm) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Theatre_master getTheatre(String tname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Theatre_master> findAllTheatre_master() {
		// TODO Auto-generated method stub
		return tmr.findAllTheatre_master();
	}
	
	

}
