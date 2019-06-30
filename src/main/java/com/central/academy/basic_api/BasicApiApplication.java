package com.central.academy.basic_api;

import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@SpringBootApplication
public class BasicApiApplication implements CommandLineRunner {

    //private static Logger LOG=Logger.getLogger(BasicApiApplication.class);
    private static Logger LOG=Logger.

    public static void main(String[] args) {
        SpringApplication.run(BasicApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("Saludos desde el main");
    }
}
