package com.example.test_hibernate.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.TestPostgresService;

@Configuration
public class Config {

    @Bean
    public TestPostgresService testPostgresService(){
        return new TestPostgresService();
    }

}
