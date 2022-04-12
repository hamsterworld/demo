package com.example.demo.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
public class LoginInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String requestURI = request.getRequestURI();

        log.info("요청 URI = " + requestURI);

        HttpSession session = request.getSession(false);

        if(session == null){

            log.info("인증 되지 않은 사용자");

        }


        return HandlerInterceptor.super.preHandle(request, response, handler);
    }


}
