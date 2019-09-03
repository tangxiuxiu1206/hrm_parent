package com.txx.hrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.txx.hrm.mapper")
public class CourseService9002Application {
    public static void main(String[] args) {
        SpringApplication.run(CourseService9002Application.class,args);
    }
}
