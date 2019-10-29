package com.example.demo.service;

import com.example.demo.pojo.rating;

import java.util.List;

public interface ratingService {
     List<rating> getAll();

    rating getratingByid(int id);


    void delete (int id);

    void  update(rating r);

    void  newp(rating r);
}
