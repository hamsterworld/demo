package com.example.demo.login.loginrepository;

import com.example.demo.dto.Member;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;



@Repository
public class LoginRepositoryImpl implements LoginRepository{


    static Map<Long, Member> UserMap = new HashMap<>();

    @Override
    public boolean FindByUserId(Member member) {


        Member member1 = new Member();

        member1.setUserNumber(1L);
        member1.setUserId("ssoboro");
        member1.setUserPassword("4863527");
        UserMap.put(member1.getUserNumber(), member1);

        Member member2 = new Member();

        member2.setUserNumber(1L);
        member2.setUserId("hamster");
        member2.setUserPassword("123456");
        UserMap.put(member1.getUserNumber(), member1);

        for(Long mapkey : UserMap.keySet()){

            System.out.println("mapkey = " + mapkey);

            if(member.getUserId().equals(UserMap.get(mapkey).getUserId())
                    && member.getUserPassword().equals(UserMap.get(mapkey).getUserPassword())){
                return true;
            }
        }
        return false;
    }

}
