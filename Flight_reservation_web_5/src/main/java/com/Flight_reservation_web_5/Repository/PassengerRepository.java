package com.Flight_reservation_web_5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_reservation_web_5.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
