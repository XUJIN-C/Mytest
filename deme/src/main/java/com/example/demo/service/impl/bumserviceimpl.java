package com.example.demo.service.impl;

import com.example.demo.dao.bummapper;
import com.example.demo.model.bum;
import com.example.demo.service.bumservice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class bumserviceimpl implements bumservice {
 @Autowired
  private bummapper mapper;
   @Override
   public List<bum> findAll(){return  mapper.findAll();}

}
