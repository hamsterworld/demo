package com.example.demo.login;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@Slf4j
public class LogoutController {

    @PostMapping("/logout")
    public String logout(HttpServletRequest request){

        HttpSession session = request.getSession();

        if(session != null){

            session.invalidate();

        }

        return "redirect:/";

    }

}
