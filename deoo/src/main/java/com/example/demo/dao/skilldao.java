package com.example.demo.dao;

import com.example.demo.pojo.skill;

import java.util.List;

public interface skilldao {

    int insert(skill record);

  int deleteByid(int id);

  int update(skill record);

    skill selectByid(int id);

    List<skill>  selectAll();

}
