package com.sparta.myselectshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling // 스프링 부트에서 스케줄러가 작동하게 합니다.
@EnableJpaAuditing
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class MySelectShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySelectShopApplication.class, args);
    }

}
