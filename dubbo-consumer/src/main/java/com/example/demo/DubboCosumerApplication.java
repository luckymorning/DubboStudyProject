package com.example.demo;

import org.apache.dubbo.spring.boot.autoconfigure.DubboAutoConfiguration;
import org.apache.dubbo.spring.boot.autoconfigure.DubboRelaxedBinding2AutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * DubboCosumerApplication
 *
 *
 * @author lucky_morning
 * @group com.example.demo
 * @date 2020/8/21 15:58
 */
@SpringBootApplication
public class DubboCosumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboCosumerApplication.class, args);
    }

}
