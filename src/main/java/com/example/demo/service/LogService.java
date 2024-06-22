package com.example.demo.service;

import com.example.demo.entity.AccountPassword;
import com.example.demo.entity.AccountPassword.*;
import com.example.demo.mapper.LongOnMapper;
import com.example.demo.model.RegisterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class LogService {

    @Autowired
    private LongOnMapper longOnMapper;


    public void register(RegisterModel model) {
        System.out.printf("------------------------8888888888888888");
        //request.getHeaders().get("Authori");
     //   request.getPa
        // 校验 用户名唯一   密码强度
        // 根据用户名茶数据库  判断是否存在
        AccountPassword ss=new AccountPassword();
        ss.setAccount(model.getUserName());
       // ss.setPassword(model.getPassWord());
        AccountPassword accountPassword = longOnMapper.find(ss);
//String cc= accountPassword.getAccount();
      //  String ww=accountPassword.getPassword();
        String regex="^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$\n";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(model.getPassWord());
        if ( accountPassword==null){
            if(matcher.find()){

            }else{
                System.out.print("密码不符合规则");

            }
            longOnMapper.insert(ss);
        }else {
            System.out.println("用户已存在");
        }


      }


///api/v2/d?key=333&alur=444
        // 密码强度  正则   数字 字母 特殊字符



        // 保存数据库

        // 。save
    }

    /**
     *
     * 查询数据库账号密码存在
     *
     * 生成token  随机数 放redis      key - value
     *
     *
     */

