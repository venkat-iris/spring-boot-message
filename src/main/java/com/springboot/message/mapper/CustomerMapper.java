package com.springboot.message.mapper;

import com.springboot.message.dto.CustomerDTO;
import com.springboot.message.entity.Customer;

public class CustomerMapper {

	
	public static Customer mapToCustomer(CustomerDTO dto, Customer cust) {
		cust.setName(dto.getName());
		cust.setEmail(dto.getEmail());
		cust.setMobileNumber(dto.getMobileNumber());
		
		return cust;
	}
	
	public static CustomerDTO mapToCustomerDTO(Customer cust, CustomerDTO dto) {
		
		dto.setName(cust.getName());
		dto.setEmail(cust.getEmail());
		dto.setMobileNumber(cust.getMobileNumber());
		
		return dto;
	}

}
