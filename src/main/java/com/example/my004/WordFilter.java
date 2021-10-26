package com.example.my004;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter("/atest")  //替换关键字
public class WordFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        String word = servletRequest.getParameter("value");
        System.out.println(word);
        word = word.replace("shit","hello");
        System.out.println(word);
        servletRequest.setAttribute("value",word);
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
