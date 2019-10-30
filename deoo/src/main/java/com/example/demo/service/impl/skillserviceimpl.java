package com.example.demo.service.impl;

import com.example.demo.pojo.skill;
import com.example.demo.service.skillservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class skillserviceimpl implements skillservice {
 @Autowired
  com.example.demo.dao.skilldao  skilldao;
  @Override
  public List<skill> selectskillByid(int id) {
   List<skill> selectskillByid= (List<skill>) skilldao.selectByid(id);
    return selectskillByid ;
  }

  @Override
  public List<skill> getskillAll() {
    List<skill> getskillAll=skilldao.selectAll();
    return  getskillAll;
  }
}
