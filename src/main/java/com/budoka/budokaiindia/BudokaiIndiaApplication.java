package com.budoka.budokaiindia;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class BudokaiIndiaApplication {

    public static void main(String[] args) {
        log.error("Hello World");
        SpringApplication.run(BudokaiIndiaApplication.class, args);
    }
}
