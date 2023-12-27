package com.searchLocation04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SearchLocation04Application {

	public static void main(String[] args) {
		SpringApplication.run(SearchLocation04Application.class, args);
	}


    @GetMapping("/")
   public String getWelcomeMsg( ) {
       return "Welcome to Location project ";
     
 }

}
