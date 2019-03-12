package com.ysq.dubbodemo.consumer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private DemoConsumerService demoConsumerService;

    @RequestMapping("/hi")
    public String sayHello(@RequestParam String name) {
        return demoConsumerService.sayHello(name);
    }

}
