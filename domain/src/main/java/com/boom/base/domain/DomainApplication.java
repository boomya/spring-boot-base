package com.boom.base.domain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by jiangshan on 16/6/7.
 */
@SpringBootApplication
public class DomainApplication implements CommandLineRunner {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DomainApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
    }
}
