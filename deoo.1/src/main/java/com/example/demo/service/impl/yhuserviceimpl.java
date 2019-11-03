package com.example.demo.service.impl;

import com.example.demo.pojo.yhu;
import com.example.demo.service.yhuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class yhuserviceimpl implements yhuservice {
   @Autowired
   com.example.demo.dao.yhudao yhudao;

    @Override
    public List<yhu> findALL() {

        return yhudao.findAll();
    }
}
