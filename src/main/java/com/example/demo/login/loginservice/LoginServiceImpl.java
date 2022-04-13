package com.example.demo.login.loginservice;

import com.example.demo.dto.Member;
import com.example.demo.dto.MemberLoginForm;
import com.example.demo.login.loginrepository.LoginRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;


@Slf4j
@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final LoginRepository loginRepository;

    @Override
    public Member login(MemberLoginForm memberloginform, HttpServletRequest request) {

        log.info(" MemberLoginForm = {} " + memberloginform);

        Member member = loginRepository.LoginByUserId(memberloginform) ;

        if(member != null ){

            return member;

        }

        return null;

    }

    @Override
    public void save(Member member){

        Member member1 = loginRepository.save(member);

    };

}
