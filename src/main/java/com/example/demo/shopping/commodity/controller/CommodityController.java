//package com.example.demo.shopping.commodity.controller;
//
//import com.example.demo.model.ApiResult;
//import com.example.demo.shopping.account.entity.Account;
//import com.example.demo.shopping.account.mapper.AccountMapper;
//import com.example.demo.shopping.commodity.entiy.Commodity;
//import com.example.demo.shopping.commodity.mapper.CommodityMapper;
//import com.example.demo.shopping.commodity.service.CommodityService;
//import com.example.demo.shopping.service.AccountService;
//import com.example.demo.shopping.specifications.entiy.Specifications;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/commodity")
//public class CommodityController {
//        @Autowired
//        private CommodityService commodityService;
//        @Autowired
//        private CommodityMapper commodityMapper;
//        //新增商品
//        @PostMapping("/insert")
//        public ApiResult insert(@RequestBody Commodity commodity){
//
//            return commodityService.insertCommodity(commodity,null);
//        }
//}
