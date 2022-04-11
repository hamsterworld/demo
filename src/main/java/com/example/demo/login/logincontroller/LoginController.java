package com.example.demo.login.logincontroller;


import com.example.demo.dto.Member;
import com.example.demo.login.loginservice.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {


    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public String login(){




        return "login_form";

    }


    @PostMapping("/login")
    public String postlogin(@ModelAttribute Member member){

        System.out.println("UserId = " + member.getUserId());

        System.out.println("UserPassword = " + member.getUserPassword());

        if(loginService.PassId(member)){

            return "redirect:/";    //login 성공 로직

        }

        return "redirect:/login";

        //로그인 실패 로직 다시 원래대로 돌린다.(나중에 홈페이지에 로그인에 실패했습니다.)
        //여기서 예외를 터트려야할지? 아니면 그대로 경고메시지를 출력시킬지? 결정.
        //따로 적을 예정이다.

    }

}
