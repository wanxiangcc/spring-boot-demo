package com.example.demo.controller.rest;

import com.example.demo.dao.LearnResourceDao;
import com.example.demo.domain.LearnResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest")
public class TestController {
    @Autowired
    private LearnResourceDao learnResourceDao;

    @RequestMapping(value = "/findByAuthor/{author}", method = RequestMethod.GET)
    public List<LearnResource> findByAuthor(@PathVariable String author) {
        List<LearnResource> learnResources = learnResourceDao.findByAuthor(author);
        return learnResources;
    }
}
