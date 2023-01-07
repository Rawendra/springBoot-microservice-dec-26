package com.example.rawendraprojectspring.exceptionHandling;

import java.time.LocalDateTime;

public class ErrorDetails {
	
	private String message;
	private String errorDescription;
	private LocalDateTime timestamp;
	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorDetails(String message, String errorDescription, LocalDateTime timestamp) {
		super();
		this.message = message;
		this.errorDescription = errorDescription;
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	

}
