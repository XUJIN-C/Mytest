package com.example.demo.dao;

import com.example.demo.pojo.rating;

import java.util.List;


public interface ratingdao {


    void delete (int id);

    void  update(rating r);

    void  newp(rating r);

    List<rating> getAll();

    rating getratingByid(int id);
}
