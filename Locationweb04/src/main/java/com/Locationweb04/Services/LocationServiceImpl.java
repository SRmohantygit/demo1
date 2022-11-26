
package com.Locationweb04.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Locationweb04.Entity.Location;
import com.Locationweb04.Repositories.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository locationRepo;

	@Override
	public void saveLocation(Location location) {
		locationRepo.save(location);
	}

	@Override
	public List<Location> getLocations() {
		List<Location> locations = locationRepo.findAll();
		return locations;
	}

	@Override
	public void deleteRegistrationById(long id) {
		locationRepo.deleteById(id);
		
	}

	@Override
	public Location getRegistrationById(long id) {
	Location location = locationRepo.getById(id);
		return location;
	}

	@Override
	public void updateLocation(Location location) {
		locationRepo.save(location);
		
	}

	

	



}
