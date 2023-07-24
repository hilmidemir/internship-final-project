package com.something.internshipfinalproject.business.dto.responses.get.all;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllUsersResponse {
	private Long id;
	private String fullName;
	private String mail;
	private String password;
}

