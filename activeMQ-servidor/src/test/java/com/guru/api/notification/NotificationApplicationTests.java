package com.guru.api.notification;

import com.guru.api.notification.configuration.NotificationApplication;
import com.guru.api.notification.entity.Message;
import com.guru.api.notification.enums.CountryEnum;
import com.guru.api.notification.enums.MessageTypeEnum;
import com.guru.api.notification.receiver.JmsReceiver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NotificationApplication.class)
public class NotificationApplicationTests {

    @Autowired
    private JmsReceiver jmsReceiver;

    @Autowired
    private JmsTemplate jmsTemplate;

    @Test
    public void addNewObjectTopic_validObject_getLastObjectByTopic() {

        Message message = new Message();
        message.setMessageType(MessageTypeEnum.COUNT_NEW_LEADS);
        message.setAccountId("12345678");
        message.setCountryType(CountryEnum.AR);
        message.setMessage("20");

        Message message2 = new Message();
        message2.setMessageType(MessageTypeEnum.COUNT_NEW_LEADS);
        message2.setAccountId("87654321");
        message.setCountryType(CountryEnum.PE);
        message2.setMessage("10");

        this.jmsReceiver.sendTopic(message);
        this.jmsReceiver.sendTopic(message2);

        Message messageResponse = (Message) this.jmsTemplate.receiveAndConvert(MessageTypeEnum.COUNT_NEW_LEADS.getTopic());
        assertEquals(message.getAccountId(), messageResponse.getAccountId());

        Message messageResponse2 = (Message) this.jmsTemplate.receiveAndConvert(MessageTypeEnum.COUNT_NEW_LEADS.getTopic());
        assertEquals(message2.getAccountId(), messageResponse2.getAccountId());

    }

}
