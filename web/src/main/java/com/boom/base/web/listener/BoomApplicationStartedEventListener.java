package com.boom.base.web.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * ApplicationStartedEvent：spring boot启动开始时执行的事件
 */
public class BoomApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {

    private static Logger logger = LoggerFactory.getLogger(BoomApplicationStartedEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        /**
         * 在该事件中可以获取到SpringApplication对象，可做一些执行前的设置. 比如banner
         * 执行到这一时刻, Logger Provider还没有初始化, 所以logger.info没有任何的作用
         */
        SpringApplication app = applicationStartedEvent.getSpringApplication();
        logger.info("==BoomApplicationStartedEventListener==");
        System.out.println("System---==BoomApplicationStartedEventListener==");
    }
}
