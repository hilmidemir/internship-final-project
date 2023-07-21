package com.something.internshipfinalproject.api.controller;

import com.something.internshipfinalproject.business.abstracts.UserService;
import com.something.internshipfinalproject.business.dto.requests.create.CreateUserRequest;
import com.something.internshipfinalproject.business.dto.responses.create.CreateUserResponse;
import com.something.internshipfinalproject.business.dto.responses.get.GetUserResponse;
import com.something.internshipfinalproject.entities.User;
import com.something.internshipfinalproject.repository.UserRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("v1/user/")
public class UserController {
	private final UserService userService;

	//User adding
	@PostMapping
	public CreateUserResponse add(@Valid @RequestBody CreateUserRequest request) {
		return userService.add(request);
	}

	// User searching by id.
	@GetMapping("/{id}")
	public GetUserResponse getById(@PathVariable Long id) {
		return userService.getById(Math.toIntExact(id)); //
	}

	//Updating and returns existing user.
	@PutMapping("/{id}")
	public User updateUser(@PathVariable Long id, @RequestBody User user) {
		user.setId(id);
		return userRepository.save(user);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
	}
}
