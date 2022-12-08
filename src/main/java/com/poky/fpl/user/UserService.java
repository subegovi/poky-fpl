package com.poky.fpl.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public List<User> getAllUsers() {
		List<User> userList = new ArrayList<>();
		userList = (List<User>) userRepo.findAll();
		return userList;
	}
}
