package com.example.demo.service;

import com.example.demo.pojo.rating;

public interface ratingService {

    String insert(rating r);

    rating  getrByid(int id);
}
