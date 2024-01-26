package com.springboot.message.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.message.entity.Customer;

@Repository
public interface CustomerRepositiry extends JpaRepository<Customer, Long> {
	
	Optional<Customer> findByMobileNumber(Integer mobileNumber);

}
