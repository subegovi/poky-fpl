package com.poky.fpl.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userSrvc;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		List<User> userList = userSrvc.getAllUsers();
		System.out.println(userList.get(0));
		return userList;
	}
}
