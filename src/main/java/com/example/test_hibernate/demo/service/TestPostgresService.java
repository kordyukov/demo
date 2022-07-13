package com.example.test_hibernate.demo.service;

import com.example.test_hibernate.demo.entity.Test;
import com.example.test_hibernate.demo.repo.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TestPostgresService {
    @Autowired
    private  TestRepo testRepo;

    public List<Test> addToTest(Test[] test){
        testRepo.saveAll(Arrays.asList(test));

       return testRepo.findAll();
    }

    public List<Test> findName(String name){
        return testRepo.getTestByName(name);
    }

}
