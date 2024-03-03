package com.javaePlanet.oauth.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.javaePlanet.oauth.entities.User;
import com.javaePlanet.oauth.repos.UserRepository;


@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repos;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    User user = repos.findByName(username);
	    if (user == null) {
	        throw new UsernameNotFoundException("User not found with username: " + username);
	    }

	    return new org.springframework.security.core.userdetails.User(
				user.getName(), 
				user.getPassword(),
				true, 
				true, 
				true, 
				true, 
				getAuthorities(List.of(user.getName())));
	}

	private Collection<? extends GrantedAuthority> getAuthorities(List<String> roles) {
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (String role : roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}


}
