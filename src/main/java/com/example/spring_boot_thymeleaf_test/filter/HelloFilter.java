package com.example.spring_boot_thymeleaf_test.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author: aimiguo
 * @Date: 2018/12/5
 * @Time: 17:32
 * Description:
 */
@WebFilter("/hello")
public class HelloFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println( "Filter Init" );

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println( "Hello" );
        filterChain.doFilter( servletRequest, servletResponse );
        System.out.println( "Filter" );
    }

    @Override
    public void destroy() {
        System.out.println("Filter Destroy");

    }
}
