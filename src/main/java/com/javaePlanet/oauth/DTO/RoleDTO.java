package com.javaePlanet.oauth.DTO;

public class RoleDTO {
	private String name;
	// Getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RoleDTO(String name) {
		super();
		this.name = name;
	}

	public RoleDTO() {
		super();
	}

	@Override
	public String toString() {
		return "RoleDTO [name=" + name + "]";
	}

}
