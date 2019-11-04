package com.example.demo.RabbitMq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test11 {
    @Autowired
    Send send;
    @RequestMapping("/RabbitMq")
    @ResponseBody
    public String getSth(){
        send.sendSth1("你好安逸","这不是一个好的选择");
        return "成功了吧RabbitMq";
    }
}
