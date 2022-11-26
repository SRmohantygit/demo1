package com.Flight_reservation_web_5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_reservation_web_5.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User readByemail(String emailid);



}
