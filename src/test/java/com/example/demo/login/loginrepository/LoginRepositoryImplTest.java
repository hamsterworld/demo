package com.example.demo.login.loginrepository;

import com.example.demo.dto.Member;
import com.example.demo.login.loginservice.LoginService;
import com.example.demo.login.loginservice.LoginServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import static org.assertj.core.api.Assertions.*;

@Component
@Slf4j
@RequiredArgsConstructor
class LoginRepositoryImplTest {


    @PostConstruct
    void init(){



    }

    @Test
    void test1(){

        Member TestMember1 = new Member("ssoboro","12345");
        Member TestMember2 = new Member("hamster","123456");
        Member TestMember3 = new Member("tiger","1234567");

/*        loginRepository.save(TestMember1);
        loginRepository.save(TestMember2);
        loginRepository.save(TestMember3);*/


        log.info("================ {} ", TestMember1);
        log.info("================ {} ", TestMember2);
        log.info("================ {} ", TestMember3);

/*        loginService.save(TestMember1);
        loginService.save(TestMember2);
        loginService.save(TestMember3);

        loginRepository.findAll().stream().forEach(m-> System.out.println("좀 나와라 = " + m));*/


       //assertThat(result.size()).isEqualTo(2); //숫자가 int == int인지 확인
        // assertThat(result).contains(TestMember1,TestMember2,TestMember3); //result안에 내가원하는 객체가 포함되잇는지 확인

    }


}