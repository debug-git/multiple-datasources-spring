package com.example.test;

import com.example.multiple_datasources_spring.service.DemoService;
import com.example.multiple_datasources_spring.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static TestService testService;
    private static DemoService demoService;

//    @BeforeClass
//    public static void before(){
//        //初始化ApplicationContext
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
//        testMapper = applicationContext.getBean(TestMapper.class);
//        demoMapper = applicationContext.getBean(DemoMapper.class);
//    }
//
//    @org.junit.Test
//    public void testDemo(){
//        Integer i = testMapper.getCount();
//        System.out.println("test.user2表有"+i+"条数据");
//        boolean flag = i<100?true:false;
//        assertEquals(true,flag);
//    }

//    @org.junit.Test
//    public void demoDemo(){
//        Integer i = demoMapper.getCount();
//        System.out.println("demo.user表有"+i+"条数据");
//        boolean flag = i<100?false:true;
//        assertEquals(true,flag);
//    }

    public static void main(String[] args) {
        //初始化ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        testService = applicationContext.getBean(TestService.class);
        demoService = applicationContext.getBean(DemoService.class);
//        testMapper = applicationContext.getBean(TestMapper.class);
//        demoMapper = applicationContext.getBean(DemoMapper.class);

        //设置数据源为testDataSource,使用了AOP测试时请将下面这行注释
//        MultipleDataSource.setDataSourceKey("testDataSource");
        Integer testCount = testService.getCount();
        System.out.println("test.user2表有"+testCount+"条数据");
        //设置数据源为demoDataSource,使用AOP测试时请将下面这行注释
//        MultipleDataSource.setDataSourceKey("demoDataSource");
        Integer demoCount = demoService.getCount();
        System.out.println("demo.user表有"+demoCount+"条数据");
//        System.out.println(JSONObject.toJSONString(testService.getList()));
    }
}
