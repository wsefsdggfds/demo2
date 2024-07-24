package com.example.demo.generator.mapper;


import com.example.demo.generator.domain.ProductDocumentRelation;
import com.example.demo.generator.domain.ProductLabelRelation;

import java.util.List;

public interface ProductDocumentRelationMapper {
    // 根据商品id查找轮播图id
    // select * from  product_document_relation  where product_id in ('','')
    List<ProductDocumentRelation> selectByProductId(List<Integer> productId);
    int add(ProductDocumentRelation productDocumentRelation);

}
