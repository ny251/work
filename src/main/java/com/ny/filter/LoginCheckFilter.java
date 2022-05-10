package com.ny.filter;


import com.alibaba.fastjson.JSON;
import com.ny.common.BaseContext;
import com.ny.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "loginCheckFilter",urlPatterns = "/*")
@Slf4j
public class LoginCheckFilter implements Filter {
    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String requestURI = request.getRequestURI();

        String[] urls = new String[]{
                "/employee/login",
                "/employee/logout",
                "/backend/**",
                "/front/**",
                "/common/**",
                "/user/login"

        };

        boolean check = check(urls,requestURI);

        if(check){
            log.info("不需要处理");
            filterChain.doFilter(request,response);
            return;
        }

        if(request.getSession().getAttribute("employee")!=null){
            log.info("用户已登录,用户id为:{}",request.getSession().getAttribute("employee"));
            Long empId = (Long) request.getSession().getAttribute("employee");
            BaseContext.setCurrentId(empId);
            filterChain.doFilter(request,response);
            return;
        }
        if(request.getSession().getAttribute("user")!=null){
            log.info("用户已登录,用户id为:{}",request.getSession().getAttribute("user"));
            Long userId = (Long) request.getSession().getAttribute("user");
            BaseContext.setCurrentId(userId);
            filterChain.doFilter(request,response);
            return;
        }
        log.info("用户未登录");
        log.info("用户未登录");
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        return;

///sjdlfsdl
      //  log.info("拦截：{}",request.getRequestURI());
      //  filterChain.doFilter(request,response);
    }
    public boolean check(String[] urls,String requestURI){
        for (String url :urls){
            boolean match = PATH_MATCHER.match(url,requestURI);
            if (match){
                return true;
            }
        }
        return false;
    }
}
