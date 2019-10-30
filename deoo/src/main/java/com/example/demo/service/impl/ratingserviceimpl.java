package com.example.demo.service.impl;

import com.example.demo.pojo.rating;
import com.example.demo.service.ratingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ratingserviceimpl  implements ratingService {
    @Autowired
    com.example.demo.dao.ratingdao ratingdao;
    @Override
    public String insert(rating r) {
          ratingdao.newp(r);
        return "ok";
    }

    @Override
    public rating getrByid(int id) {
      rating getrByid=ratingdao.getratingByid(id);
        return getrByid;
    }
}
