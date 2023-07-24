package com.something.internshipfinalproject.business.dto.responses.get;

import com.something.internshipfinalproject.entities.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetDocumentResponse {
	private Long id;
	private User documentOwner;
	private String documentName;
	private double documentSize;
	private Long documentWordSize;

}
