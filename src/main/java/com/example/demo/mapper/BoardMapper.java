package com.example.demo.mapper;

import com.example.demo.model.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    /**
     * 게시판 목록 조회
     * @return
     */
    List<Board> selectList();

}