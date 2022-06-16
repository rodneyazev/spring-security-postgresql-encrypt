package com.spring.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/")
	public String Hello() {
		return "Hello World";
	}
	
	@GetMapping("/notprotected")
	public String HelloNotProtected() {
		return "Hello World Not Protected";
	}
	
	@GetMapping("/protectedByUserRole")
	public String HelloUser() {
		return "Hello World Protected By User Role";
	}
	
	@GetMapping("/protectedByAdminRole")
	public String HelloAdmin() {
		return "Hello World Protected By Admin Role";
	}
	
}
