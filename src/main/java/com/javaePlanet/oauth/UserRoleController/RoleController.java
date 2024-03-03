package com.javaePlanet.oauth.UserRoleController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaePlanet.oauth.entities.Role;
import com.javaePlanet.oauth.service1.RoleService;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/add")
    public ResponseEntity<Role> addRole(@RequestBody Role roleDTO) {
        Role role = roleService.addRole(roleDTO);
        return new ResponseEntity<>(role, HttpStatus.CREATED);
    }
}