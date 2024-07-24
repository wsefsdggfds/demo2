package com.example.demo.shopping.specifications.service;

import com.example.demo.model.ApiResult;
import com.example.demo.shopping.specifications.entiy.Specifications;
import com.example.demo.shopping.specifications.mapper.SpecificationsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class SpecificationsService {
    @Autowired
    private SpecificationsMapper specificationsMapper;
    public ApiResult insert(Specifications specifications){
        if (!StringUtils.isEmpty(specifications)){
            if (specifications.getAttribute().length()<20&&specifications.getAttribute().length()>2){
                if (specifications.getPromotionalPrice()>0.0){
                    if (!StringUtils.isEmpty(specifications.getPrice())){
                        if (specifications.getPrice()>0.0){
                            if (specifications.getPicture().length<2){
                                specificationsMapper.insertSpecifications(specifications);
                                return ApiResult.success("200");
                            }else {
                                return ApiResult.failure("图片不能超过两张");
                            }

                        }else {
                            return ApiResult.failure("商品定价必须是大于0的正数");
                        }

                    }else {
                        return ApiResult.failure("请输入商品定价");
                    }

                }else {
                    return ApiResult.failure("商品促销价格必须是大于0的正数");
                }
            }else {
                return ApiResult.failure("商品属性描述应在2~20字之间");
            }
        }else {
            return ApiResult.failure("请输入商品属性");
        }

    }
}
