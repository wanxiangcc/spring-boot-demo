package com.example.demo.service;

import com.example.demo.domain.LearnResource;

import java.util.List;

public interface LearnService extends IService<LearnResource> {
    List<LearnResource> queryLearnResouceList();

    void deleteBatch(Long[] ids);
}
