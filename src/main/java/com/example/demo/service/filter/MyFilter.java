package com.example.demo.service.filter;

import jakarta.servlet.*;

import java.rmi.server.ServerCloneException;
import java.io.IOException;
import java.util.logging.LogRecord;

public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException,  ServletException {
        System.out.println("过滤request");



        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("过滤response");
    }


}
