package com.example.demo.Controller;

import com.example.demo.pojo.rating;
import com.example.demo.service.impl.ratingserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

public class ratingController {
    @Autowired
    com.example.demo.service.impl.ratingserviceimpl ratingserviceimpl;

    @RequestMapping("/")
    public ModelAndView index(){
        // 顾名思义 实体和数据 同时返回页面模板和数据
        ModelAndView mav = new ModelAndView("index");
        List<rating> list = ratingserviceimpl.getAll();
        mav.addObject("list",list);
        return mav;
    }
}
