package com.longgood.cmyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,scanBasePackages = "com.longgood.cmyx")
public class CmyxApplication {
    public static void main(String[] args) {

        SpringApplication.run(CmyxApplication.class, args);
    }

}
