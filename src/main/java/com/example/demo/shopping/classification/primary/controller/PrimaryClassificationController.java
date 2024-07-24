//package com.example.demo.shopping.classification.primary.controller;
//
//import com.example.demo.shopping.classification.primary.entiy.PrimaryClassification;
//import com.example.demo.shopping.classification.primary.mapper.PrimaryClassificationMapper;
//import com.example.demo.shopping.classification.primary.service.PrimaryService;
//import com.example.demo.shopping.commodity.entiy.Commodity;
//import com.example.demo.shopping.commodity.mapper.CommodityMapper;
//import com.example.demo.shopping.commodity.service.CommodityService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//@RestController
//@RequestMapping("/primary")
//
//public class PrimaryClassificationController {
//    @Autowired
//    private PrimaryService primaryService;
//    @Autowired
//    private PrimaryClassificationMapper primaryClassificationMapper;
//    @PostMapping("/update")
//    public String update(@RequestBody PrimaryClassification primaryClassification){
//        primaryClassificationMapper.updatePrimary(primaryClassification);
//        return "删除成功";
//    }
//    @PostMapping("/insert")
//    public String insert(@RequestBody PrimaryClassification primaryClassification){
//        primaryClassificationMapper.insertPrimary(primaryClassification);
//        return "添加成功";
//    }
//}
//
