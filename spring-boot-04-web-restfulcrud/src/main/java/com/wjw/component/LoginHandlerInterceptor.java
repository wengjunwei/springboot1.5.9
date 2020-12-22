package com.wjw.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created on 2020/12/21 0021
 *登录检查
 * @author weng
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    //目标方法执行前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o) throws Exception {
        Object user = request.getSession().getAttribute("loginUser");
        if (user==null) {
            //未登录 返回登录页面
            request.setAttribute("msg","没有权限登录");
            request.getRequestDispatcher("/index.html").forward(request,httpServletResponse);
            return false;
        }else{
            //已登录，放行请求
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
