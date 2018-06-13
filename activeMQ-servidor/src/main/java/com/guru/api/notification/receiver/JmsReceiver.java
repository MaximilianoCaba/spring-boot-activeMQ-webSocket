package com.guru.api.notification.receiver;

import com.guru.api.notification.entity.Message;

public interface JmsReceiver {

    public void sendTopic(Message message);

    public void sendQueue(Message message, String queue);
}
