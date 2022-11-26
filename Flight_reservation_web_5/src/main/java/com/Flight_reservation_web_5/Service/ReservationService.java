package com.Flight_reservation_web_5.Service;

import com.Flight_reservation_web_5.dto.Reservationregister;
import com.Flight_reservation_web_5.entity.Reservation;

public interface ReservationService {
   Reservation bookFlight(Reservationregister request);
}
