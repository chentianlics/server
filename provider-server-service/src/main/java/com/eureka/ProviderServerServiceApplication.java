package com.eureka;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.eureka.provider.gener.mapper")
public class ProviderServerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderServerServiceApplication.class, args);
    }

}
