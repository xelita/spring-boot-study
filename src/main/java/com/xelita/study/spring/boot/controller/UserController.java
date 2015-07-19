package com.xelita.study.spring.boot.controller;

import com.xelita.study.spring.boot.domain.*;
import com.xelita.study.spring.boot.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.transaction.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Transactional(readOnly = true)
@RequestMapping("/api")
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	// *************************************************************************
	//
	// Rest methods
	//
	// *************************************************************************

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getUsers() {
		return this.userRepository.findAll();
	}
}
