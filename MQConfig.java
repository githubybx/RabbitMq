package com.example.demo.RabbitMq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




@Configuration
public class MQConfig {
    public static final String queue1 = "QUEUE1";
    public static final String queue2 = "Queue2";
    public static final String Exchange = "topicExchange";
    public static final String key1 = "key1";
    public static final String key2 = "key2";
    @Bean
    public Queue getQueue1() {
        //名称，是否持久化
        return new Queue(queue1,true);
    }
    @Bean
    public static Queue getQueue2(){
        return new Queue(queue2, true);
    }
    @Bean
    public TopicExchange getTopicExchange(){
        return new TopicExchange(Exchange);
    }
    @Bean
    public Binding bind1(){
        return BindingBuilder.bind(getQueue1()).to(getTopicExchange()).with(key1);
    }
    @Bean
    public Binding bind2(){
        return BindingBuilder.bind(getQueue2()).to(getTopicExchange()).with(key2);
    }
}
