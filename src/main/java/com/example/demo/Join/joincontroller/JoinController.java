package com.example.demo.Join.joincontroller;

import com.example.demo.Join.joinservice.JoinService;
import com.example.demo.dto.Member;
import com.example.demo.dto.MemberLoginForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@Slf4j
@RequiredArgsConstructor
public class JoinController {

    private final JoinService joinService;


    @GetMapping("/join")
    public String join(@ModelAttribute("memberloginform") MemberLoginForm memeberloginform){

        return "join";

    }

    @PostMapping("/join")
    public String postjoin(@Valid @ModelAttribute("memberloginform") MemberLoginForm memeberloginform
    , BindingResult bindingResult){


        if(bindingResult.hasErrors()){

            log.info("에러가 있네요. = {}",bindingResult);

            return "join";

        }

        Member savemember = joinService.save(memeberloginform);

        if(savemember != null){
            return "redirect:/";
        }
            return "join";
    }
}
