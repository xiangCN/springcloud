package com.seeworld.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @PackageName com.seeworld.springcloud.controller
 * @Author xiangxiang
 * @Time 2021-01-04 19:21
 */

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String home() {
        return "Hello world";
    }
}
