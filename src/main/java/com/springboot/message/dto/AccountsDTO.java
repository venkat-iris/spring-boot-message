package com.springboot.message.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class AccountsDTO {

	@NotNull(message="Name should not be null")
	private Long accountNumber;
	
	@NotNull(message="Name should not be null")
	private String accountType;
	@NotNull(message="Name should not be null")
	private String branchAddress;
}
