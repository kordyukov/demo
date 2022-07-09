package com.example.test_hibernate.demo.controler;

import com.example.test_hibernate.demo.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.TestPostgresService;

import java.util.List;

@RestController
public class TestPostgres {

@Autowired
private TestPostgresService testPostgresService;


    @PostMapping("/add")
    public List<Test> add(@RequestBody Test[] test){
        return testPostgresService.addToTest(test);
    }

    @GetMapping
    public List<Test> findName(@RequestParam String name){
        return testPostgresService.findName(name);
    }

}
