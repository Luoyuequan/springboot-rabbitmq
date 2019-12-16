package com.rabbit.mq.springboot.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String content) {
//		String context = "hello " + new Date();
//		System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", content);
    }

}