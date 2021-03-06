package com.hotbev.soup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@EnableJpaRepositories
public class SoupApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoupApplication.class, args);
    }

}
