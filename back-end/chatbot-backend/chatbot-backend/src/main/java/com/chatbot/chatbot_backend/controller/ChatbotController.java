package com.chatbot.chatbot_backend.controller;

import com.chatbot.chatbot_backend.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chatbot")
public class ChatbotController {

    @Autowired
    private ResponseService responseService;

    @PostMapping("/ask")
    public String askQuestion(@RequestBody String query) {
        return responseService.getResponse(query);
    }
}