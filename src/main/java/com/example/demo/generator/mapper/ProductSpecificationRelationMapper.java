package com.example.demo.generator.mapper;

import com.example.demo.generator.domain.ProductSpecificationRelation;

import java.util.ArrayList;
import java.util.List;

/**
* @author wwx92
* @description 针对表【product_specification_relation】的数据库操作Mapper
* @createDate 2024-07-14 21:01:37
* @Entity generator.domain.ProductSpecificationRelation
*/
public interface ProductSpecificationRelationMapper {
    //根据商品规格关系表查询规格id
    // select * from  product_specification_relation  where product_id in ('','')
    List<ProductSpecificationRelation> selectProduct(List<Integer> productId);
    int add(ProductSpecificationRelation productSpecificationRelation);


}




