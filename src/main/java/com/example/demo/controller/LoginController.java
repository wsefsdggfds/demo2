//package com.example.demo.controller;
//
//
//import com.example.demo.entity.AccountPassword;
//import com.example.demo.model.RegisterModel;
//import com.example.demo.service.LogService;
//import com.example.demo.service.LogOnService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/v1/service/login")
//public class LoginController {
//
//    @Autowired
//    private LogService logService;
//    @Autowired
//    private LogOnService logOnService;
//
//    @PostMapping("")
//    public String register(@RequestBody RegisterModel model){
//        logService.register(model);
//        return "";
//    }
//    @PostMapping("enroll")
//    public String Account(@RequestBody AccountPassword enroll){
//        logOnService.enroll(enroll);
//        return "登录成功";
//    }
//}
