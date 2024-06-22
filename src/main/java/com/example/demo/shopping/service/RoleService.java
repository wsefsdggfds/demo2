package com.example.demo.shopping.service;

import com.example.demo.shopping.account.entity.Account;
import com.example.demo.shopping.account.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RoleService {
    @Autowired
    private AccountMapper accountMapper;
    public List<Account> selectRole(Integer pageNO, Integer pageSize){
        return (List<Account>) accountMapper.selectAccountRole(pageNO ,pageSize);
    }


}
