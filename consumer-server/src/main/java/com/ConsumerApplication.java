package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 微服务底座平台
 * @version 2.0.0
 * @title: SkywalkingConsumerApplication
 * @projectName: erukeribbon
 * @description: entrance
 * @date: 2022-08-30 14:06
 **/
@EnableFeignClients(basePackages = "com")
@SpringBootApplication(scanBasePackages = "com")
@EnableDiscoveryClient
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
