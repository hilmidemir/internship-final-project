package com.something.internshipfinalproject.business.dto.requests.update;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateDocumentRequest {
	@NotNull
	@Length(min = 2, max = 95, message = "Length must be greater than 2 and lower than 95")
	private String documentName;
}
