package com.boom.base.web.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by jiangshan on 16/4/28.
 */
public class SingleFilter implements Filter {

    private static Logger logger = LoggerFactory.getLogger(SingleFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("============= SingleFilter init ================");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        logger.info("============= SingleFilter doFilter ================");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
