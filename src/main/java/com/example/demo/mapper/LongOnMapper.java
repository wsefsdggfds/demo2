package com.example.demo.mapper;


import com.example.demo.entity.AccountPassword;
import org.apache.ibatis.annotations.Mapper;


public interface LongOnMapper {
    AccountPassword find(AccountPassword accountPassword);
    AccountPassword findPassWord(AccountPassword accountPassword);
    int insert(AccountPassword accountPassword);
    int update(AccountPassword accountPassword);

}
