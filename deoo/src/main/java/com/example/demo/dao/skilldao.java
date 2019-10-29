package com.example.demo.dao;

import com.example.demo.pojo.skill;

import java.util.List;

public interface skilldao {
     void insert(skill skill) ;

    List<skill>  getskillByid(int id);

}
