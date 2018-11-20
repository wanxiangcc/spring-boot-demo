package com.example.demo.service.impl;

import com.example.demo.dao.LearnResourceMapper;
import com.example.demo.domain.LearnResource;
import com.example.demo.service.BaseService;
import com.example.demo.service.LearnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearnServiceImpl extends BaseService<LearnResource> implements LearnService {
    @Autowired
    private LearnResourceMapper learnResourceMapper;

    @Override
    public List<LearnResource> queryLearnResouceList() {
        return null;
    }

    @Override
    public void deleteBatch(Long[] ids) {

    }
}
