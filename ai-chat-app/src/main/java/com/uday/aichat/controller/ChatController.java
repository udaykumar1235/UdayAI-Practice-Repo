package com.uday.aichat.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uday.aichat.dto.ChatRequest;
import com.uday.aichat.service.ChatService;

import jakarta.validation.Valid;

@RestController
public class ChatController {
	
	private final ChatService chatService;

	public ChatController(ChatService chatService) {
		this.chatService = chatService;
	}
	
	
	@PostMapping("/api/chat")
	public String chat(@Valid @RequestBody ChatRequest request) {
		
		return chatService.processMessage(request.getMessage());
	}

}
