package com.csye6225HW1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class EncodeConfig {


    @Bean
    public BCryptPasswordEncoder PwdEncoder() {
        return new BCryptPasswordEncoder();
    }


}
