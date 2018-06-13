package com.guru.api.notification.receiver.impl;

import com.guru.api.notification.entity.Message;
import com.guru.api.notification.receiver.JmsReceiver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsReceiverImpl implements JmsReceiver {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public void sendTopic(Message message){
        jmsTemplate.convertAndSend(message.getMessageType().getTopic(), message.toJson());
    }

    @Override
    public void sendQueue(Message message, String queue){
        jmsTemplate.convertAndSend(queue, message.toJson());
    }
}
