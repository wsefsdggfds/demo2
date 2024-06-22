package com.example.demo.shopping.service;

import com.example.demo.entity.AccountPassword;
import com.example.demo.shopping.account.entity.Account;
import com.example.demo.shopping.account.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;

    public void selectAccount(Account account) {
        Account t = new Account();
        t.setName(account.getName());
        Account account1 = accountMapper.selectAccount(t);

    }
    public void selectAccountPhone(Account account) {
        Account t = new Account();
        t.setName(account.getPhone());
        Account account1 = accountMapper.selectAccount(t);
    }
    public void updateAccount(Account account) {
        Account s=new Account();
        s.setPhone(account.getPhone());
        Account account1=accountMapper.selectAccountPhone(s);
        if (account1 !=null){
            Account t = new Account();
            t.setName(account.getName());
            t.seteMail(account.geteMail());
            t.setRole(account.getRole());
            Account account2=accountMapper.selectAccount(t);
        }else {
            System.out.println("该用户不存在");
        }

    }



    public void insertAccount(Account account) {
        Account t = new Account();
        t.setName(account.getName());
        t.setPhone(account.getPhone());
        t.seteMail(account.geteMail());
        t.setRole(account.getRole());

        int account3 = accountMapper.insertAccount(t);
    }


}
