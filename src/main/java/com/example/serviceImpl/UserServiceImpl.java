package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserRepository;
import com.example.model.User;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository repository;

	@Override
	public List<User> getAllUserInfo() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}
