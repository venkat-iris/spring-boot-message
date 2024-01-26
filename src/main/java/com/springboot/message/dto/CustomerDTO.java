package com.springboot.message.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class CustomerDTO {
	
	
	@NotNull(message="Name should not be null")
	@Length(min=2, max=7, message="Name length should between 2 to 7 chars")
	private String name;
	
	@NotNull(message="email should not be null")
	@Email(message="email should follw proper format")
	private String email;
	
	@NotNull
	@Pattern(regexp = "")
	private Integer mobileNumber;

	
	
}
