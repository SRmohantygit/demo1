package com.Flight_reservation_web_5.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight_reservation_web_5.Repository.FlightRepository;
import com.Flight_reservation_web_5.entity.Flight;

@Controller
public class FlightController {
	
	@Autowired
	private FlightRepository flightRepo;
	
	
	@RequestMapping("/FindFlights")
   public String FindFlights(@RequestParam("from") String from,@RequestParam("to")String to,@RequestParam("departureDate")@DateTimeFormat(pattern="MM-dd-yyyy")Date departureDate,ModelMap ModelMap) {
	List<Flight> findFlights = flightRepo.findFlights(from,to,departureDate);
	ModelMap.addAttribute("findFlights",  findFlights);
	return"displayFlights";	
	
	}
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId")Long flightId, ModelMap ModelMap) {
	Optional<Flight> findById = flightRepo.findById( flightId);
     Flight flight = findById.get();
     ModelMap.addAttribute("flight", flight);
       return"showReservation";
	}
	
	}
	
	
	
	
	
	
	
	
	

