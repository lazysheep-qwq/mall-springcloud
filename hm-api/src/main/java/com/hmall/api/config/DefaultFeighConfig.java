package com.hmall.api.config;

import feign.Feign;
import feign.Logger;
import org.springframework.context.annotation.Bean;

public class DefaultFeighConfig {
    @Bean
    public Logger.Level feighLoggerLevel() {
        return Logger.Level.FULL;
    }
}
