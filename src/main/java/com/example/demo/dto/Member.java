package com.example.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Member {

    private long UserNumber;
    private String UserId;
    private String UserPassword;


    public Member(String userId, String userPassword) {
        UserId = userId;
        UserPassword = userPassword;
    }

}
