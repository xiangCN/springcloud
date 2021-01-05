package com.seeworld.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @PackageName com.seeworld.springcloud.controller
 * @Author xiangxiang
 * @Time 2021-01-05 9:08
 */

@RestController
public class SpringDiscoverySample {
    @Autowired
    private DiscoveryClient discoveryClient;

    public List<ServiceInstance> serviceUrl() {
        return discoveryClient.getInstances("provider");
    }

    @RequestMapping("/clientList")
    public List<ServiceInstance> getClientList() {
        return serviceUrl();
    }
}
