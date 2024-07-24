//package com.example.demo.shopping.commodity.service;
//
//import com.example.demo.model.ApiResult;
//import com.example.demo.shopping.account.entity.Account;
//import com.example.demo.shopping.commodity.entiy.Commodity;
//import com.example.demo.shopping.commodity.mapper.CommodityMapper;
//import com.example.demo.shopping.specifications.entiy.Specifications;
//import com.example.demo.shopping.specifications.service.SpecificationsService;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.StringUtils;
//
//@Service
//public class CommodityService {
//    @Autowired
//    private CommodityMapper commodityMapper;
//    @Autowired
//    private SpecificationsService specificationsService;
//
//    //新增商品
//    public ApiResult insertCommodity(Commodity commodity,Specifications specifications) {
//        if (!StringUtils.isEmpty(commodity.getName())){
//            if (!StringUtils.isEmpty(commodity.getCarouselChart())){
//                if (commodity.getDescription().length()<101){
//                    if(!StringUtils.isEmpty(commodity.getClassification())){
//                        if (commodity.getLabel().size()<9){
//                                if (null!= commodity.getSpecifications() && commodity.getSpecifications().size()>0){
//
//                                    ApiResult insert = specificationsService.insert(specifications);
//                                    if ("200".equals(insert.getCode())){
//                                        commodityMapper.insertCommodity(commodity);
//                                        return ApiResult.failure("200");
//                                    }else {
//                                        return ApiResult.failure("商品填写不规范");
//                                    }
//                                }else {
//                                    return ApiResult.failure("商品规格不能为空");
//                                }
//                        }else {
//                            return ApiResult.failure("标签不能多余八个");
//                        }
//
//                    }else {
//                        return ApiResult.failure("请选择商品分类");
//                    }
//
//                }else {
//                    return ApiResult.failure("商品描述不能多于100字");
//                }
//            }else {
//                return ApiResult.failure("轮播图不能为空");
//            }
//        }else {
//            return ApiResult.failure("请输入商品名字");
//        }
//
//
//    }
//}
