package com.example.demo.login.logincontroller;


import com.example.demo.dto.Member;
import com.example.demo.dto.MemberLoginForm;
import com.example.demo.login.SessionConst;
import com.example.demo.login.loginservice.LoginService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@Slf4j
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @GetMapping("/login")
    public String login(@ModelAttribute("memberloginform") MemberLoginForm memberloginform,
                        Model model){


        return "login_form";

    }


    @PostMapping("/login")
    public String postlogin(@Valid @ModelAttribute("memberloginform") MemberLoginForm memberloginform,
                            BindingResult bindingResult,
                            HttpServletRequest request,
                            Model model){

        if(bindingResult.hasErrors()){

            log.info("에러가 있네요. = {}",bindingResult);

            return "login_form";

        }

        //아이디와 비밀번호가 맞으면 loginservice에서 검증로직을 거쳐서 member를 반환한다.
        Member member = loginService.login(memberloginform,request);

        log.info("member가 널이여야 합니다 = {} " + member);

        if( member  != null ){

            log.info(" request 너가 널이야? {} " , request );
            HttpSession session = request.getSession();
            log.info(" session 너가 널이야? {} " , session );
            session.setAttribute(SessionConst.LOGIN_MEMBER,member);
            model.addAttribute("member",member);

            return "redirect:/";

        }


       bindingResult.reject("loginfail","아이디 및 비밀번호가 맞지 않습니다.");
        return "login_form";

    }

    @PostConstruct
    public void init(){

        Member TestMember1 = new Member("ssoboro","12345");
        Member TestMember2 = new Member("hamster","123456");
        Member TestMember3 = new Member("tiger","1234567");


        loginService.save(TestMember1);
        loginService.save(TestMember2);
        loginService.save(TestMember3);

    }

}
