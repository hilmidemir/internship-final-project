package com.something.internshipfinalproject.business.dto.responses.get.all;

import com.something.internshipfinalproject.entities.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllDocumentsResponse {
	private Long id;
	private String documentName;
	private double documentSize;
	private Long documentWordSize;
	private User documentOwner;
}
