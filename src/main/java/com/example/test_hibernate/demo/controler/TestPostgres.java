package com.example.test_hibernate.demo.controler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestPostgres {
    @PostMapping("/add")
    public List<TestPostgres> add(@RequestBody TestPostgres testPostgres){
        return null;
    }
}
