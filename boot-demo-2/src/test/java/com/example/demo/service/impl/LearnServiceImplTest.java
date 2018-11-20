package com.example.demo.service.impl;

import com.example.demo.domain.LearnResource;
import com.example.demo.service.LearnService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnServiceImplTest {
    @Autowired
    private LearnService learnService;

    @Test
    public void add() {
        LearnResource lr = new LearnResource();
        lr.setAuthor("aa");
        lr.setTitle("bb");
        lr.setUrl("http://seeyon.com");
        learnService.insert(lr);
    }
}