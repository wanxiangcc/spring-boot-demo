package com.example.demo.dao;

import com.example.demo.domain.LearnResource;

import java.util.List;

public interface LearnResourceDao extends BaseDao<LearnResource> {
    List<LearnResource> findByAuthor(String author);
}
