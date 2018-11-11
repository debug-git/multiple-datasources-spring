package com.example.multiple_datasources_spring.service.impl;

import com.example.multiple_datasources_spring.annotation.DataSource;
import com.example.multiple_datasources_spring.dao.DemoMapper;
import com.example.multiple_datasources_spring.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoMapper demoMapper;

    @DataSource("demoDataSource")
    public Integer getCount() {
        return demoMapper.getCount();
    }

    public List<Map<String, Object>> getList() {
        return demoMapper.getList();
    }
}
