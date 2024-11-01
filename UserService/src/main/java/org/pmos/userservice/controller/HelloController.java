package org.pmos.userservice.controller;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ALL
 * @date 2024/5/19
 * @Description
 */
@RestController
@RequestMapping("/Hello")
public class HelloController {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;
    public void sendMQ() {
        Message<String> build = MessageBuilder.withPayload("123").build();
        rocketMQTemplate.send("test-topic", build);
    }
    @GetMapping
    public String test(){
        sendMQ();
        return "hello,world";
    }
}
