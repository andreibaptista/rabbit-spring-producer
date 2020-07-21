package com.andrei.spring.producer.service;

import com.andrei.spring.producer.dto.Message;

public interface AmqpService {

    void sendToConsumer(Message message);
}
