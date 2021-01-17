package com.ecom.bookmyticket.repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ecom.bookmyticket.model.Movie_master;

@Repository
public class Movie_masterRepository {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	class MviMaster_RowMapper implements RowMapper<Movie_master>{
		public Movie_master mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
			Movie_master m = new Movie_master();
			m.setMvi_id(resultSet.getString("mvi_id"));
			m.setMvi_genre(resultSet.getString("mvi_genre"));
			m.setMvi_director(resultSet.getString("mvi_director"));
			m.setMvi_actor(resultSet.getString("mvi_actor"));
			m.setMvi_actress(resultSet.getString("mvi_actress"));
			m.setMvi_cast(resultSet.getString("mvi_cast"));
			m.setMvi_age_rating(resultSet.getString("mvi_age_rating"));
			m.setMvi_name(resultSet.getString("mvi_name"));
			m.setMvi_release(resultSet.getDate("mvi_release"));
			m.setMvi_language(resultSet.getString("mvi_language"));		
			return m;
		}
	}
	
	public int createMovie(Movie_master mm)
	{
		
		return jdbctemplate.update("insert into movie_master (mvi_name,mvi_genre,mvi_director,mvi_actor,mvi_actress,mvi_cast,mvi_age_rating,mvi_id,mvi_release,mvi_language) " + "values(?,?,?,?,?,?,?,?,?,?)",
				new Object[] {
					mm.getMvi_name(), mm.getMvi_genre(),mm.getMvi_director(),mm.getMvi_actor(),mm.getMvi_actress(),mm.getMvi_cast(),mm.getMvi_age_rating(),mm.getMvi_id(),mm.getMvi_release(),mm.getMvi_language()
				});
	}
	
	public List<Movie_master> findAllMovie_master()
	{
		return jdbctemplate.query("select * from movie_master", new MviMaster_RowMapper());
	}

}
