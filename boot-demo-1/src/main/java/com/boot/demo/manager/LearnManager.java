package com.boot.demo.manager;

import com.boot.demo.domain.Learn;

import java.util.List;
import java.util.Map;

public interface LearnManager {

    int add(Learn learn);

    int update(Learn learn);

    int deleteByIds(String[] ids);

    Learn queryLearnById(Long id);

    List<Learn> queryLearnList(Map<String, Object> params);
}
