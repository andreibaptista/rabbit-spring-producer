package com.andrei.spring.producer.api;

import com.andrei.spring.producer.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.andrei.spring.producer.service.AmqpService;

@RestController
public class AmqpAPI {

    @Autowired
    private AmqpService service;


    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping("/send")
    public void sendToConsumer(@RequestBody Message message) {
        service.sendToConsumer(message);
    }
}
