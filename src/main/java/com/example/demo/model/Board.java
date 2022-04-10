package com.example.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class Board {

    /**
     * 일련번호
     */
    private Integer testSeq;

    /**
     * 제목
     */
    private String testSubject;

    /**
     * 내용
     */
    private String testContent;

    /**
     * 등록시간
     */
    private Date testRegTime;

}