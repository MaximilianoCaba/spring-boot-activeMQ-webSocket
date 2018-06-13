package com.guru.api.notification.service.impl;

import com.guru.api.notification.entity.Message;
import com.guru.api.notification.receiver.JmsReceiver;
import com.guru.api.notification.service.JmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JmsServiceImpl implements JmsService{

    @Autowired
    private JmsReceiver jmsReceiver;

    @Override
    public void jmsTopicReceiveLeadsCount(Message message) {
        jmsReceiver.sendTopic(message);
    }

    @Override
    public void jmsQueueReceiver(Message message, String queue) {
        jmsReceiver.sendQueue(message, queue);
    }
}
