package com.Locationweb04.Services;

import java.util.List;

import com.Locationweb04.Entity.Location;

public interface LocationService {
	public void saveLocation(Location location);
	public List<Location> getLocations();
	public void deleteRegistrationById(long id);
	public Location getRegistrationById(long id);
	public void updateLocation(Location location);
}
