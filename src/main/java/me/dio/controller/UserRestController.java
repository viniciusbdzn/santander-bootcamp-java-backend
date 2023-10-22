package me.dio.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import me.dio.domain.model.User;
import me.dio.service.UserService;

@RestController
@RequestMapping("/users")
public class UserRestController {
	
	private final UserService userService;
	
	public UserRestController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		var user = userService.findById(id);
		return ResponseEntity.ok(user);
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<User> create(@RequestBody User userToCreate) {
		var userCreated = userService.create(userToCreate);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
							.path("{id}")
							.buildAndExpand(userCreated.getId())
							.toUri();
		return ResponseEntity.created(location).body(userCreated);
	}
}
