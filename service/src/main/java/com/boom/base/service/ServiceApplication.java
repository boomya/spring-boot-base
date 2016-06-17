package com.boom.base.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.concurrent.CountDownLatch;

/**
 * Created by jiangshan on 16/6/7.
 */
@SpringBootApplication
@ComponentScan("com.boom.base")
public class ServiceApplication {

    private static final Logger logger = LoggerFactory.getLogger(ServiceApplication.class);

    @Bean
    public CountDownLatch closeLatch() {
        return new CountDownLatch(1);
    }

    //    public static void main(String[] args) throws Exception {
//        SpringApplication.run(ServiceApplication.class, args);
//    }
//
//    @Override
//    public void run(String... strings) throws Exception {
//    }
    public static void main(String[] args) throws InterruptedException {

        ApplicationContext ctx = new SpringApplicationBuilder()
                .sources(ServiceApplication.class)
                .web(false)
                .run(args);

        logger.info("项目启动!");

        CountDownLatch closeLatch = ctx.getBean(CountDownLatch.class);
        closeLatch.await();
    }
}
