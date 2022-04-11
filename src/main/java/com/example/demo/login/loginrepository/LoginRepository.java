package com.example.demo.login.loginrepository;

import com.example.demo.dto.Member;

public interface LoginRepository {

    public boolean FindByUserId(Member member);


}
