package com.example.demo.login.loginrepository;

import com.example.demo.dto.Member;
import com.example.demo.dto.MemberLoginForm;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.*;


@Slf4j
@Repository
public class LoginRepositoryImpl implements LoginRepository{


    static Map<Long, Member> UserMap = new HashMap<>();
    private static long sequence = 0L;


    public Member LoginByUserId(MemberLoginForm memberloginform) {


        Optional<Member> loginid = findAll().stream().filter(m ->
                m.getUserId().equals(memberloginform.getUserId())).findFirst();

        log.info("접속한 아이디와 일치하는가? = {} " + loginid);

        Member member = loginid.filter(m->m.getUserPassword().equals(memberloginform.getUserPassword()))
                .orElse(null);

        if(member != null){

            return member;

        }

        return null;

    }

    public Member findById(Long id) {

        return UserMap.get(id);

    }


    public void findByUserId(String userid){

        //UserMap.keySet().stream().

    }

    public List<Member> findAll() {

        return new ArrayList<>(UserMap.values());

    }

    public Member save(Member member){

        member.setUserNumber(++sequence);
        UserMap.put(member.getUserNumber(), member);
        return member;

    }

}
