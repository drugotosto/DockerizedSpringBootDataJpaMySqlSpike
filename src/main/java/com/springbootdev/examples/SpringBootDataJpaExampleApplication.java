package com.springbootdev.examples;

import com.springbootdev.examples.config.DataBaseConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class SpringBootDataJpaExampleApplication implements CommandLineRunner
{
    private final Environment env;

    private final DataBaseConfig databaseConfig;

    @Autowired
    public SpringBootDataJpaExampleApplication(Environment env, DataBaseConfig databaseConfig) {
        this.env = env;
        this.databaseConfig = databaseConfig;
    }

    public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaExampleApplication.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        log.warn("I profili attivi sono: "+ Arrays.toString(env.getActiveProfiles()));
        log.warn("Database Configuration - URL: " + databaseConfig.getUrl());
        log.warn("Database Configuration - Username: " + databaseConfig.getUsername());
        log.warn("Database Configuration - Password: " + databaseConfig.getPassword());
    }
}
