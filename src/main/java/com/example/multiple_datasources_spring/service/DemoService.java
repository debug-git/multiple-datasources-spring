package com.example.multiple_datasources_spring.service;

import java.util.List;
import java.util.Map;

public interface DemoService {
    Integer getCount();
    List<Map<String,Object>> getList();
}
