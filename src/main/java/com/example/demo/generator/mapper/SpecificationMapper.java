package com.example.demo.generator.mapper;

import com.example.demo.generator.domain.ProductSpecificationRelation;
import com.example.demo.generator.domain.Specification;
import com.example.demo.shopping.specifications.entiy.Specifications;

import java.util.List;

/**
* @author wwx92
* @description 针对表【specification】的数据库操作Mapper
* @createDate 2024-07-14 21:01:37
* @Entity generator.domain.Specification
*/
public interface SpecificationMapper   {
    List<Specification> getByProductId(List<Integer> specificationId);
    List<Specification> getPriceSpecifications(List<Integer> specificationId);

}




