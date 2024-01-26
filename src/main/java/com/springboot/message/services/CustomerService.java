package com.springboot.message.services;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.springboot.message.constants.CustomerConstants;
import com.springboot.message.dao.AccountsRepository;
import com.springboot.message.dao.CustomerRepositiry;
import com.springboot.message.dto.CustomerDTO;
import com.springboot.message.entity.Accounts;
import com.springboot.message.entity.Customer;
import com.springboot.message.exceptions.CustomerAllReadyExistException;
import com.springboot.message.mapper.CustomerMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService implements ICustomerService {

	private AccountsRepository aRepo;
	private CustomerRepositiry cRepo;
	
	
	public void saveCustRecord(CustomerDTO dto) {
		
		Customer customer = CustomerMapper.mapToCustomer(dto, new Customer());
		Optional<Customer> mobileStatus = cRepo.findByMobileNumber(customer.getMobileNumber());
		if(mobileStatus.isPresent()) {
			throw new CustomerAllReadyExistException("Customer Allready Exist with mobile number : " + customer.getMobileNumber().toString());
		}
		
		customer.setCreatedAt(LocalDate.now());
		customer.setCreatedBy("Venkat");
		Customer cust = cRepo.save(customer);
		Accounts accnt = mapCustTOAccount(cust, new Accounts());
		aRepo.save(accnt);
		
	}
	
	private Accounts mapCustTOAccount(Customer cust,Accounts accnt) {
		
		accnt.setCustomerId(cust.getCustomerId());
		accnt.setAccountType(CustomerConstants.SAVINGS);
		accnt.setBranchAddress(CustomerConstants.BRANCHADDRESS);
		accnt.setAccountNumber(100000000000l + new Random().nextLong(999999999999l));
		accnt.setCreatedAt(LocalDate.now());
		accnt.setCreatedBy("venkat");
		return accnt;
	}
}
