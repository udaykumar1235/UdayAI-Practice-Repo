package com.uday.aichat.dto;

import jakarta.validation.constraints.NotBlank;

public class ChatRequest {
	
	@NotBlank(message = "Message Cannot be Empty...")
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
