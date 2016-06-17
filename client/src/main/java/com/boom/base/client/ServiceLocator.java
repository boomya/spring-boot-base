package com.boom.base.client;

import com.boom.base.share.dto.MemberDTO;
import com.boom.base.share.service.HomePageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiangshan on 16/6/16.
 */
public class ServiceLocator {

    static {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    private final static ApplicationContext context;

    public final static HomePageService getHomePageService(){
        return (HomePageService) context.getBean("homePageService");
    }
}
