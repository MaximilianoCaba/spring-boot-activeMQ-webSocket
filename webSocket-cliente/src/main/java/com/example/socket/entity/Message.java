package com.example.socket.entity;
import com.example.socket.enums.CountryEnum;
import com.example.socket.enums.MessageTypeEnum;

import java.io.Serializable;

public class Message implements Serializable{

    private MessageTypeEnum messageType;
    private String message;
    private String accountId;
    private CountryEnum countryType;

    public MessageTypeEnum getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public CountryEnum getCountryType() {
        return countryType;
    }

    public void setCountryType(CountryEnum countryEnum) {
        this.countryType = countryEnum;
    }
}
