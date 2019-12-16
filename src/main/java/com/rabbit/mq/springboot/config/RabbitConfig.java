package com.rabbit.mq.springboot.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author luoyuequan
 * @time 2019/12/4 14:26
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }

    @Bean
    public Queue neoQueue() {
        return new Queue("test");
    }

    @Bean
    public Queue objectQueue() {
        return new Queue("luo");
    }

    @Bean
    public Queue mailQueue() {
        return new Queue("mailQueue");
    }
}
