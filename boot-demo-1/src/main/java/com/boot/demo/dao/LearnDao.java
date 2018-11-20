package com.boot.demo.dao;

import com.boot.demo.domain.Learn;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LearnDao {
    int add(Learn learn);

    int update(Learn learn);

    int deleteByIds(String[] ids);

    Learn queryLearnById(Long id);

    List<Learn> queryLearnList(Map<String, Object> params);
}
