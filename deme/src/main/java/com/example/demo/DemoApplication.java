package com.example.demo;

import com.example.demo.dao.bummapper;
import com.example.demo.model.bum;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.validation.constraints.Max;
import java.util.List;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demo.dao")
public class DemoApplication {
    @Autowired
    private static bummapper bummapper;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


    }

}
