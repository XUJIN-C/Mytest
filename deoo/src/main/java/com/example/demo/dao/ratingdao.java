package com.example.demo.dao;

import com.example.demo.pojo.rating;

import java.util.List;


public interface ratingdao {


    int delete (int id);

    int  update(rating r);

    int  newp(rating r);

    rating getratingByid(int id);

    List<rating> getAll();
}
