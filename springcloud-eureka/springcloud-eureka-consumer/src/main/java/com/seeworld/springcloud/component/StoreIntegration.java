package com.seeworld.springcloud.component;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @PackageName com.seeworld.springcloud.component
 * @Author xiangxiang
 * @Time 2021-01-05 16:52
 */
@Component
public class StoreIntegration {
//    @HystrixCommand(fallbackMethod = "defaultStores")
//    public Object getStores(Map<String, Object> parameters) {
//        //do stuff that might fail
//    }

    public Object defaultStores(Map<String, Object> parameters) {
        return null;
    }
}
