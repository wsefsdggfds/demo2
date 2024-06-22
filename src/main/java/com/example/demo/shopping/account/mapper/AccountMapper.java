package com.example.demo.shopping.account.mapper;



import com.example.demo.shopping.account.entity.Account;

public interface AccountMapper {
    Account selectAccount(Account account);
    Account selectAccountPhone(Account account);
    Account selectAccountRole(Integer pageNo,Integer PageSize);
    Account updateAccount(Account account);
    int insertAccount(Account account);


}
