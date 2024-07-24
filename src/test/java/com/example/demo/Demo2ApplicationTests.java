package com.example.demo;

import com.example.demo.entity.AccountPassword;
import com.example.demo.mapper.LongOnMapper;
import com.example.demo.shopping.account.controller.AccountController;
import com.example.demo.shopping.account.entity.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class Demo2ApplicationTests {

    @Autowired
    private AccountController accountController;

    @Test
    void contextLoads1() {
        Account account = new Account();
        account.setName("ddd");
        //String s = accountController.select(account);
        System.out.println("=====");
    }
    @Test
    void contextLoads2() {

    }
    @Test
    void contextLoads3() {

    }
    @Test
    void contextLoads4() {

    }
    @Test
    void contextLoads5() {

    }

}
