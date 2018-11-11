package com.example.multiple_datasources_spring.dao;

import com.example.multiple_datasources_spring.annotation.DataSource;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface TestMapper {
//    @Select("select count(*) from user2")
//    @DataSource("testDataSource")
    Integer getCount();

//    @Select("select * from user2 limit 10")
//    @DataSource("testDataSource")
    List<Map<String,Object>> getList();
}
