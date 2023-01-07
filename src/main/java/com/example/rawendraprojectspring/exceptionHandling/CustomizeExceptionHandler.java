package com.example.rawendraprojectspring.exceptionHandling;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizeExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) throws Exception{
		
		ErrorDetails err= new ErrorDetails(ex.getMessage(), request.getDescription(false), LocalDateTime.now());
		
		return new ResponseEntity(err, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
