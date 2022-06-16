package com.spring.app;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncodePassword {

	public static void main(String[] args) {
		String password = "dev";
		BCryptPasswordEncoder passwordEnconder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEnconder.encode(password);
		
		System.out.println(hashedPassword);
		password = "admin";
		
		hashedPassword = passwordEnconder.encode(password);
		System.out.println(hashedPassword);

	}

}
