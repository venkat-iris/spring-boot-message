package com.springboot.message.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.message.services.AsiaContServices;

//import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("asia")
public class AsianController {
	
	@Autowired
	private AsiaContServices services;
	
	
	//@ApiOperation(value = "say hi..", notes="say hi to Asian controllers")
	@GetMapping("/say")
	public ResponseEntity<String> sayWelcome(){
		return new ResponseEntity<String>("welcome to cloud", HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/uni")
	public ResponseEntity<Object> getUniDetails() {
		return new ResponseEntity<Object>(services.consumeRestService(),HttpStatus.ACCEPTED);
	}

}
