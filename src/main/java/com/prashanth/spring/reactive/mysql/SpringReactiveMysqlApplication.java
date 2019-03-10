package com.prashanth.spring.reactive.mysql;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Log4j2
public class SpringReactiveMysqlApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringReactiveMysqlApplication.class, args);
    }

    @Bean
    ApplicationRunner run(OrderRepository orderRepository) {
        return args -> orderRepository.findAll().subscribe(log::info);
    }
}
