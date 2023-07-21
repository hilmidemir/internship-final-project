package com.something.internshipfinalproject.business.abstracts;

import com.something.internshipfinalproject.business.dto.requests.create.CreateUserRequest;
import com.something.internshipfinalproject.business.dto.requests.update.UpdateUserRequest;
import com.something.internshipfinalproject.business.dto.responses.create.CreateUserResponse;
import com.something.internshipfinalproject.business.dto.responses.get.GetUserResponse;
import com.something.internshipfinalproject.business.dto.responses.get.all.GetAllUsersResponse;
import com.something.internshipfinalproject.business.dto.responses.update.UpdateUserResponse;

import java.util.List;

public interface UserService {
	List<GetAllUsersResponse> getAll();

	GetUserResponse getById(int id);

	CreateUserResponse add(CreateUserRequest request);

	UpdateUserResponse update(int id, UpdateUserRequest request);

	void delete(int id);
}
