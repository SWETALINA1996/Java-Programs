package com.bridgelabz.loginregistration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.bridgelabz.loginregistration.models.User;
import com.bridgelabz.loginregistration.services.UserService;
import com.bridgelabz.loginregistration.utility.Utility;

@RestController
@RequestMapping("/LoginRegister")
@SuppressWarnings({ "rawtypes", "unchecked" })
public class LoginRegisterController
{
public static final Logger logger = LoggerFactory.getLogger(LoginRegisterController.class);
	
	@Autowired
	UserService userService;
	
	
}
