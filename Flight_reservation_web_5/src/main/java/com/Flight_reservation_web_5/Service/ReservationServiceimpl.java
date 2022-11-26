package com.Flight_reservation_web_5.Service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Flight_reservation_web_5.Repository.FlightRepository;
import com.Flight_reservation_web_5.Repository.PassengerRepository;
import com.Flight_reservation_web_5.Repository.ReservationRepository;
import com.Flight_reservation_web_5.dto.Reservationregister;
import com.Flight_reservation_web_5.entity.Flight;
import com.Flight_reservation_web_5.entity.Passenger;
import com.Flight_reservation_web_5.entity.Reservation;
import com.Flight_reservation_web_5.utilities.EmailUtily;
import com.Flight_reservation_web_5.utilities.PDFGenerator;
@Service
public class ReservationServiceimpl implements ReservationService {
	
	@Autowired
	private PassengerRepository passengerRepo;
	
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	@Autowired
	private PDFGenerator pdfGenerator;
	
	@Autowired
	private EmailUtily emailutily;

	@Override
	public Reservation bookFlight(Reservationregister request) {
		
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getFirstName());
		passenger.setLastName(request.getLastName());
		passenger.setMiddleName(request.getMiddleName());
		passenger.setEmail(request.getEmail());
		
		passenger.setPhone(request.getPhone());
		passengerRepo.save(passenger);
		
		long flightId = request.getFlightId();
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
		
		reservationRepo.save(reservation);
		String filePath="E:\\STS\\Flight_reservation_web_5\\tickets\\reservation"+reservation.getId()+".pdf";
	    pdfGenerator.generateItinerary(reservation, filePath);
	    emailutily.sendItinerary(passenger.getEmail(),filePath);
		return reservation;
	}

}
