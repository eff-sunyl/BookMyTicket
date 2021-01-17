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

public class Theatre_master {

	public String theatre_id;
	public String screen_id;
	public String screen_name;
	public String theatre_name;
	public String theatre_location;
	public String theatre_region;
}
