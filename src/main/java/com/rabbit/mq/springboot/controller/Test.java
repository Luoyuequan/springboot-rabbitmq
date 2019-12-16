package com.rabbit.mq.springboot.controller;

import com.rabbit.mq.springboot.sender.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luoyuequan
 * @time 2019/12/4 14:32
 */
@RestController
public class Test {
    @Autowired
    HelloSender helloSender;

    @RequestMapping
    public void test() {
        helloSender.send("luo");
    }
}
