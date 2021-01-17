package com.ecom.bookmyticket.model;
import lombok.NoArgsConstructor;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Movie_master {
	
   public String mvi_name;
   public String mvi_genre;
   public String mvi_director;
   public String mvi_actor;
   public String mvi_actress;
   public String mvi_cast;
   public String mvi_age_rating;
   public String mvi_id;
   public Date mvi_release;
   public String mvi_language;
   
   
}
