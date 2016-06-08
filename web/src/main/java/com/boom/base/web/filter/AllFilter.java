package com.boom.base.web.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by jiangshan on 16/4/28.
 */
public class AllFilter implements Filter {

    private static Logger logger = LoggerFactory.getLogger(AllFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("============= AllFilter init ================ {}", filterConfig.getInitParameter("exclude"));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        logger.info("============= AllFilter doFilter ================");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
