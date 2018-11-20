package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IService<T> {
    T selectByKey(Object key);

    int insert(T entity);

    int delete(T entity);

    int deleteByKey(Object key);

    int update(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);
}