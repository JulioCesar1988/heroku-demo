package com.bolsadeideas.springboot.app.controllers;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FilterRegistrationBean<SessionInvalidationFilter> sessionInvalidationFilter() {
        FilterRegistrationBean<SessionInvalidationFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new SessionInvalidationFilter());
        registration.addUrlPatterns("/*");
        return registration;
    }
}

