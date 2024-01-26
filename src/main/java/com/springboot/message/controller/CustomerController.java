package com.springboot.message.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.message.constants.CustomerConstants;
import com.springboot.message.dto.CustomerDTO;
import com.springboot.message.dto.ResponseDTO;
import com.springboot.message.services.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/cust", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	
	@PostMapping("/record")
	public ResponseEntity<ResponseDTO> saveCustomer(@Valid @RequestBody CustomerDTO customer){
		
		service.saveCustRecord(customer);
		return new ResponseEntity<ResponseDTO>(new ResponseDTO(CustomerConstants.STATUS_201,CustomerConstants.MESSAGE_201), HttpStatus.CREATED);
		
	}
}
