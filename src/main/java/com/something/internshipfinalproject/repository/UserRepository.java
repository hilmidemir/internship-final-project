package com.something.internshipfinalproject.repository;

import com.something.internshipfinalproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByFullName(String FullName);
}
