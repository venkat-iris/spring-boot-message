package com.springboot.message.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class ErrorMessage {

	private String pathAPI;
	private String errorCode;
	private String errorMessage;
	private LocalDateTime errorDateTime;
	
}
