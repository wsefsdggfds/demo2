package com.example.demo.shopping.account.controller;

import com.example.demo.shopping.account.entity.Account;
import com.example.demo.shopping.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/service/loginsRole")

public class SelectRoleController {
    @Autowired
    private RoleService roleService;


    @PostMapping("selectRole")
    public List<Account> selectRole(@RequestParam (value = "pageSize") Integer pageSize,
                                    @RequestParam(value = "pageNo") Integer pageNo){
        List<Account> accounts=roleService.selectRole((pageNo-1)*pageSize, pageSize);
        if(accounts!=null && accounts.size()>0){
            return  accounts;
        }else {
            return null;
        }
    }
}
