package com.soupbun.soupbunapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.soupbun.soupbunapi.mapper")
public class SoupbunApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoupbunApiApplication.class, args);
    }

}
