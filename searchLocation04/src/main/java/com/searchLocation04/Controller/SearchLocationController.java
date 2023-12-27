package com.searchLocation04.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.searchLocation04.dto.Location;

@Controller
public class SearchLocationController {
	
	@RequestMapping("/searchlocation")
	public String showSearchLocation(){
		return"searchLocation";
	}
        // Bug - 130 modified code here 
	@RequestMapping("/findLocation")
	public String findLocationBYID(@RequestParam("id") long id,ModelMap modelMap) {
		LocationRestClient locationRC = new LocationRestClient();
		Location location = locationRC.getLocation(id);
		modelMap.addAttribute("location", location);
		return"searchResult";
	}

}
