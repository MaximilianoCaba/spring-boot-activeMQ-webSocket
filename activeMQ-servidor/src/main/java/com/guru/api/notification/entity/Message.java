package com.guru.api.notification.entity;

import com.guru.api.notification.enums.CountryEnum;
import com.guru.api.notification.enums.MessageTypeEnum;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class Message implements Serializable{

    @ApiModelProperty(notes = "Numero de cuenta del usuario")
    private String accountId;

    @ApiModelProperty(notes = "Numero de pais del usuario")
    private CountryEnum countryType;

    @ApiModelProperty(notes = "Tipo de mensaje enviado")
    private MessageTypeEnum messageType;

    @ApiModelProperty(notes = "Mensaje")
    private String message;

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

    public void setCountryType(CountryEnum countryId) {
        this.countryType = countryId;
    }

    public Message() {
    }

    public String toJson() {
        return String.format("{\"accountId\":\"%s\", \"countryType\":\"%s\", \"messageType\":\"%s\", \"message\":\"%s\"}", getAccountId(), getCountryType(), getMessageType(), getMessage());
    }
}
