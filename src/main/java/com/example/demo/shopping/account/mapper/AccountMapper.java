package com.example.demo.shopping.account.mapper;



import com.example.demo.shopping.account.entity.Account;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface AccountMapper {
//    Account selectAccount(Account account);
//    ArrayList<Account> selectNameAll(Account account);
//    Account selectAccountPhone(Account account);
    Account selectAccountRole(Integer pageNo,Integer PageSize);
    int updateAccount(Account account);
    int insertAccount(Account account);
    ArrayList<Account> selectByNameAndPhone(@Param("name") String name, @Param("phone") String phone);


}
