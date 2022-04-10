package com.example.demo;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public ModelAndView gohome(){

        System.out.println("여긴잘왓나11");
        return new ModelAndView("index");

    }


}
