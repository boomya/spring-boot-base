package com.boom.base.service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by jiangshan on 16/6/16.
 */
@Configuration
//@ImportResource("{classpath:dubbo_config.properties, classpath:dubbo_provider.xml}")
@PropertySource("classpath:dubbo_config.properties")
@ImportResource("classpath:dubbo_provider.xml")
public class DubboConfig {

}
