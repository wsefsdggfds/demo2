//package com.example.demo.generator.service;
//
//import jakarta.annotation.Resource;
//import org.apache.ibatis.session.ExecutorType;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.support.SqlSessionDaoSupport;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SessionFactionT  {
//    @Bean(name = "sqlSessionFactoryBean")
//    public SqlSessionFactoryBean sqlSessionFactoryBean( ) {
//
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//
//
//        return sqlSessionFactoryBean;
//    }
//
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
//        return new SqlSessionTemplate(sqlSessionFactoryBean().getObject(), ExecutorType.BATCH);
//    }
//}
