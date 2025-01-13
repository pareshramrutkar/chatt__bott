package com.chatbot.chatbot_backend.service;

import org.springframework.stereotype.Service;

@Service
public class ResponseService {

    public String getResponse(String query) {
        if (query.toLowerCase().contains("how do i set up")) {
            return "Here are the steps to set up a new source in Segment...";
        } else if (query.toLowerCase().contains("compare segment and lytics")) {
            return "Segment's audience creation is event-based, while Lytics uses attributes...";
        }
        return "Sorry, I couldn't find an answer for that. Please try asking another question.";
    }
}