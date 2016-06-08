package com.boom.base.web.job;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by jiangshan on 16/5/6.
 */
@Component
public class InitJob3 implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /**
         * 如果命令行的样式是
         * java -jar boom-spring-boot-0.0.1-SNAPSHOT.jar --spring.one=one --spirng.two=two spring.three=three
         * 这里的args指的是 spring.three=three
         */
        String message = "";
        for (String arg : args.getNonOptionArgs()) {
            message += arg + " ";
        }
        /**
         * 这里Logger不起作用
         */
        System.out.println("InitJob3: " + message);
    }
}
