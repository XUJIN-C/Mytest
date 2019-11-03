package com.example.demo.Controller;

import com.example.demo.pojo.yhu;
import com.example.demo.service.impl.yhuserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class yhuController {

    @Autowired
    yhuserviceimpl yhuserviceimpl;
    @RequestMapping(value = "/selectAll",method = RequestMethod.GET)
    public List<yhu>  findALL(){
        List<yhu> h=yhuserviceimpl.findALL();
        return h ;
    }

}
