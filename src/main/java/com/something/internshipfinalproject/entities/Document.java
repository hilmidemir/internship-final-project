package com.something.internshipfinalproject.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "documents")
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String documentName;
	private double documentSize;
	private Long documentWordSize;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User documentOwner;

}
