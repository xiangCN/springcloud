package com.seeworld.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @PackageName com.seeworld.springcloud.controller
 * @Author xiangxiang
 * @Time 2021-01-04 19:21
 */

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello world";
    }

}
