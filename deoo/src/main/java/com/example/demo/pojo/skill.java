package com.example.demo.pojo;

import lombok.Data;

import java.util.List;

@Data
public class skill {
    private  int id;
    private  String name;

   List<rating> ratings;
}
