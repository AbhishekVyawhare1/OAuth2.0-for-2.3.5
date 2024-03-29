package com.javaePlanet.oauth.DTO;

public class UserDTO {
	private String name;
	private String password;

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

	public UserDTO(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public UserDTO() {
		super();
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", password=" + password + "]";
	}

}
