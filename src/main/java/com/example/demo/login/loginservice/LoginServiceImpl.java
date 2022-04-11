package com.example.demo.login.loginservice;

import com.example.demo.dto.Member;
import com.example.demo.login.loginrepository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginRepository LoginRepository;

    @Override
    public boolean PassId(Member member) {

        System.out.println(" member = " + member);

        return LoginRepository.FindByUserId(member);

    }

}
