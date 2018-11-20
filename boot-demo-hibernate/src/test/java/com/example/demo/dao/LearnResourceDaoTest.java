package com.example.demo.dao;

import com.example.demo.domain.LearnResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnResourceDaoTest {
    @Autowired
    private LearnResourceDao learnResourceDao;

    @Test
    public void add() {
        LearnResource learnResource = new LearnResource();
        learnResource.setUrl("http://baidu.com");
        learnResource.setTitle("aaa" + System.currentTimeMillis());
        learnResource.setAuthor("bbb");
        learnResourceDao.save(learnResource);
    }
}