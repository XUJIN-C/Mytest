package com.example.demo.Controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.rating;
import com.example.demo.service.impl.ratingserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class ratingController {

    @Autowired
    ratingserviceimpl ratingserviceimpl;

    @RequestMapping(value = "/insetr",method = RequestMethod.POST)
    public  String  insetr(rating r){
        String R=ratingserviceimpl.insert(r);
        return  JSON.toJSONString(R);

    }

    @RequestMapping(value = "/seletByid/{id}",method = RequestMethod.GET)
    public  String seletByid(int id){
        rating I=ratingserviceimpl.getrByid(id);
        return JSON.toJSONString(I);
    }
}
