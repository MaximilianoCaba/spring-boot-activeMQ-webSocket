package com.example.socket.controller;

import com.example.socket.entity.Message;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class MessageController {

    @Autowired
    private SimpMessagingTemplate template;

    @JmsListener(destination = "notificationCountLead")
    @MessageMapping("/apiNotification")
    public void guestMessage(String messageJson) throws IOException {
        System.out.println("Received message: " + messageJson);
        ObjectMapper m = new ObjectMapper();
        Message message = m.readValue(messageJson, new TypeReference<Message>() {});
        this.template.convertAndSend("/queue/"+ message.getAccountId() + "/" + message.getCountryType().getCode(), messageJson);
    }

}
