package com.example.rawendraprojectspring.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.rawendraprojectspring.service.UserService;

@RestController
public class UserController {

	UserService service;

	@RequestMapping(method = RequestMethod.GET, path = "/users")
	public List<Users> getUsers() {

		return service.getAllUsers();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/users/{id}")
	public Users getUser(@PathVariable int id) throws NoUserFoundException {

		Users user = service.getUserForId(id);
		if (user == null) {
			throw new NoUserFoundException("user not found");
		}
		return user;
	}

	@RequestMapping(method = RequestMethod.POST, path = "/users")
	public ResponseEntity<Users> createUser(@RequestBody Users user) {
		Users userCreated = service.createUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(userCreated.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/users/{id}")
	public Users delete(@PathVariable int id) {
		return service.deleteForID(id);

	}

}
