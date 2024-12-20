package com.soupbun.soupbunapi.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@WebFilter("/*")  // 拦截请求中间件
public class RequestLoggingFilter implements Filter {

    private static final Logger LOG = LogManager.getLogger(RequestLoggingFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String requestUrl = httpRequest.getRequestURL().toString();
        String queryString = httpRequest.getQueryString();
        String method = httpRequest.getMethod();
        if (queryString != null) {
            LOG.info("=======【REQUEST DATA】 URL:{} PARAMS:{} METHOD:{}=======", requestUrl, queryString, method);
        }else{
            LOG.info("=======【REQUEST DATA】 URL:{} METHOD:{}=======", requestUrl, method);
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
}
