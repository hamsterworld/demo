package com.example.demo.Join.joinservice;

import com.example.demo.dto.Member;
import com.example.demo.dto.MemberLoginForm;
import com.example.demo.login.loginrepository.LoginRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class JoinService {

    private final LoginRepository loginRepository;

    public Member save(MemberLoginForm memberLoginForm){

        Member member = new Member(memberLoginForm.getUserId(),memberLoginForm.getUserPassword());

        Member savemember = loginRepository.save(member);

        return savemember;

    }


}
