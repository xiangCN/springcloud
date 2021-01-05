//package com.seeworld.springcloud.config;
//
//import org.springframework.cloud.client.circuitbreaker.Customizer;
//import org.springframework.cloud.netflix.hystrix.HystrixCircuitBreakerFactory;
//import org.springframework.cloud.netflix.hystrix.ReactiveHystrixCircuitBreakerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @PackageName com.seeworld.springcloud.config
// * @Author xiangxiang
// * @Time 2021-01-05 9:47
// */
//
//@Configuration
//public class Hystrix {
//
//    @Bean
//    public Customizer<HystrixCircuitBreakerFactory> defaultConfig() {
//        return factory -> factory.configureDefault(id -> HystrixCommand.Setter
//                .withGroupKey(HystrixCommandGroupKey.Factory.asKey(id))
//                .andCommandPropertiesDefaults(HystrixCommandProperties.Setter()
//                        .withExecutionTimeoutInMilliseconds(4000)));
//    }
//
//    @Bean
//    public Customizer<ReactiveHystrixCircuitBreakerFactory> defaultConfig() {
//        return factory -> factory.configureDefault(id -> HystrixObservableCommand.Setter
//                .withGroupKey(HystrixCommandGroupKey.Factory.asKey(id))
//                .andCommandPropertiesDefaults(HystrixCommandProperties.Setter()
//                        .withExecutionTimeoutInMilliseconds(4000)));
//    }
//}
