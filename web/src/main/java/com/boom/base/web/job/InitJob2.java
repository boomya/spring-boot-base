package com.boom.base.web.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by jiangshan on 16/5/4.
 */
@Component
@Order(2)
public class InitJob2 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        String message = "";
        for (String arg : args) {
            message += arg + " ";
        }
        /**
         * 这里Logger不起作用
         */
        System.out.println("InitJob2:" + message);

    }

}
