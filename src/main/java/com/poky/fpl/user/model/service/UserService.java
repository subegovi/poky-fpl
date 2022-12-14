package com.poky.fpl.user.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poky.fpl.user.model.User;
import com.poky.fpl.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public List<User> getAllUsers() {
		return (List<User>) userRepo.findAll();
	}
	
	public Optional<User> findUserById(Long id) {
		return userRepo.findById(id);
	}
}
