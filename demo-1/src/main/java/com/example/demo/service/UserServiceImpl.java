package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void postUserService() {
		
	}

	@Override
	public void getUserService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void putUserService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserService() {
		// TODO Auto-generated method stub
		
	}

}
