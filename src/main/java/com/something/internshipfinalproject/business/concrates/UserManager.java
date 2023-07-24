package com.something.internshipfinalproject.business.concrates;

import com.something.internshipfinalproject.business.abstracts.UserService;
import com.something.internshipfinalproject.business.dto.requests.create.*;
import com.something.internshipfinalproject.business.dto.requests.update.UpdateUserRequest;
import com.something.internshipfinalproject.business.dto.responses.create.CreateUserResponse;
import com.something.internshipfinalproject.business.dto.responses.get.GetUserResponse;
import com.something.internshipfinalproject.business.dto.responses.get.all.GetAllUsersResponse;
import com.something.internshipfinalproject.business.dto.responses.update.UpdateUserResponse;
import com.something.internshipfinalproject.entities.User;
import com.something.internshipfinalproject.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UserManager implements UserService {

	private final ModelMapper mapper;
	private final UserRepository repository;

	@Override
	public List<GetAllUsersResponse> getAll() {
		List<User> users = repository.findAll();
		List<GetAllUsersResponse> response = users
						.stream()
						.map(user -> mapper.map(user, GetAllUsersResponse.class))
						.toList();
		return response;
	}

	@Override
	public GetUserResponse getById(int id) {
		return null;
	}

	@Override
	public CreateUserResponse add(CreateUserRequest request) {
		return null;
	}

	@Override
	public UpdateUserResponse update(int id, UpdateUserRequest request) {
		return null;
	}

	@Override
	public void delete(int id) {

	}
}
