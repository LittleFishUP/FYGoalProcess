package com.dxc.activitidemo.performanceprocess;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = {
        SecurityAutoConfiguration.class,
})
@EnableTransactionManagement
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan(value = "com.example.demoactiviti.dao")
public class PerformanceprocessApplication {

    public static void main(String[] args) {
        SpringApplication.run(PerformanceprocessApplication.class, args);
    }

}
