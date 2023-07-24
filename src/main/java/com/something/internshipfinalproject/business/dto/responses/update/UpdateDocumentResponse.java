package com.something.internshipfinalproject.business.dto.responses.update;

import com.something.internshipfinalproject.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateDocumentResponse {
	private Long id;
	private User documentOwner;
	private String documentName;
	private double documentSize;
	private Long documentWordSize;
}
