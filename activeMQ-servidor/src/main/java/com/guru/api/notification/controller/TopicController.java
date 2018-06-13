package com.guru.api.notification.controller;

import com.guru.api.notification.entity.Message;
import com.guru.api.notification.service.JmsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topic")
@Api(value="topic", description="operaciones disponibles para la inserción de topic")
public class TopicController {
	
	@Autowired
	private JmsService jmsService;
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	@ApiOperation(value = "agrega un nuevo mensaje a un topic especifico", response = String.class)
	public String produce(@RequestBody Message message){
		jmsService.jmsTopicReceiveLeadsCount(message);
		return "Done";
	}


}
