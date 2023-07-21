package com.something.internshipfinalproject.repository;

import com.something.internshipfinalproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByFullName(String FullName);
}
