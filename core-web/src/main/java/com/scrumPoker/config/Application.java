package com.scrumPoker.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Main Spring Boot class to configure application.
 * @author Maxim Korkuts
 */
@Configuration
@SpringBootApplication
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = {"com.scrumPoker.service"})
@EnableJpaRepositories(basePackages = {"com.scrumPoker.dao"})
@EntityScan(basePackages = {"com.scrumPoker.domain"})
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

