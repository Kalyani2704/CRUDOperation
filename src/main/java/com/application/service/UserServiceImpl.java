package com.application.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.application.model.Users;
import com.application.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository repo;
	@Autowired
	private JwtService jwtService;
	@Autowired
	AuthenticationManager authManager;

	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

	@Override
	public boolean newRegistration(Users user) {
		Users users = new Users(user.getUsername(), encoder.encode(user.getPassword()));
		try {
			repo.save(users);
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public String verify(Users user) {
		Authentication authentication = authManager
				.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		if (authentication.isAuthenticated()) 
			return jwtService.generateToken();
		else 
			return "fail";
	}
}
