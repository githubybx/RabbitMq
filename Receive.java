package com.example.demo.RabbitMq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Receive {
    public static final Logger logger = LoggerFactory.getLogger(Receive.class);
    @Autowired
    AmqpTemplate amqpTemplate;
    @RabbitListener(queues = MQConfig.queue)
    public void receive(String str){
        logger.info("消息队列得到的信息是:" + str);
    }
    @RabbitListener(queues = MQConfig.queue1)
    public void receive(String str1, String str2) {
        Logger logger = LoggerFactory.getLogger(Receive.class);
        logger.info(str1 + "lala" + str2);
    }
}
