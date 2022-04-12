package com.example.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Member {

    private long UserNumber;
    @Size(min=4,max=10)
    private String UserId;
    @Size(min=4,max=15)
    private String UserPassword;

}
