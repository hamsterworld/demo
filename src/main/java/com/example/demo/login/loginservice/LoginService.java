package com.example.demo.login.loginservice;

import com.example.demo.dto.Member;
import com.example.demo.dto.MemberLoginForm;

import javax.servlet.http.HttpServletRequest;

public interface LoginService {

    public Member login(MemberLoginForm memberloginform, HttpServletRequest request);

}
