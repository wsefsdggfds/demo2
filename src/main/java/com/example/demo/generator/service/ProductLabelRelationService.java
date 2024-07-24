package com.example.demo.generator.service;

import com.example.demo.generator.domain.ProductLabelRelation;
import com.example.demo.generator.mapper.ProductLabelRelationMapper;
import com.example.demo.model.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductLabelRelationService {
    @Autowired
    private ProductLabelRelationMapper productLabelRelationMapper;
    //根据商品id从商品标签表查询到标签id
    public List<ProductLabelRelation> get(List<Integer> productId){
        List<ProductLabelRelation> productLabelRelations=productLabelRelationMapper.select(productId);
        return productLabelRelations;
    }

    public ApiResult add(ProductLabelRelation productLabelRelations){
        productLabelRelationMapper.add(productLabelRelations);
        return ApiResult.success("200");
    }
}
