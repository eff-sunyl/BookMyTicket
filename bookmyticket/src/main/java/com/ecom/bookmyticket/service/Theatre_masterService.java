package com.ecom.bookmyticket.service;
import java.util.List;

import com.ecom.bookmyticket.model.Theatre_master;

public interface Theatre_masterService {

	public int createTheatre(Theatre_master tm);
	public int updateTheatre(Theatre_master tm);
	public int deleteTheatre(Theatre_master tm);
	public Theatre_master getTheatre(String tname);
	public List<Theatre_master> findAllTheatre_master();
	
}
