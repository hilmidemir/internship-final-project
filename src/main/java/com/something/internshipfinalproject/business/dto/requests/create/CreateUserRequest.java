package com.something.internshipfinalproject.business.dto.requests.create;

import com.something.internshipfinalproject.common.constants.Regex;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {
	@NotNull
	@Length(min = 2, max = 35, message = "Length must be greater than 2")
	private String fullName;

	@NotBlank
	@Pattern(regexp = Regex.Mail)
	private String mail;

	@NotBlank
	@Length(min = 8, max = 25, message = "Password length must be between 8 and 25 characters..")
	private String password;
}
