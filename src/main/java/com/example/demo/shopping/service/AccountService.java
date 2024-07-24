package com.example.demo.shopping.service;

import com.example.demo.model.ApiResult;
import com.example.demo.shopping.account.entity.Account;
import com.example.demo.shopping.account.mapper.AccountMapper;
import org.apache.catalina.util.StringUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private ApiResult apiResult;

//    public void selectAccount(Account account) {
//        Account t = new Account();
//        t.setName(account.getName());
//        Account account1 = accountMapper.selectAccount(t);
//
//
//    }
//    public void selectAccountPhone(Account account) {
//        Account t = new Account();
//        t.setName(account.getPhone());
//        Account account1 = accountMapper.selectAccountPhone(t);
//    }
    public void updateAccount(Account account) {

        Account s=new Account();
        BeanUtils.copyProperties(account,s);
        accountMapper.updateAccount(account);

    }



    public ApiResult insertAccount(Account account) {
        String password= "1[3-9]\\d{9}";
        String eMail="/[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]/";
        Pattern patternEMail=Pattern.compile(eMail);
        Matcher matcherEMali=patternEMail.matcher(account.geteMail());
        Pattern pattern=Pattern.compile(password);
        Matcher matcher=pattern.matcher(account.getPhone());
//        && account.getName() !=null && account.getName()!= ""
        if (!StringUtils.isEmpty(account.getName()) ){
            if (account.getName().length()<11){
                if (!StringUtils.isEmpty(account.geteMail())){
                    if(account.geteMail().length()<91) {
                        if (matcherEMali.matches()) {
                            if (!StringUtils.isEmpty(account.getPhone())) {
                                if (matcher.matches()) {
                                    if(accountMapper.selectByNameAndPhone(null,account.getPhone())==null){
                                        accountMapper.insertAccount(account);
                                        return ApiResult.success("已经注册成功");
                                    }else{
                                        return ApiResult.failure("该电话号码已经存在");
                                    }

                                } else {
                                    return ApiResult.failure("请输入正确的电话号码");
                                }

                            } else {
                                return ApiResult.failure("请输入电话号码");
                            }

                        } else {
                            return ApiResult.failure("邮箱格式不正确");
                        }
                    }else {
                        return ApiResult.failure("邮箱不能大于九十位");
                    }

                }else {
                    return ApiResult.failure("邮箱不能为空");
                }

            }else {
                return ApiResult.failure("名字不能大于十位");
            }
        }  else {
            return ApiResult.failure("600：请输入名字");
        }


    }
//    public ArrayList<Account> selectNameAll(Account account) {
//        ArrayList<Account> t=accountMapper.selectNameAll(account);
//
//
//        return t;
//
//}
//    public List<Account> selectEnd(String name,String phone){
//        List<Account> t=accountMapper.selectEnd(name,phone);
//        return t;
//}
}
