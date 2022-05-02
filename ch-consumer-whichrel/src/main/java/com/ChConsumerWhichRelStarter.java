package com;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 消费方
@EnableDubbo
@SpringBootApplication
public class ChConsumerWhichRelStarter {

    public static void main(String[] args) {
        //
        SpringApplication.run(ChConsumerWhichRelStarter.class, args);
    }

}
