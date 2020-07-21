package com.andrei.spring.producer.service.impl;

import com.andrei.spring.producer.amqp.AmqpProducer;
import com.andrei.spring.producer.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.andrei.spring.producer.service.AmqpService;


@Service
public class RabbitMQService implements AmqpService {

    @Autowired
    private AmqpProducer<Message> amqp;

    @Override
    public void sendToConsumer(Message message) {
        amqp.producer(message);
    }
}
