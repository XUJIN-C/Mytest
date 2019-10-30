package com.example.demo.Controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class skillController {
    @Autowired
    com.example.demo.service.impl.skillserviceimpl skillserviceimpl;

    @RequestMapping(value = "/index/{id}" ,method = RequestMethod.GET)
    public String index(int id){

        List<skill> list = skillserviceimpl.selectskillByid(id);

        return JSON.toJSONString(list);

    }
   @RequestMapping(value = "/seletAll",method = RequestMethod.GET)
    public  String selectAll(){

        List<skill> list=skillserviceimpl.getskillAll();
        return   JSON.toJSONString(list);
   }
}
