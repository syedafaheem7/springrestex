package com.ny.queenscollege.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@GetMapping("/fetch")
	public ResponseEntity<String> fetchEmployee(){
		ResponseEntity<String> response = new ResponseEntity<String>(
				                                                   "hello from fetch",       //body
				                                                    HttpStatus.OK);          //status
		return response;
		
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> createEmpolyee(){
		ResponseEntity<String> response = new ResponseEntity<String>(
				"hello from create",
				HttpStatus.OK);
		return response;
	}
}

