package com.springmvc.demo.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by LIANGJUNJIA on 2018/4/28.
 */
public class DemoFilter implements Filter {
    private static Logger logger = LoggerFactory.getLogger(DemoFilter.class);

    public void init(FilterConfig filterConfig) throws ServletException {
        logger.error("filter: init");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        logger.error("filter: before doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
        logger.error("filter: after doFilter");
    }

    public void destroy() {
        logger.error("filter: init");
    }
}
