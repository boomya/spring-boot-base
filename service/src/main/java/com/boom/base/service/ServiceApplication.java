package com.boom.base.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by jiangshan on 16/6/7.
 */
@SpringBootApplication
public class ServiceApplication implements CommandLineRunner {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServiceApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
    }
}
