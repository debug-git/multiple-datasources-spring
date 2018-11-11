package com.example.multiple_datasources_spring.service.impl;

import com.example.multiple_datasources_spring.annotation.DataSource;
import com.example.multiple_datasources_spring.dao.TestMapper;
import com.example.multiple_datasources_spring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @DataSource("testDataSource")
    public Integer getCount() {
        return testMapper.getCount();
    }

    public List<Map<String, Object>> getList() {
        return testMapper.getList();
    }
}
