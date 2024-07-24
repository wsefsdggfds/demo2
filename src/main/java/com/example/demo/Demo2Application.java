package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;


@MapperScan("com.example.demo.mapper" )
@MapperScan("com.example.demo.shopping.account.mapper" )
@MapperScan("com.example.demo.shopping.commodity.mapper" )
@MapperScan("com.example.demo.shopping.classification.primary.mapper" )
@MapperScan("com.example.demo.shopping.classification.secondary.mapper" )
@MapperScan("com.example.demo.shopping.label.mapper" )
@MapperScan("com.example.demo.shopping.address.mapper" )
@MapperScan("com.example.demo.shopping.specifications.mapper" )
@MapperScan("com.example.demo.shopping.carouselChart.mapper" )
@MapperScan("com.example.demo.generator.mapper" )
//@MapperScans()     扫描mybatis mapper接口目录
//@ComponentScans()  spring  扫描bean的路径
@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args)

    {
        SpringApplication.run(Demo2Application.class, args);
    }

}
