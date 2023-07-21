package com.something.internshipfinalproject.business.concrates;

import com.something.internshipfinalproject.business.abstracts.UserService;
import com.something.internshipfinalproject.business.dto.requests.create.CreateUserRequest;
import com.something.internshipfinalproject.business.dto.requests.update.UpdateUserRequest;
import com.something.internshipfinalproject.business.dto.responses.create.CreateUserResponse;
import com.something.internshipfinalproject.business.dto.responses.get.GetUserResponse;
import com.something.internshipfinalproject.business.dto.responses.get.all.GetAllUsersResponse;
import com.something.internshipfinalproject.business.dto.responses.update.UpdateUserResponse;

import java.util.List;

public class UserManager implements UserService {
	@Override
	public List<GetAllUsersResponse> getAll() {
		return null;
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
