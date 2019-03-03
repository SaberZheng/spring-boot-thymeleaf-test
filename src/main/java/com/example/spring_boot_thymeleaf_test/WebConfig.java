package com.example.spring_boot_thymeleaf_test;

import com.example.spring_boot_thymeleaf_test.filter.HelloFilter;
import com.example.spring_boot_thymeleaf_test.listener.RequestLifecycleListener;
import com.example.spring_boot_thymeleaf_test.servlet.HelloServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: aimiguo
 * @Date: 2018/12/5
 * @Time: 17:40
 * Description:
 */
@Configuration
public class WebConfig {
    @Bean
    public HelloServlet helloServlet(){
        return  new HelloServlet();
    }

    @Bean
    public HelloFilter helloFilter(){
        return new HelloFilter();
    }

    @Bean
    public RequestLifecycleListener requestLifecycleListener(){
        return  new RequestLifecycleListener();
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return  new ServletRegistrationBean(new HelloServlet(),"/hello/*");
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.addUrlPatterns("/hello");
        filterRegistrationBean.setFilter(new HelloFilter());
        return  filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
        return new ServletListenerRegistrationBean(new RequestLifecycleListener());
    }
}
