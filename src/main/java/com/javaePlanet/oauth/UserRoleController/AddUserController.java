package com.javaePlanet.oauth.UserRoleController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaePlanet.oauth.entities.User;
import com.javaePlanet.oauth.service1.UserService;

@RestController
@RequestMapping("/api/users")
public class AddUserController {

	@Autowired
	private UserService userService;

	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User userDTO) {
		User user = userService.addUser(userDTO);
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}
}


