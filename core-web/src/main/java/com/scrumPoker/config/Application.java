package com.scrumPoker.config;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class , HibernateJpaAutoConfiguration.class})
@ComponentScan(basePackages = {
        "com.scrumPoker"
})
@SpringBootApplication
@EnableJSONDoc
@PropertySources(value = {
        @PropertySource("classpath:application.properties"),
})
public class Application {

//    @Autowired
//    UserDao userDao;

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

