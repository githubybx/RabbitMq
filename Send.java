package com.example.demo.RabbitMq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Send {
    @Autowired
    AmqpTemplate amqpTemplate;
    public void sendSth(String str){
        amqpTemplate.convertAndSend(MQConfig.queue1, str);
    }
    public void sendSth1(String str2,String str1){
        amqpTemplate.convertAndSend(MQConfig.queue1,str1);
        amqpTemplate.convertAndSend(MQConfig.queue1,str2);
    }
}
