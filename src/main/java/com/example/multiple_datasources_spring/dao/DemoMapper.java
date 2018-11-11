package com.example.multiple_datasources_spring.dao;

import com.example.multiple_datasources_spring.annotation.DataSource;
import com.example.multiple_datasources_spring.enumList.DataSourceConstans;

import java.util.List;
import java.util.Map;

public interface DemoMapper {
//    @Select("select count(*) from user")
//    @DataSource("demoDataSource")
    Integer getCount();

//    @Select("select * from user limit 10")
//    @DataSource("demoDataSource")
    List<Map<String,Object>> getList();
}
