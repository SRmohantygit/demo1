package com.Flight_reservation_web_5.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Flight_reservation_web_5.Service.ReservationService;
import com.Flight_reservation_web_5.dto.Reservationregister;
import com.Flight_reservation_web_5.entity.Reservation;

@Controller
public class ReservationController {
	@Autowired
	 private ReservationService reservationService;
	
	@RequestMapping("/ConfirmReservation")
	
     public String ConfirmRegistration(Reservationregister request,ModelMap ModelMap) {
     Reservation reservationId = reservationService.bookFlight(request);
     ModelMap.addAttribute("reservationId",reservationId.getId() );
	    return"confirmReservation";
	}
	
}
