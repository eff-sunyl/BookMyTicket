package com.ecom.bookmyticket.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecom.bookmyticket.model.Movie_master;
import com.ecom.bookmyticket.service.Movie_masterService;
import com.ecom.bookmyticket.repository.Movie_masterRepository;

@Service
public class Movie_masterServiceImpl implements Movie_masterService{
	
	@Autowired
	Movie_masterRepository mmr;

	@Override
	public int createMovie(Movie_master mm) {
		// TODO Auto-generated method stub
		return mmr.createMovie(mm);
	}

	@Override
	public int updateMovie(Movie_master mm) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMovie(Movie_master mm) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Movie_master getMovie(String mname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie_master> findAllMovie_master() {
		// TODO Auto-generated method stub
		return mmr.findAllMovie_master();
	}
	
	
}
