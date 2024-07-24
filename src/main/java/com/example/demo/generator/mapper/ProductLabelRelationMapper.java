package com.example.demo.generator.mapper;

import com.example.demo.generator.domain.ProductLabelRelation;

import java.util.List;

/**
* @author wwx92
* @description 针对表【product_label_relation】的数据库操作Mapper
* @createDate 2024-07-14 21:01:37
* @Entity generator.domain.ProductLabelRelation
*/
public interface ProductLabelRelationMapper   {
    // select * from product_label_relation where product_id in ('','')
    List<ProductLabelRelation> select(List<Integer> productId);
    int add(ProductLabelRelation productLabelRelations);


}




