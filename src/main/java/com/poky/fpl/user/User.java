package com.poky.fpl.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class User {

	@Id
	private Long id;
	@Column(name = "username")
	private String userName;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "middle_initial")
	private String middleInitial;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "password")
	private String password;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String phoneNumber;
	@Column(name = "verified")
	private String isVerified;
	@Column(name = "admin")
	private String isAdmin;
	@Column(name = "verification_token")
	private String verificationToken;

}
