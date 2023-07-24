package com.something.internshipfinalproject.business.dto.responses.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserResponse {
	private Long id;
	private String fullName;
	private String mail;
	private String password;
}

