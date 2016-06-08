package com.boom.base.web.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * ApplicationPreparedEvent:spring boot上下文context创建完成，但此时spring中的bean是没有完全加载完成的。
 */
public class BoomApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {

    private static Logger logger = LoggerFactory.getLogger(BoomApplicationPreparedEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent applicationPreparedEvent) {
        /**
         * 在获取完上下文后，可以将上下文传递出去做一些额外的操作。
         */
        ConfigurableApplicationContext cac = applicationPreparedEvent.getApplicationContext();
        passContextInfo(cac);

        logger.info("== BoomApplicationPreparedEventListener ==");
    }

    /**
     * 传递上下文
     * @param cac
     */
    private void passContextInfo(ApplicationContext cac) {
        //dosomething()
    }
}
