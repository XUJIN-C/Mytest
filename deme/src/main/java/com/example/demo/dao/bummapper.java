package com.example.demo.dao;

import java.util.List;
import com.example.demo.model.bum;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface bummapper {
    List<bum> findAll();


}
