package com.example.demo.dto;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class MemberLoginForm {

    @Size(min=4,max=10)
    private String UserId;
    @Size(min=4,max=15)
    private String UserPassword;

}
