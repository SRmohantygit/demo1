package com.Locationweb04.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Locationweb04.Entity.Location;
import com.Locationweb04.Repositories.LocationRepository;

@RestController
public class LocationRestController1 {
	
	@Autowired
	private LocationRepository locationRepo;
	
	@RequestMapping("/location/{id}")	 
	public Location getLocation(@PathVariable("id")long id) {
		Optional<Location> findById = locationRepo.findById(id);
		Location location = findById.get();
		return location;
	}

}
