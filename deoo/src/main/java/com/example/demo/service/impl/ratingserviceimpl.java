package com.example.demo.service.impl;

import com.example.demo.dao.ratingdao;
import com.example.demo.pojo.rating;
import com.example.demo.service.ratingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ratingserviceimpl {

    @Autowired
    com.example.demo.dao.ratingdao ratingdao;
    public List<rating> getAll(){
        return ratingdao.getAll();
    }

    public rating getPersonByID(int id){
        return ratingdao.getratingByid(id);
    }


    public void delete(int id) {
        ratingdao.delete(id);
    }


    public void update(rating r) {
        ratingdao.update(r);
    }


    public void newp(rating r) {
        ratingdao.newp(r);
    }
}
