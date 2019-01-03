package com.matthew.service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.domain.Specification;
import com.matthew.model.User;
import org.springframework.lang.Nullable;


public interface UserService {
	Optional<User> getUserById(long id);
	List<User> getAllUsers();
	Optional<User> getUserByName(@Nullable Specification<User> spec);
}