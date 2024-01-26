package com.springboot.message.exceptions;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.springboot.message.dto.ErrorMessage;

@ControllerAdvice
public class GlobleExceptionHandler extends ResponseEntityExceptionHandler {
	
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		
			Map<String,String> errorMessages = new HashMap<String,String>();
			
			List<ObjectError> listErrors = ex.getBindingResult().getAllErrors();
			
			//for(ObjectError err : listErrors) {
			//	errorMessages.put( err.getCode(),err.getDefaultMessage() );
			//}
			
			listErrors.forEach((error)-> {
				errorMessages.put(((FieldError)error).getField(),error.getDefaultMessage());
			});
		
		return new ResponseEntity<Object>(errorMessages,HttpStatus.BAD_REQUEST);
	}
	
	
	
	
	
	
	// which is globle runtime exception handling
	@ExceptionHandler(Exception.class)
	ResponseEntity<ErrorMessage> handleCustomerExceptions (Exception exception, WebRequest request) {
		
		ErrorMessage msg = new ErrorMessage(request.getDescription(false),exception.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR.toString(),LocalDateTime.now());
		return new ResponseEntity<ErrorMessage>(msg,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	// Implementing custom business exception handling
	@ExceptionHandler(CustomerAllReadyExistException.class)
	ResponseEntity<ErrorMessage> handleCustomerExceptions (CustomerAllReadyExistException exception, WebRequest request) {
		
		ErrorMessage msg = new ErrorMessage(request.getDescription(false),exception.getMessage(),HttpStatus.BAD_REQUEST.toString(),LocalDateTime.now());
		return new ResponseEntity<ErrorMessage>(msg,HttpStatus.BAD_REQUEST);
		
	}

	
}
