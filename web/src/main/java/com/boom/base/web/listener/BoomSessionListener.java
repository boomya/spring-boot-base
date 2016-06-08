package com.boom.base.web.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by jiangshan on 16/6/5.
 */
@WebListener
public class BoomSessionListener implements HttpSessionListener {

    private static Logger logger = LoggerFactory.getLogger(BoomSessionListener.class);

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        logger.info("== sessionCreated ==");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        logger.info("== sessionDestroyed ==");

    }
}
