package com.example.demo.service;

import com.example.demo.entity.AccountPassword;
import com.example.demo.mapper.LongOnMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class LogOnService {
    @Autowired
    private LongOnMapper longOnMapper;
    public void enroll(AccountPassword enroll){
        //查询用户名是否存在
        // 获取用户名并查询用户名

        AccountPassword t=new AccountPassword();
        t.setAccount(enroll.getAccount());
        AccountPassword p=new AccountPassword();
        p.setAccount(enroll.getPassword());
        AccountPassword accountPassword=longOnMapper.findPassWord(t);
        String accountPassWord=enroll.getPassword();
        if (accountPassword !=null){
           if (accountPassWord.equals(p)){
               System.out.println("密码正确");
           }else {
               System.out.println("密码不正确，请检查密码");
           }
        }else {
            System.out.println("该用户不存在，请注册");
        }

    }
}
