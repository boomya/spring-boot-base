package com.boom.base.web.config;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyServerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jiangshan on 16/6/2.
 */
@Configuration
public class JettyConfig {

    @Value("${my.test}")
    private String test;
    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        System.out.println("====servletContainerFactory test======" + test);
        return new EmbeddedServletContainerCustomizer() {
            @Override
            public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
                configurableEmbeddedServletContainer.setPort(9000);
                configurableEmbeddedServletContainer.setContextPath("/boom");
            }
        };
    }

//    @Bean
//    public EmbeddedServletContainerFactory servletContainerFactory(
//            @Value("${jetty.threadPool.maxThreads:256}") final String maxThreads,
//            @Value("${jetty.threadPool.minThreads:8}") final String minThreads,
//            @Value("${jetty.threadPool.idleTimeout:60000}") final String idleTimeout) {
//
//        System.out.println("====servletContainerFactory test======" + test);
//        JettyEmbeddedServletContainerFactory jettyEmbeddedServletContainerFactory = new JettyEmbeddedServletContainerFactory();
//        jettyEmbeddedServletContainerFactory.addServerCustomizers(new JettyServerCustomizer() {
//
//            @Override
//            public void customize(Server server) {
//                final QueuedThreadPool threadPool = server.getBean(QueuedThreadPool.class);
//                threadPool.setMaxThreads(Integer.valueOf(maxThreads));
//                threadPool.setMinThreads(Integer.valueOf(minThreads));
//                threadPool.setIdleTimeout(Integer.valueOf(idleTimeout));
//            }
//        });
//
//        return jettyEmbeddedServletContainerFactory;
//    }

}
