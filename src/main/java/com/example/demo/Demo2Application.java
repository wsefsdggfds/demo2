package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;


@MapperScan("com.example.demo.mapper" )
@MapperScan("com.example.demo.shopping.account.mapper" )
//@MapperScans()     扫描mybatis mapper接口目录
//@ComponentScans()  spring  扫描bean的路径
@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args)

    {
        SpringApplication.run(Demo2Application.class, args);
    }

}
