package com.uwjx.examplespringbootrediscache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ExampleSpringBootRedisCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleSpringBootRedisCacheApplication.class, args);
    }

}
