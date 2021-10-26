package com.example.my004;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//资源限定--只有登录用户可以访问
@WebServlet("/download.jsp")
public class DownFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response =(HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        String name = (String)session.getAttribute("name");
        if(name==null){
            response.sendRedirect("/login.jsp");

        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }


    }
}
