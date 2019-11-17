package com.example.demo.configuration;

import com.github.alperkurtul.firebaseuserauthentication.service.UserAuthenticationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {

    @Bean
    public UserAuthenticationServiceImpl userAuthenticationServiceImpl() {
        return new UserAuthenticationServiceImpl();
    };

}
