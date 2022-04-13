package com.example.demo.login.loginservice;

import com.example.demo.dto.Member;
import com.example.demo.dto.MemberLoginForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public interface LoginService {

    public Member login(MemberLoginForm memberloginform, HttpServletRequest request);

    public void save(Member member);

}
