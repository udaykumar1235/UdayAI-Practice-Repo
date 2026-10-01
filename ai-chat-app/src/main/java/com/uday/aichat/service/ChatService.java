package com.uday.aichat.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
	
	private final ChatClient chatClient;

	public ChatService(ChatClient.Builder builder) {
		this.chatClient = builder.build();
	}
	
	//Live response test
 /*	public String processMessage(String message) {
		
		return chatClient.prompt().user(message).call().content();
	} */
	
	//Mock response code test
    public String processMessage(String message) {

        // Temporary mock response for testing
        return "Mock AI Response: I received your message - " + message;
    }


}
