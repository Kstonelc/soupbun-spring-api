package com.soupbun.soupbunapi;


import com.soupbun.soupbunapi.filter.RequestLoggingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean<RequestLoggingFilter> loggingFilter() {
        FilterRegistrationBean<RequestLoggingFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new RequestLoggingFilter());
        registrationBean.addUrlPatterns("/*");  // 配置过滤器拦截的路径
        registrationBean.setOrder(1); // 设置过滤器的优先级，值越小优先级越高
        return registrationBean;
    }
}
