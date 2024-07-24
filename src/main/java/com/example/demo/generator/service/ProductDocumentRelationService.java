package com.example.demo.generator.service;

import com.example.demo.generator.domain.ProductDocumentRelation;
import com.example.demo.generator.mapper.ProductDocumentRelationMapper;
import com.example.demo.model.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDocumentRelationService {
    @Autowired
    private ProductDocumentRelationMapper productDocumentRelationMapper;
    public List<ProductDocumentRelation> findDocument(List<Integer> productId){
        List<ProductDocumentRelation> productDocumentRelations=productDocumentRelationMapper.selectByProductId(productId);
        return productDocumentRelations;
    }
    public ApiResult add(ProductDocumentRelation productDocumentRelation ){
        productDocumentRelationMapper.add(productDocumentRelation);
        return ApiResult.success("200");
    }
}
