package com.javaePlanet.oauth.repos;


import com.javaePlanet.oauth.entities.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, Integer> {

}
