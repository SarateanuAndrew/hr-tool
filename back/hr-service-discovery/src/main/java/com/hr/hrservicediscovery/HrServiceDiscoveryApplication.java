package com.hr.hrservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HrServiceDiscoveryApplication {
    public static void main(String[] args) {
        SpringApplication.run(HrServiceDiscoveryApplication.class, args);
    }

}
