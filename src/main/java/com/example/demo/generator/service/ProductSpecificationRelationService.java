package com.example.demo.generator.service;

import com.example.demo.generator.domain.ProductDocumentRelation;
import com.example.demo.generator.domain.ProductSpecificationRelation;
import com.example.demo.generator.mapper.ProductSpecificationRelationMapper;
import com.example.demo.model.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class ProductSpecificationRelationService {
    @Autowired
    private ProductSpecificationRelationMapper productSpecificationRelationMapper;
    public List<ProductSpecificationRelation> select(List<Integer> productId){
        List<ProductSpecificationRelation> productSpecificationRelation=productSpecificationRelationMapper.selectProduct(productId);
        return productSpecificationRelation;
    }
    public ApiResult add(ProductSpecificationRelation productSpecificationRelation){
        productSpecificationRelationMapper.add(productSpecificationRelation);
        return ApiResult.success("200");
    }
}
