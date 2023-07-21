package com.something.internshipfinalproject.business.dto.responses.create;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserResponse {
	private Long id;
	private String fullName;
	private String mail;
	private String password;
}
