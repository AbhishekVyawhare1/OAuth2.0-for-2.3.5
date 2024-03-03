package com.javaePlanet.oauth.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document(collection = "users") // Specifies the MongoDB collection name
public class User {

	@Id // Marks the field as the primary identifier
	private String id; // Using String as ID type for MongoDB

	private String name;
	private String password;

	private Set<Role> roles;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public User(String id, String name, String password, Set<Role> roles) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.roles = roles;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", roles=" + roles + "]";
	}
}
