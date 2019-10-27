package com.example.demo.service;

import com.example.demo.model.bum;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface bumservice {

    List<bum> findAll();
}
