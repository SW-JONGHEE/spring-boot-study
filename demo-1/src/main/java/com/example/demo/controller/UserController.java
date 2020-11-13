package com.example.demo.controller;

import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/users")
	@ResponseStatus(code = HttpStatus.OK)
	public void postUser() {
		userService.postUserService();
	}
	
	@GetMapping("/users")
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public void getUser() {
		userService.getUserService();
	}
	
	@PutMapping("/users")
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public void putUser() {
		userService.putUserService();
	}
	
	@DeleteMapping("/users")
	@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
	public void deleteUser() {
		userService.deleteUserService();
	}
	
	
}
