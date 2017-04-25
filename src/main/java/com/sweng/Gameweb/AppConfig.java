package com.sweng.Gameweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
/**
 * Created by Abhishek on 12-04-2017.
 */
    @EnableAutoConfiguration
    @ComponentScan
    public class AppConfig {
        public static void main(String[] args)
        {
            SpringApplication.run(AppConfig.class, args);
        }
    }
