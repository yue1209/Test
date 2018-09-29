package com.test.jpa;

import antlr.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        boolean empty = org.springframework.util.StringUtils.isEmpty("1");
       System.out.println(empty);
        SpringApplication.run(JpaApplication.class, args);
    }
}
