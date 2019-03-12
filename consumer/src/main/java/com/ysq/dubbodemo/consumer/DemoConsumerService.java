package com.ysq.dubbodemo.consumer;

import com.ysq.dubbodemo.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class DemoConsumerService {

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}
