package com.javaePlanet.oauth.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaePlanet.oauth.entities.Role;
import com.javaePlanet.oauth.repos.RoleRepository;
@Service
public class RoleService {
    
    @Autowired
    private RoleRepository roleRepository;

    public Role addRole(Role roleDTO) {
        Role role = new Role();
        role.setName(roleDTO.getName());
        return roleRepository.save(role);
    }
}
