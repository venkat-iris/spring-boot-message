package com.springboot.message.mapper;

import java.util.Random;
import java.util.random.RandomGenerator;

import com.springboot.message.dto.AccountsDTO;
import com.springboot.message.entity.Accounts;

public class AccountMapper {
	
	public static Accounts mapToAccount(AccountsDTO dto, Accounts acnt) {
		
		acnt.setAccountType(dto.getAccountType());
		acnt.setBranchAddress(dto.getBranchAddress());
		//acnt.setAccountNumber(100000000000l + new Random().nextLong(999999999999l));
		
		return acnt;
	}
	
	public static AccountsDTO mapToAccountsDTO(Accounts accnt, AccountsDTO dto) {
		
		dto.setAccountNumber(accnt.getAccountNumber());
		dto.setAccountType(accnt.getAccountType());
		dto.setBranchAddress(accnt.getBranchAddress());
		return dto;
	}

}
