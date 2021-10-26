package com.example.my004;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
//编码方式
public class AFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
