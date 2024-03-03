package com.javaePlanet.oauth.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import java.util.Set;

@Document(collection = "roles") // Specifies the MongoDB collection name
public class Role implements GrantedAuthority {

	@Id // Marks the field as the primary identifier
	private String id; // Using String as ID type for MongoDB

	private String name;

	private Set<User> users;

	@Override
	public String getAuthority() {
		return name;
	}

	public Role(String id, String name, Set<User> users) {
		this.id = id;
		this.name = name;
		this.users = users;
	}

	public Role() {
	}

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

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}



	// Constructors, getters, and setters omitted for brevity

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", users=" + users + "]";
	}
}
