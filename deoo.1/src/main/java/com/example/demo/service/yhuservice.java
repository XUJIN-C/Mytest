package com.example.demo.service;

import com.example.demo.pojo.yhu;

import java.util.List;

public interface yhuservice {


    List<yhu> findALL();

    public String deleByid(int id);
}
