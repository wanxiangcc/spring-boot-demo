package com.boot.demo.manager.impl;

import com.boot.demo.dao.LearnDao;
import com.boot.demo.domain.Learn;
import com.boot.demo.manager.LearnManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LearnManagerImpl implements LearnManager {
    @Autowired
    LearnDao learnDao;

    @Override
    public int add(Learn learn) {
        return learnDao.add(learn);
    }

    @Override
    public int update(Learn learn) {
        return learnDao.update(learn);
    }

    @Override
    public int deleteByIds(String[] ids) {
        return learnDao.deleteByIds(ids);
    }

    @Override
    public Learn queryLearnById(Long id) {
        return learnDao.queryLearnById(id);
    }

    @Override
    public List<Learn> queryLearnList(Map<String, Object> params) {
        return learnDao.queryLearnList(params);
    }
}
