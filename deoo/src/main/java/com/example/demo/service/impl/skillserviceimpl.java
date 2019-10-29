package com.example.demo.service.impl;

import com.example.demo.dao.skilldao;
import com.example.demo.pojo.skill;
import com.example.demo.service.skillservice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class skillserviceimpl implements skillservice {
  @Autowired
  com.example.demo.dao.skilldao skilldao;

    @Override
    public List<skill> getskillByid(int id) {
        return  skilldao.getskillByid(id);
    }
}
