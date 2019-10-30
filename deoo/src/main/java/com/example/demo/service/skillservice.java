package com.example.demo.service;

import com.example.demo.pojo.skill;

import java.util.List;

public interface skillservice {
    List<skill>  selectskillByid(int id);

   List<skill> getskillAll();
}
