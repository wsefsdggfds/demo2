//package com.example.demo.shopping.label.controller;
//
//import com.example.demo.model.ApiResult;
//import com.example.demo.shopping.label.entiy.Label;
//import com.example.demo.shopping.label.mapper.LabelMapper;
//import com.example.demo.shopping.label.service.LabelServiceT;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/label")
//public class LabelController {
//    @Autowired
//    private LabelMapper labelMapper;
//    @Autowired
//    private LabelServiceT labelService;
//    @PostMapping("/insert")
//    public ApiResult insertLabel(@RequestBody Label label){
//        return labelService.insert(label);
//    }
//    @PostMapping("/delete")
//    public String deleteLabel(@RequestBody Label label){
//        labelMapper.delete(label);
//        return "删除成功";
//    }
//
//}
