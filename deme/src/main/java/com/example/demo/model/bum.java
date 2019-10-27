package com.example.demo.model;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;


@Data
@Accessors(chain = true)
public class bum {
     private int id;
     private  String BM;
    private List<dafen> dafenList;
}
