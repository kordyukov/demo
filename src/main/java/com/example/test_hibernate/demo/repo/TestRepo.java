package com.example.test_hibernate.demo.repo;

import com.example.test_hibernate.demo.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepo extends JpaRepository<Test,Integer> {
    @Override
    List<Test> findAll();

    List<Test>getTestByName(String name);
}
