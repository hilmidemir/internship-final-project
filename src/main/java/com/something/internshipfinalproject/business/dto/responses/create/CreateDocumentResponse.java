package com.something.internshipfinalproject.business.dto.responses.create;

import com.something.internshipfinalproject.entities.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateDocumentResponse {
	private Long id;
	private User documentOwner;
	private String documentName;
	private double documentSize;
	private Long documentWordSize;
}
