package com.boom.base.web.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * ApplicationFailedEvent:spring boot启动异常时执行事件
 */
public class BoomApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {

    private static Logger logger = LoggerFactory.getLogger(BoomApplicationFailedEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationFailedEvent applicationFailedEvent) {
        logger.info("=== BoomApplicationFailedEventListener ===");
        Throwable throwable = applicationFailedEvent.getException();
        handleThrowable(throwable);
    }

    private void handleThrowable(Throwable throwable) {
        //do something
        logger.error(throwable.getMessage());
    }
}
