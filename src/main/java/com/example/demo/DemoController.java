package com.example.demo;

import com.example.demo.mapper.BoardMapper;
import com.example.demo.model.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private BoardMapper boardMapper;

    @GetMapping("/board/list")
    public List<Board> getBoardList() {
        System.out.println("여긴잘왓나");
        return boardMapper.selectList();
    }

}