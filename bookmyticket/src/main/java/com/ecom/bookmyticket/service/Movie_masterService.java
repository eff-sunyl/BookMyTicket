package com.ecom.bookmyticket.service;
import java.util.List;

import com.ecom.bookmyticket.model.Movie_master;

public interface Movie_masterService {
	
	public int createMovie(Movie_master mm);
	public int updateMovie(Movie_master mm);
	public int deleteMovie(Movie_master mm);
	public Movie_master getMovie(String mname);
	public List<Movie_master> findAllMovie_master();

}
