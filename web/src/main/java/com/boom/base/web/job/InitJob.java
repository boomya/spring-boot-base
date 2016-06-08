package com.boom.base.web.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by jiangshan on 16/5/4.
 */
@Component
@Order(1)  //设置Runner的启动顺序
public class InitJob implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(InitJob.class);

    private
    @Value("${server.id:0}")
    int    id;
    private
    @Value("${server.name}")
    String serverName;

    @Override
    public void run(String... args) throws Exception {
        /**
         * 如果命令行的样式是
         * java -jar boom-spring-boot-0.0.1-SNAPSHOT.jar --spring.one=one --spirng.two=two spring.three=three
         * 这里的args指的是 --spring.one=one --spirng.two=two spring.three=three
         */
        String message = "";
        for (String arg : args) {
            message += arg + " ";
        }
        /**
         * 这里Logger不起作用
         */
        System.out.println("InitJob: " + message);
        System.out.println("ServerConfig: id:" + id + " serverName:" + serverName);
    }

}
