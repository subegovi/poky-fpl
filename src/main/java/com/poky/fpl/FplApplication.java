package com.poky.fpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class FplApplication {

	public static void main(String[] args) {
		SpringApplication.run(FplApplication.class, args);
	}
}
