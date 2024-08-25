package com.application.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.application.model.Users;
import com.application.service.UserService;

@RestController
@RequestMapping("/api/")
public class UserController {
	@Autowired
	private UserService serv;
	
	@PostMapping("register")
	public String newRegistration(@RequestBody Users user) {
		if(serv.newRegistration(user))
			return "registered";
		else
			return "unable to register";
	}
	
	@PostMapping("login")
	public String verifyLogin(@RequestBody Users user) {
		return serv.verify(user);
	}
}
