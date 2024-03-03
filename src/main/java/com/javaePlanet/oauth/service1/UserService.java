package com.javaePlanet.oauth.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.javaePlanet.oauth.entities.User;
import com.javaePlanet.oauth.repos.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public User addUser(User userDTO) {
		User user = new User();
		user.setName(userDTO.getName());
//		user.setPassword(userDTO.getPassword());
//		return userRepository.save(user);
		
		// Encode the password before saving
        String encodedPassword = passwordEncoder.encode(userDTO.getPassword());
        user.setPassword(encodedPassword);
        return userRepository.save(user);
	}
}