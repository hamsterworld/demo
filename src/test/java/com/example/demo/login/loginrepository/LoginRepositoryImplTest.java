package com.example.demo.login.loginrepository;

import com.example.demo.dto.Member;
import com.example.demo.login.loginservice.LoginService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@Component
class LoginRepositoryImplTest {

    private static Map<Long, Member> store = new HashMap<>();

    @Test
    void test1(){

        Member testmember1 = new Member();
        Member testmember2 = new Member();
        Member testmember3 = new Member();

        testmember1.setUserNumber(1L);
        testmember1.setUserId("ssoboro");
        testmember1.setUserPassword("12345");
        testmember1.setUserNumber(2L);
        testmember2.setUserId("hamster");
        testmember2.setUserPassword("12345678");
        testmember1.setUserNumber(3L);
        testmember3.setUserId("tiger");
        testmember3.setUserPassword("123");

        store.put(testmember1.getUserNumber(),testmember1);
        store.put(testmember2.getUserNumber(),testmember2);
        store.put(testmember3.getUserNumber(),testmember3);

        List<Member> testmap = new ArrayList<>(store.values());

        testmap.stream().forEach(member -> System.out.println("정확히 나오는가 = " + member));


    }


}