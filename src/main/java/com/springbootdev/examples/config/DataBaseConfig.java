package com.springbootdev.examples.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties("spring.datasource")
public class DataBaseConfig {
    private String url;
    private String username;
    private String password;
}
