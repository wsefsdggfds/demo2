package com.example.demo.shopping.account.controller;

import com.example.demo.entity.AccountPassword;
import com.example.demo.model.ApiResult;
import com.example.demo.model.RegisterModel;
import com.example.demo.service.LogOnService;
import com.example.demo.service.LogService;
import com.example.demo.shopping.account.entity.Account;
import com.example.demo.shopping.account.mapper.AccountMapper;
import com.example.demo.shopping.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private AccountMapper accountMapper;
//C:\Users\wwx92\IdeaProjects\demo2

    /**
     *
     * @param
     * @return
     */
    @GetMapping("/{id}")
    public List<Account> selectByNameAndPhone(@PathVariable String id,@RequestParam(required = false) String name,@RequestParam(required=false) String phone){
        List<Account> accounts= accountMapper.selectByNameAndPhone(name,phone);


        return accounts;
    }
//    @PostMapping("/s")
//    public List<Account> selectEnd(@RequestParam(required = false) String name, @RequestParam(required = false) String phone ){
//        List<Account> account2= accountService.selectEnd(name,phone);
//       return account2;
//    }
//    public Account select(@RequestBody Account account){
//        Account account2= accountMapper.selectAccount(account);
//        return account2;
//    }
//    @PostMapping("/selectPhone")
//    public Account selectPhone(@RequestBody Account account){
//        Account account1 =accountMapper.selectAccountPhone(account);
//        return account1;
//    }
    @PutMapping("/update/account")
    public String update(@RequestBody Account account){
        ArrayList<Account> account1=accountMapper.selectByNameAndPhone(null,account.getPhone());
        if (account1 !=null){
            accountService.updateAccount(account);
           return "修改成功";
        }else {
        return "该账户不存在";
        }
    }
    @PostMapping("/insert/account")
    public ApiResult insert(@RequestBody Account account){

        return accountService.insertAccount(account);
    }
//@PostMapping("/selectNameAll")
//    public ArrayList<Account> selectNameAll(@RequestBody Account account){
//        ArrayList<Account> accounts=accountService.selectNameAll(account);
//        return accounts;
//}
}
