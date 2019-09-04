package com.mucahit.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mucahit.Service.UserService;
import com.mucahit.entity.Departmant;
import com.mucahit.entity.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/login")
public class LoginController {

	public UserService userService;

	public LoginController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(path = "/accessUser", consumes = "application/json", produces = "application/json")
	public ResponseEntity accessUser(@RequestBody User user) {
		System.out.println("access called");

		System.out.println(user.toString());

		return new ResponseEntity(userService.accessUser(user.getKullanici_adi(), user.getParola()), HttpStatus.OK);

	}

	@PostMapping(path = "/updatehata", consumes = "application/json", produces = "application/json")
	public ResponseEntity update(@RequestBody User user) {
		System.out.println("updatehata called");
		System.out.println(user.toString());
		userService.updatehata(user);
		return new ResponseEntity(HttpStatus.OK);

	}
	/*@GetMapping(path = "/updateblok", consumes = "application/json", produces = "application/json")
	public ResponseEntity updateblok(@RequestBody User user) {
		System.out.println("updateblok called");
		System.out.println(user.toString());
		
		return new ResponseEntity(userService.updateblok(user.getBlok_tarih()),HttpStatus.OK);

	}
	*/
	
}
