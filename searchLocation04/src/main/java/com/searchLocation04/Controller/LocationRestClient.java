package com.searchLocation04.Controller;

import org.springframework.web.client.RestTemplate;

import com.searchLocation04.dto.Location;

public class LocationRestClient {
	
	public Location getLocation(long id) {
		RestTemplate restTemplate = new RestTemplate();
		Location location = restTemplate.getForObject("http://localhost:8080/location/"+id, Location.class);
		return location;   
	}

}
