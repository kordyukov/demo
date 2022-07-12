package com.example.test_hibernate.demo.controler;

import com.example.test_hibernate.demo.entity.Test;
import com.example.test_hibernate.demo.repo.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.TestPostgresService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TestPostgres {

@Autowired
private TestPostgresService testPostgresService;
@Autowired
private TestRepo testRepo;

    @PostMapping("/add")
    public List<Test> add(@RequestBody Test[] test){
        return testPostgresService.addToTest(test);
    }

    @GetMapping
    public List<Test> findName(@RequestParam String name){
        return testPostgresService.findName(name);
    }
    @GetMapping("/fio")
    public List<Test>getByFioContains(@RequestParam String test){
        return testRepo.getTestByFioContainsIgnoreCase(test);
    }

    @GetMapping("/id")
    public List<Integer> getIndex(){
        List<Test> list = testRepo.findAll();

        return list.stream().map(Test::getId).collect(Collectors.toList());

    }

}
