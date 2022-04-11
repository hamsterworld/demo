package com.example.demo.login.logincontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){

        return "login_form";

    }


    @PostMapping("/login")
    public String postlogin(){

        return "redirect:/"; //내가 일단 기본홈페이지로 보내는 방식이다.
    }

}
