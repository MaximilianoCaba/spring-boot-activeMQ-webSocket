package com.guru.api.notification.service;

import com.guru.api.notification.entity.Message;

public interface JmsService {
    
    public void jmsTopicReceiveLeadsCount(Message message);
    
    public void jmsQueueReceiver(Message message, String queue);
    
    
}
