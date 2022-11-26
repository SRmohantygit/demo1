package com.Locationweb04.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Locationweb04.Dto.GetLocationData;
import com.Locationweb04.Entity.Location;
import com.Locationweb04.Services.LocationService;
import com.Locationweb04.util.Email;

@Controller
public class LocationController {
	@Autowired
	private Email email;
	@Autowired
	private LocationService locationservice;
	@RequestMapping("/showlocation")
	public String ShowLocationpage() {
		return"locationsave";
	}
	@RequestMapping("/locationsave") 
	public String GetLocationdata(@ModelAttribute("location") Location location,ModelMap modelMap) {
		locationservice.saveLocation(location);
		email.sendEmail("sommohanty98@gmail.com", "Location saved", " my email locations detals is saved");
		modelMap.addAttribute("msg","Location is saved!!");
		return"locationsave";
	}
	@RequestMapping("/getalllocation")
	public String getAllLocation(ModelMap modelMap) {
		List<Location> locations = locationservice.getLocations();
		modelMap.addAttribute("locations", locations);
		
		return"diplayAllLocations";
	}   
	@RequestMapping("/deleteReg")
	public String deleteRegistration(@RequestParam("id")long id,ModelMap modelMap) {
		locationservice.deleteRegistrationById(id);
		List<Location> locations = locationservice.getLocations();
		modelMap.addAttribute("locations", locations);
		
		return"diplayAllLocations";
	}
	@RequestMapping("/updateReg")
	public String updateRegistration(@RequestParam("id")long id,ModelMap modelMap) {
		Location location= locationservice.getRegistrationById(id);
		modelMap.addAttribute("location", location);
		
		return"updateLocation";
	}
	@RequestMapping("/updateLocation")
	public String updateLocation(GetLocationData locationData,ModelMap modelMap) {
		Location location = new Location();
		location.setId(locationData.getId());
		location.setCode(locationData.getCode());
		location.setName(locationData.getName());
		location.setType(locationData.getType());
		locationservice.updateLocation(location);
		List<Location> locations = locationservice.getLocations();
		modelMap.addAttribute("locations", locations);
		return"diplayAllLocations";
	}
//	@RequestMapping("/locationsave")
//	public String GetLocationdata(@RequestParam("id")long id,@RequestParam("code")String code,@RequestParam("name")String name,@RequestParam("type")String type,ModelMap modelMap) {
//		Location location = new Location();
//		location.setId(id);
//		location.setCode(code);
//		location.setName(name);
//		location.setType(type);
//		locationservice.saveLocation(location);
//		modelMap.addAttribute("msg","location is saved" );
//		return"locationsave";
//	}
//	@RequestMapping("/locationsave")
//	public String GetLocationdata(GetLocationData locationData,ModelMap modelMap) {
//		Location location = new Location();
//		location.setId(locationData.getId());
//		location.setCode(locationData.getCode());
//		location.setName(locationData.getName());
//		location.setType(locationData.getType());
//		locationservice.saveLocation(location);
//		modelMap.addAttribute("msg", "location is saved");
//		return"locationsave";
//	}
}   

