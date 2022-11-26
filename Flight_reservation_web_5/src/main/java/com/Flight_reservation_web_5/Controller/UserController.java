package com.Flight_reservation_web_5.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight_reservation_web_5.Repository.UserRepository;
import com.Flight_reservation_web_5.entity.User;

@Controller
public class UserController {
	
	@RequestMapping("/showLoginpage")
	public String showLoginpage() {
		return"login/login";
	}
	
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/showReg")
	public String showReg() {
		return"login/ShowReg";	
	}
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("user")User user) {
		userRepo.save(user);
		return"login/login";
		
	}
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("emailid")String emailid, @RequestParam("password")String password,ModelMap ModelMap){
    User user = userRepo.readByemail(emailid);
    if(user!=null) {
    if(user.getEmail().equals(emailid)&& user.getPassword().equals(password)) {
    	  return"findFlights";
    }else {
    	ModelMap.addAttribute("msg","invalid username/ password");
    	return"login/login";
    }
      
	}else {
		ModelMap.addAttribute("msg","invalid username/ password");
    	return"login/login";	
	}	
	}
	}
	









