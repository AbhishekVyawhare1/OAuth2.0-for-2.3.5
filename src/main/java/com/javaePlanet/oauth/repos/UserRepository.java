package com.javaePlanet.oauth.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.javaePlanet.oauth.entities.User;

public interface UserRepository extends MongoRepository<User, Integer> {
	User findByName(String name);
}
