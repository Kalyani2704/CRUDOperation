package com.application.service;
import com.application.model.Users;

public interface UserService {
	public boolean newRegistration(Users user);

	public String verify(Users user);

}
