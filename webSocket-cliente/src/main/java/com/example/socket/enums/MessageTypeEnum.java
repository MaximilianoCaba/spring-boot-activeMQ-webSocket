package com.example.socket.enums;


import static com.example.socket.config.StaticValues.API_LEADS;
import static com.example.socket.config.StaticValues.TOPIC_NOTIFICATION_COUNT_LEADS;

public enum MessageTypeEnum {

    COUNT_NEW_LEADS(1, API_LEADS, TOPIC_NOTIFICATION_COUNT_LEADS);

    private int id;
    private String type;
    private String topic;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopi(String topicQueue) {
        this.topic = topicQueue;
    }

    MessageTypeEnum(int id, String type, String topic) {
        this.id = id;
        this.type = type;
        this.topic = topic;
    }
}
