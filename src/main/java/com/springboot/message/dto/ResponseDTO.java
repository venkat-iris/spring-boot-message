package com.springboot.message.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class ResponseDTO {

	//private String api;
	
	private String statusCode;
	
	private String statusMessage;
}
