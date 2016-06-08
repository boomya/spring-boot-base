package com.boom.base.web.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * Created by jiangshan on 16/5/6.
 */
@Component
public class ExitHandle implements DisposableBean {

    private final Logger logger = LoggerFactory.getLogger(ExitHandle.class);

    @Override
    public void destroy() throws Exception {
        logger.info("============ end ==============");
    }
}
