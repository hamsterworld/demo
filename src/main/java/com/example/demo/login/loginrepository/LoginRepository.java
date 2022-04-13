package com.example.demo.login.loginrepository;

import com.example.demo.dto.Member;
import com.example.demo.dto.MemberLoginForm;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public interface LoginRepository {

    public Member LoginByUserId(MemberLoginForm memberloginform);

    public Member save(Member member);

    public List<Member> findAll();

}
