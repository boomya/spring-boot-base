package com.boom.base.web.config;

import com.boom.base.web.filter.AllFilter;
import com.boom.base.web.filter.CustomFilter;
import com.boom.base.web.filter.SingleFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangshan on 16/4/28.
 */
@Configuration
public class FilterConfig {

    private static Logger logger = LoggerFactory.getLogger(FilterConfig.class);

    @Bean
    public FilterRegistrationBean getAllFilter() {
        System.out.println("============= FilterConfig getAllFilter ================");

        AllFilter allFilter = new AllFilter();
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(allFilter);
        List<String> urlPatterns = new ArrayList<String>();
        urlPatterns.add("/*");//拦截路径，可以添加多个
        registrationBean.setUrlPatterns(urlPatterns);
        registrationBean.setOrder(2);
        registrationBean.addInitParameter("exclude", "test");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean getCustomFilter() {
        System.out.println("============= FilterConfig getCustomFilter ================");

        CustomFilter customFilter = new CustomFilter();
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(customFilter);
        List<String> urlPatterns = new ArrayList<String>();
        urlPatterns.add("/*");//拦截路径，可以添加多个
        registrationBean.setUrlPatterns(urlPatterns);
        registrationBean.setOrder(1);
        registrationBean.addInitParameter("exclude", "test");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean getSingleFilter(){
        System.out.println("============= FilterConfig getSingleFilter ================");

        SingleFilter singleFilter=new SingleFilter();
        FilterRegistrationBean registrationBean=new FilterRegistrationBean();
        registrationBean.setFilter(singleFilter);
        List<String> urlPatterns=new ArrayList<String>();
        urlPatterns.add("/*");//拦截路径，可以添加多个
        registrationBean.setUrlPatterns(urlPatterns);
        registrationBean.setOrder(3);
        return registrationBean;
    }


}
