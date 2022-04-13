package com.example.demo.login.loginrepository;

import com.example.demo.dto.Member;
import com.example.demo.dto.MemberLoginForm;

public interface LoginRepository {

    public Member LoginByUserId(MemberLoginForm memberloginform);


}
