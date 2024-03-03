package com.javaePlanet.oauth.repos;

import org.springframework.data.repository.CrudRepository;

import com.javaePlanet.oauth.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	User findByName(String name);
}
