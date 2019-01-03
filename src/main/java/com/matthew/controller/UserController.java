package com.matthew.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

import com.matthew.dao.UserSpecification;
import com.matthew.model.User;
import com.matthew.service.UserService;
import com.matthew.util.SearchOperation;
import com.matthew.util.SpecSearchCriteria;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> getUsers() {
		return userService.getAllUsers();
	}

	@RequestMapping(value = "/user/{id}/{name}", method = RequestMethod.GET)
	public Object getUserByName(@PathVariable("id") long id,@PathVariable("name") String name) {
		UserSpecification spec = new UserSpecification(new SpecSearchCriteria("id", SearchOperation.EQUALITY, id, "name", SearchOperation.EQUALITY, name, SearchOperation.EQUALITY));
		Optional<User> result = userService.getUserByName(spec);
		return ((result.toString() == "Optional.empty")?"Validation failed!":result);
	}
}