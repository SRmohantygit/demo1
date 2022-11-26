   package com.Locationweb04.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Locationweb04.Entity.Location;
import com.Locationweb04.Repositories.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRestController {
	
	@Autowired
	private LocationRepository locationRepo;
	@GetMapping
	public 	 List<Location> getLocationsd() {
		 List<Location> location = locationRepo.findAll();
		return location;
	}
	@PostMapping
	public void saveLOcation(@RequestBody Location location) {
		locationRepo.save(location);
	}
	@PutMapping
	public void updateLOcation(@RequestBody Location location) {
		locationRepo.save(location);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteLOcation(@PathVariable("id")long id) {
		locationRepo.deleteById(id);
	}
	
}
