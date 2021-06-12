package com.onemount.onefast.repository;

import java.util.Optional;

import com.onemount.onefast.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findById(Long id);
	boolean existsByEmail(String email);
	User findByEmail(String email);
}
