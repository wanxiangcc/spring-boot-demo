package com.example.demo;

import com.example.demo.util.BaseMysqlMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@MapperScan(basePackages = "com.example.demo.dao", markerInterface = BaseMysqlMapper.class)
public class BootDemo2Application {
    public static void main(String[] args) {
        SpringApplication.run(BootDemo2Application.class, args);
    }
}
