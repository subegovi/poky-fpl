package com.poky.fpl.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userSrvc;

	@GetMapping("/allUsers")
	public List<User> getAllUsers() {
		return userSrvc.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public Optional<User> findUserByUserid(@PathVariable Long id){
		return userSrvc.findUserById(id);
	}
}
