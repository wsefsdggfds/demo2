package com.example.demo.shopping.account.controller;

import com.example.demo.entity.AccountPassword;
import com.example.demo.model.RegisterModel;
import com.example.demo.service.LogOnService;
import com.example.demo.service.LogService;
import com.example.demo.shopping.account.entity.Account;
import com.example.demo.shopping.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountController {
    @Autowired
    private AccountService accountService;
//C:\Users\wwx92\IdeaProjects\demo2

    /**
     * 
     * @param account
     * @return
     */
    @PostMapping("")
    public String select(@RequestBody Account account){
        accountService.selectAccount(account);
        return "";
    }
    @PostMapping("selectPhone")
    public String selectPhone(@RequestBody Account account){
        accountService.selectAccountPhone(account);
        return "";
    }
    @PostMapping("update")
    public String update(@RequestBody Account account){
        accountService.updateAccount(account);
        return "";
    }
    @PostMapping("insert")
    public String inserrt(@RequestBody Account account){
        accountService.insertAccount(account);
        return "";
    }

}
